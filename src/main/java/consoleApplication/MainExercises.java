package consoleApplication;

public class MainExercises {

    private final Exercise[] exercises = new Exercise[10];
    private String name;

    public MainExercises(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Exercise[] getExercises() {
        return exercises;
    }

    public Exercise getExercise(int index) {
        return exercises[index];
    }

    public void addExercise(Exercise e, Integer index) {
        exercises[index] = e;
    }
}
