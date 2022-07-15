package interfacesTask;

public class Student implements WritingableAtSchool, WritingableAtUniversity {

    @Override
    public void write() {
        WritingableAtUniversity.super.write();
    }
}