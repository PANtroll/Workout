package Workout;

public class MainExercises {

    private String name;
    private Exercise[] exercises;

    public MainExercises(String name, Exercise[] exercises) {
        this.name = name;
        this.exercises = exercises;
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
