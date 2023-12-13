package web.model;

public class Car {
    private String name;
    private String color;
    private int serial;

    public Car(String name, String color, int serial) {
        this.name = name;
        this.color = color;
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Car{" +
               "name='" + name + '\'' +
               ", color='" + color + '\'' +
               ", serial=" + serial +
               '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }
}
