package interfacesTask;

public class Schoolboy implements WriteConspectusAtSchool, WriteConspectusAtUniversity {
    @Override
    public void write() {
        WriteConspectusAtSchool.super.write();

    }
}