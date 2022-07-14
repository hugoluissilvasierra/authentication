package runner;

public class Persona {
    private String name;
    private String phone;
    private String address;
    private String ci;

    public Persona() {
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getCi() {
        return ci;
    }

    public Persona setName(String name) {
        this.name = name;
        return this;
    }

    public Persona setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Persona setAddress(String address) {
        this.address = address;
        return this;
    }

    public Persona setCi(String ci) {
        this.ci = ci;
        return this;
    }
}
