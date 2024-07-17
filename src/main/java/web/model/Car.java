package web.model;

public class Car {
    private String color;
    private int year;
    private String Engine;

    public Car() {
    }

    public Car(String color, int year, String engine) {
        this.color = color;
        this.year = year;
        Engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String engine) {
        Engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", year=" + year +
                ", Engine='" + Engine + '\'' +
                '}';
    }
}
