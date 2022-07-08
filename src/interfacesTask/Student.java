package interfacesTask;

public class Student implements WritingNotesAtSchool, WritingConspectusAtUniversity {

    @Override
    public void write() {
        WritingConspectusAtUniversity.super.write();
    }
}