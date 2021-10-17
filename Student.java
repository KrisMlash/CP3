

public class Student {  
    
    String name;
    String surname;
    int age;
    String studentId;
    boolean validId;
    String semesterNumber;
    String averageGrade;
    
    void sayHello(){
        System.out.println("Hello");
    }
    void displaySurname(){
        System.out.println(surname);
    }
    void displayAge(){
        System.out.println(age);
    }
    void displayNameNumberGrade(){
        System.out.println(name);
        System.out.println(semesterNumber);
        System.out.println(averageGrade);
    }
    void statusValid(){
        validId = !validId;
    }
    void displayNameIdValid(){
        System.out.println(name);
        System.out.println(studentId);
        System.out.println(validId);
    }
}
