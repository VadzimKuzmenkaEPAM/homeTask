package localClass;

public class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void doingWork() {
        System.out.println("Employee " + name + " " + "performs a job " + " on position " + position);

        class Job {
            final int experience = 2;

            public void doGodJob() {
                System.out.println("Employee " + name + " have a  " + experience +
                        " years of experience" + "performs a job "
                        + " on position " + position + " with high quality" + " ");
            }

            public void doBadJob() {
                System.out.println("Employee " + name + " " + "performs a job "
                        + " on position " + position + " with low quality");
            }
        }
        Job job = new Job();
        job.doBadJob();
        job.doGodJob();
    }
}