package packages.uni;

import java.util.ArrayList;

public class Student {

    public int studentID;
    public static ArrayList<Student> studentList = new ArrayList<>();
    public int personID;
    public final int entranceYear;
    public int majorID;
    public String studentCode;

    public Student(int personID, int entranceYear, int majorID) {
        this.personID = personID;
        this.entranceYear = entranceYear;
        this.majorID = majorID;

        if (Major.findById(majorID) != null)
            Major.findById(majorID).addStudent();

        studentList.add(this);
        studentID = studentList.size();

        setStudentCode();
    }

    public static Student findById(int ID) {
        return studentList.get(ID - 1);
    }

    public void setStudentCode() {
        int year = entranceYear % 1000;
        String majorId = "";
        String studentId = "";
        int studentsOfMajor = 0;
        for (Student student : studentList) {
            if (student.majorID == this.majorID)
                studentsOfMajor++;
        }

        if (majorID < 10)
            majorId = "0" + String.valueOf(majorID);
        else
            majorId = String.valueOf(majorID);

        if (studentsOfMajor < 10)
            studentId = "0" + String.valueOf(studentsOfMajor);
        else
            studentId = String.valueOf(studentsOfMajor);

        studentCode = String.valueOf(year) + majorId + studentId;
    }
}
