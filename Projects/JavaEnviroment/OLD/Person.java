public class Person {
    private String name;
    private String email;

    public String greet() {
        return "sendto: " + email + "Hi " + name + ",\n";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
