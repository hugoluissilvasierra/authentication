import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import security.Authentication;
import security.AuthenticationStatic;
import security.SecurityStaticRepo;


public class AuthenticationStaticTest {

    MockedStatic<SecurityStaticRepo> securityStaticRepoMockedStaticRepoMock;

    AuthenticationStatic authentication = new AuthenticationStatic();

    @BeforeEach
    public void setup(){
        securityStaticRepoMockedStaticRepoMock= Mockito.mockStatic(SecurityStaticRepo.class);

        // configuración del objeto mock
        // Credenciales
        securityStaticRepoMockedStaticRepoMock.when(()->SecurityStaticRepo.verifyCredentials("admin", "123")).thenReturn(true);
        securityStaticRepoMockedStaticRepoMock.when(()->SecurityStaticRepo.verifyCredentials("admin", "XXX")).thenReturn(false);

        securityStaticRepoMockedStaticRepoMock.when(()->SecurityStaticRepo.verifyCredentials("supervisor", "456")).thenReturn(true);
        securityStaticRepoMockedStaticRepoMock.when(()->SecurityStaticRepo.verifyCredentials("usr", "789")).thenReturn(true);

        // configuración del objeto mock
        // Permisos
        securityStaticRepoMockedStaticRepoMock.when(()->SecurityStaticRepo.getPermisos("admin")).thenReturn("CRUD");
        securityStaticRepoMockedStaticRepoMock.when(()->SecurityStaticRepo.getPermisos("supervisor")).thenReturn("CRU");
        securityStaticRepoMockedStaticRepoMock.when(()->SecurityStaticRepo.getPermisos("usr")).thenReturn("R");
    }

    @Test
    public void loginUserTestWithMockSuccess(){

        // Usuario: admin
        String resultadoEsperado = "User authenticated successfully with permissions: CRUD";
        String resultado = authentication.loginUser("admin", "123");
        Assertions.assertEquals(resultadoEsperado, resultado, "Error. La autenticación falló.");

        // evitar problemas de creacion sobre el mismo metodo estatico
        securityStaticRepoMockedStaticRepoMock.close();
    }

    @Test
    public void loginUserTestWithMockFail(){

        // Usuario: admin
        String resultadoEsperado = "User or password incorrect";
        String resultado = authentication.loginUser("admin", "XXX");
        Assertions.assertEquals(resultadoEsperado, resultado, "Error. La autenticación falló.");

        // evitar problemas de creacion sobre el mismo metodo estatico
        securityStaticRepoMockedStaticRepoMock.close();
    }

}
