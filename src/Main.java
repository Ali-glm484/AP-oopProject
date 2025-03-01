import packages.base.Person;
import packages.uni.*;

public class Main {
    public static void main(String[] args) {

        Major major1 = new Major("mathematics", 20);
        Major major2 = new Major("physics", 30);

        Person person1 = new Person("ali", "0721031720");
        Person person2 = new Person("reza", "0723091822");
        Person person3 = new Person("yasin", "0213662411");
        Person person4 = new Person("hosein", "0826019533");
        Person person5 = new Person("abbas", "0451256944");

        Student student1 = new Student(1, 1403, 1);
        Student student2 = new Student(2, 1402, 1);
        Student student3 = new Student(3, 1401, 2);

        String nameOfStudent1 = "";
        String nameOfStudent2 = "";
        String nameOfStudent3 = "";

        if (Person.findById(student1.personID) != null) {
            nameOfStudent1 = Person.findById(student1.personID).name;
        } else {
            nameOfStudent1 = "This person does not exist.";
        }
        if (Person.findById(student2.personID) != null) {
            nameOfStudent2 = Person.findById(student2.personID).name;
        } else {
            nameOfStudent2 = "This person does not exist.";
        }
        if (Person.findById(student3.personID) != null) {
            nameOfStudent3 = Person.findById(student3.personID).name;
        } else {
            nameOfStudent3 = "This person does not exist.";
        }

        String studentCode1 = student1.studentCode;
        String studentCode2 = student2.studentCode;
        String studentCode3 = student3.studentCode;

        System.out.println("Name: " + nameOfStudent1 + " | Student Code: " + studentCode1);
        System.out.println("Name: " + nameOfStudent2 + " | Student Code: " + studentCode2);
        System.out.println("Name: " + nameOfStudent3 + " | Student Code: " + studentCode3);
        System.out.println();

        Professor professor1 = new Professor(4, 1);
        Professor professor2 = new Professor(5, 2);

        String nameOfProfessor1 = "";
        String nameOfProfessor2 = "";

        if (Person.findById(professor1.personID) != null) {
            nameOfProfessor1 = Person.findById(professor1.personID).name;
        } else {
            nameOfProfessor1 = "This person does not exist.";
        }
        if (Person.findById(professor2.personID) != null) {
            nameOfProfessor2 = Person.findById(professor2.personID).name;
        } else {
            nameOfProfessor2 = "This person does not exist.";
        }

        String professorId1 = String.valueOf(professor1.professorID);
        String professorId2 = String.valueOf(professor2.professorID);

        System.out.println("Name: " + nameOfProfessor1 + " | Professor ID: " + professorId1);
        System.out.println("Name: " + nameOfProfessor2 + " | Professor ID: " + professorId2);
        System.out.println();

        Course course1 = new Course("BP", 3);
        Course course2 = new Course("AP", 3);
        Course course3 = new Course("DS", 3);

        PresentedCourse presentedCourse1 = new PresentedCourse(1, 1, 20);
        PresentedCourse presentedCourse2 = new PresentedCourse(2, 1, 25);
        PresentedCourse presentedCourse3 = new PresentedCourse(3, 2, 30);

        presentedCourse1.addStudent(1);
        presentedCourse1.addStudent(2);

        presentedCourse2.addStudent(1);
        presentedCourse2.addStudent(2);
        presentedCourse2.addStudent(3);

        presentedCourse3.addStudent(3);

        Transcript transcriptOfStudent1 = new Transcript(1);
        Transcript transcriptOfStudent2 = new Transcript(2);
        Transcript transcriptOfStudent3 = new Transcript(3);

        transcriptOfStudent1.setGrade(1, 17);
        transcriptOfStudent1.setGrade(2, 18.5);

        transcriptOfStudent2.setGrade(1, 19);
        transcriptOfStudent2.setGrade(2, 20);

        transcriptOfStudent3.setGrade(2, 12);
        transcriptOfStudent3.setGrade(3, 14.3);

        transcriptOfStudent1.printTranscript();
        System.out.println("The GPA: " + transcriptOfStudent1.grtGPA());
        System.out.println();
        transcriptOfStudent2.printTranscript();
        System.out.println("The GPA: " + transcriptOfStudent2.grtGPA());
        System.out.println();
        transcriptOfStudent3.printTranscript();
        System.out.println("The GPA: " + transcriptOfStudent3.grtGPA());
        System.out.println();
    }
}