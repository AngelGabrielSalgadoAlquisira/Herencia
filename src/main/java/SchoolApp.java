public class SchoolApp {
    public static void main(String[] args) {
        Student studen1 = new Student("Juan","Perez","JuanGmail.com","Bandera nacional");
        studen1.setControlNumber(12345678);
        studen1.setGeneralAverage(89.9);
        studen1.setCareer("Ing. informatica");

        Teacher teacher = new Teacher("Maria","Morales","MariaGmail.com","Ruffo figueroa");
        teacher.setAdscription("Centro de computacion");
        teacher.setBiocard(24681012);
        teacher.setAssigned_Hours(10);

        // probando la sobrecarga de metodos
        System.out.println("=====Metodo toString() de student1===== \n" + studen1.toString());
        System.out.println("=====Metodo toString() de teacher===== \n" + teacher.toString());

        System.out.println("El student: " + studen1.soy());
        System.out.println("El teacher: " + teacher.soy());
    }
}
