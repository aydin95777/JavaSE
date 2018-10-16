package javase02.t05;

public enum Course {
    MATH,
    PHYSICS,
    HISTORY,
    BIOLOGY;

    public <T extends Number> StudentGroup<T> createGroup() {
        return new StudentGroup<T>(this);
    }
}
