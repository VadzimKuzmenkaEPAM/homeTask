package interfacesTask;

public class Schoolboy implements WritingNotesAtSchool, WritingConspectusAtUniversity {
    @Override
    public void write() {
        WritingNotesAtSchool.super.write();

    }
}