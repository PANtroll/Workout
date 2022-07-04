package Workout;

public class MainExercises {

    private static Exercise[] exercises = new Exercise[10];
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

    public void setExercises(Exercise[] exercises) {
        this.exercises = exercises;
    }

    public void addExercise(Exercise e, Integer index) {
        exercises[index] = e;
    }
}
