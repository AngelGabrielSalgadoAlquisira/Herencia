public class Teacher extends Person {
    private String Adscription;
    private int biocard;
    private double Assigned_Hours;

    public Teacher() {
    }

    public Teacher(String name, String lastName, String email, String address) {
        super(name, lastName, email, address);
    }

    public Teacher(String name, String lastName, String email, String address, String adscription, int biocard, double assigned_Hours) {
        super(name, lastName, email, address);
        this.Adscription = adscription;
        this.biocard = biocard;
        this.Assigned_Hours = assigned_Hours;
    }

    public String getAdscription() {
        return Adscription;
    }

    public void setAdscription(String adscription) {
        Adscription = adscription;
    }

    public int getBiocard() {
        return biocard;
    }

    public void setBiocard(int biocard) {
        this.biocard = biocard;
    }

    public double getAssigned_Hours() {
        return Assigned_Hours;
    }

    public void setAssigned_Hours(double assigned_Hours) {
        Assigned_Hours = assigned_Hours;
    }

    public String toString() {
        String texto = "La maestra " + getName() + " " + getLastName() +
                "\n con el correo electronico " +getEmail() +
                "\n y la direccion " + getAddress() +
                "\n Esta abscripta en " + getAdscription() +
                "\n con el numero de registro " + getBiocard() +
                "\n en un periodo de horas de " + getAssigned_Hours();
                return texto;
    }
    public String soy() {
        return "Una persona y un maestro";
    }
}



