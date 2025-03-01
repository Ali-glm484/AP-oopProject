package packages.uni;

import packages.base.Person;

import java.util.HashMap;

public class Transcript {

    public int studentID;
    public HashMap<Integer, Double> transcript;

    public Transcript(int studentID) {
        this.studentID = studentID;
        transcript = new HashMap<>();
    }

    public void setGrade(int presentedCourseID, double grade) {
        PresentedCourse presentedcourse = PresentedCourse.findById(presentedCourseID);
        if (presentedcourse != null) {
            for (int studentId : presentedcourse.studentIDList) {
                if (studentId == studentID)
                    transcript.put(presentedCourseID, grade);
            }
        }
    }

    public void printTranscript() {
        Student student = Student.findById(studentID);
        Person person = Person.findById(Student.findById(studentID).personID);
        if (student != null) {
            if (person != null) {
                System.out.println("Name: " + person.name + " | Student Code: "+ student.studentCode);
                for (Integer courseID : transcript.keySet()) {
                    System.out.println(Course.findById(PresentedCourse.findById(courseID).courseID).title
                            + " : " + transcript.get(courseID));
                }
            } else {
                System.out.println("This person dose not exist.");
            }
        } else {
            System.out.println("This student dose not exist.");
        }
    }

    public double grtGPA() {
        double sum = 0;
        int units = 0;

        for (Integer courseID : transcript.keySet()) {
            int unitsOfCourse = Course.findById(PresentedCourse.findById(courseID).courseID).units;
            sum += transcript.get(courseID) * unitsOfCourse;
            units += unitsOfCourse;
        }

        return sum / units;
    }
}
