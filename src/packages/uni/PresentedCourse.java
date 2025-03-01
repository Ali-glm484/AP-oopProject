package packages.uni;

import java.util.ArrayList;

public class PresentedCourse {

    public int presentedCourseID;
    public static ArrayList<PresentedCourse> presentedCoursesList = new ArrayList<>();
    public int courseID;
    public int professorID;
    public int maxCapacity;
    public ArrayList<Integer> studentIDList;

    public PresentedCourse(int courseID, int professorID, int maxCapacity) {
        this.courseID = courseID;
        this.professorID = professorID;
        this.maxCapacity = maxCapacity;

        studentIDList = new ArrayList<>(maxCapacity);

        presentedCoursesList.add(this);
        presentedCourseID = presentedCoursesList.size();
    }

    public static PresentedCourse findById(int ID) {
        return presentedCoursesList.get(ID - 1);
    }

    public void addStudent(int studentID) {
        if (studentIDList.size() < maxCapacity)
            studentIDList.add(studentID);
        else
            System.out.println("The capacity of the course has been full.");
    }
}
