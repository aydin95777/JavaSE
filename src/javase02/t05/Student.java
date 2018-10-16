package javase02.t05;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String secondName;
    private ArrayList<StudentGroup> groupList;

    public Student(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        groupList = new ArrayList<>();
    }

    public void addGroup(StudentGroup studentGroup) {
        groupList.add(studentGroup);
    }

    public void showGroups() {
        for (StudentGroup studentGroup : groupList) {
            studentGroup.studentOut(this);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }
}
