package consoleApplication;

public class Exercise {

    private String name;
    private Integer series;
    private Integer repeats;

    public Exercise(String name, Integer series, Integer repeats) {
        this.name = name;
        this.series = series;
        this.repeats = repeats;
    }

    @Override
    public String toString() {
        return "Exercise{" + "name='" + name + '\'' + ", series=" + series + ", repeats=" + repeats + '}';
    }

    public String toLog() {

        return name + "\t" + " Series: " + series + "\tPowtórzeń: " + repeats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public Integer getRepeats() {
        return repeats;
    }

    public void setRepeats(Integer repeats) {
        this.repeats = repeats;
    }
}
