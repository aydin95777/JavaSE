package javase02.t05;

public class Main {
    public static void main(String[] args) {
        StudentGroup<Integer> physicsGroup = Course.PHYSICS.createGroup();
        StudentGroup<Double> mathGroup = Course.MATH.createGroup();
        Student student = new Student("Ivan", "Ivanov");
        Student student1 = new Student("Anna", "Ivanova");
        physicsGroup.addStudent(student, 4);
        physicsGroup.addStudent(student1, 5);
        mathGroup.addStudent(student, 3.2);
        mathGroup.addStudent(student1, 5.0);
        student.showGroups();
    }

}
