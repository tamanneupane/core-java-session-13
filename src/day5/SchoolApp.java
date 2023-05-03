package day5;

public class SchoolApp {

    public static void main(String[] args) {
        Student ram = new Student();
        ram.setId(1);
        ram.setName("Ram");
        ram.setAge(16);
        ram.setGender(Gender.MALE);
        ram.setStudentClass("Ten");
        ram.takeLeave();

        Teacher hari = new Teacher();
        hari.setId(1);
        hari.setName("Ram");
        hari.setAge(16);
        hari.setGender(Gender.MALE);
        hari.setSalary(3000);
        hari.takeLeave();


        Staff shyam = new Staff();
        shyam.setId(1);
        shyam.setName("Ram");
        shyam.setAge(16);
        shyam.setGender(Gender.MALE);
        shyam.setSalary(1000);
        shyam.setTask("Cleaning");
        shyam.takeLeave();



    }
}
