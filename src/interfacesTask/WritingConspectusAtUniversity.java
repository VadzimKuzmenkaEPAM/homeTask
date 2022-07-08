package interfacesTask;

public interface WritingConspectusAtUniversity {

    private void gettingGrade() {
        System.out.println("Grade = 2");
    }

    default void write() {
        System.out.println("I writing conspectus at university");
    }

}