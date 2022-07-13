import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;
import security.Authentication;
import security.SecurityRepo;

public class AuthenticationTest {

    // creamos nuestro objeto mock
    SecurityRepo securityRepoMock = Mockito.mock(SecurityRepo.class);
    Authentication authentication = new Authentication();

    @BeforeEach
    public void setup(){
        // configuración del objeto mock
        // Credenciales
        Mockito.when(securityRepoMock.verifyCredentials("admin", "123")).thenReturn(true);
        Mockito.when(securityRepoMock.verifyCredentials("admin", "XXX")).thenReturn(false);

        Mockito.when(securityRepoMock.verifyCredentials("supervisor", "456")).thenReturn(true);
        Mockito.when(securityRepoMock.verifyCredentials("usr", "789")).thenReturn(true);

        // configuración del objeto mock
        // Permisos
        Mockito.when(securityRepoMock.getPermisos("admin")).thenReturn("CRUD");
        Mockito.when(securityRepoMock.getPermisos("supervisor")).thenReturn("CRU");
        Mockito.when(securityRepoMock.getPermisos("usr")).thenReturn("R");

        // setear el objeto mock
        authentication.setSecurityRepo(securityRepoMock);
    }

    /*
    @AfterAll
    public void verifyingMock(){
        // Garantizar que utilizamos el objeto mock. Verificación.
        Mockito.verify(securityRepoMock).verifyCredentials("admin", "123");
        Mockito.verify(securityRepoMock).verifyCredentials("supervisor", "456");
        Mockito.verify(securityRepoMock).verifyCredentials("usr", "789");

        Mockito.verify(securityRepoMock).getPermisos("admin");
        Mockito.verify(securityRepoMock).getPermisos("supervisor");
        Mockito.verify(securityRepoMock).getPermisos("usr");
    }*/

    @Test
    public void loginUserTestWithMockSuccess(){

        // Usuario: admin
        String resultadoEsperado = "User authenticated successfully with permissions: CRUD";
        String resultado = authentication.loginUser("admin", "123");
        Assertions.assertEquals(resultadoEsperado, resultado, "Error. La autenticación falló.");
    }

    @Test
    public void loginUserTestWithMockFail(){

        // Usuario: admin
        String resultadoEsperado = "User or password incorrect";
        String resultado = authentication.loginUser("admin", "XXX");
        Assertions.assertEquals(resultadoEsperado, resultado, "Error. La autenticación falló.");
    }
}
