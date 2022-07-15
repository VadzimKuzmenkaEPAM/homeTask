package interfacesTask;

public class Schoolboy implements WritingableAtSchool, WritingableAtUniversity {
    @Override
    public void write() {
        WritingableAtSchool.super.write();

    }
}