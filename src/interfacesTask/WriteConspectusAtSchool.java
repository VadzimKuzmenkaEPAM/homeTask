package interfacesTask;

public interface WriteConspectusAtSchool {
    default void write() {
        System.out.println("I writing conspectus at school");
    }

    private void gettingGrade() {
        System.out.println("Grade = 2");
    }

    static void gettingSetisfaction() {
        System.out.println("yes");
    }


}