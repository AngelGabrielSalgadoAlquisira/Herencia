public class Person {
    private String name;
    private String LastName;
    private String email;
    private String address;

    //Constructor vacio//

    public Person() {
    }

    //Constructor parametrizado//

    public Person(String name, String lastName, String email, String address) {
        this.name = name;
        this.LastName = lastName;
        this.email = email;
        this.address = address;
    }

    //inician getter and setter//

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //Terminan los getter and setter//

}
