package interfacesTask;

public interface WritingableAtSchool{
    default void write() {
        System.out.println("I writing conspectus at school");
    }

    private void getGrade() {
        System.out.println("Grade = 2");
    }

    static void getSatisfaction() {
        System.out.println("yes");
    }



}