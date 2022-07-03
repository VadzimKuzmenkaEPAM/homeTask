package interfacesTask;

public class Student implements WriteConspectusAtSchool, WriteConspectusAtUniversity{

    @Override
    public void write() {
        WriteConspectusAtUniversity.super.write();
    }
}