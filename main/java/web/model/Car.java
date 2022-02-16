package web.model;

import java.util.Objects;

import static java.util.Objects.hash;

public class Car {
    private String model;
    private String color;
    private int maxSpeed;

    public Car() {

    }

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Car car = (Car) obj;
        return
                (Objects.equals(model, car.model)
                        || (model != null && model.equals(car.getModel()))) && (Objects.equals(color, car.color)
                        || (color != null && color.equals(car.getColor())
                ));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = (int) (prime * result + (hash(model)+hash(color)));
        result = prime * result + ((color == null) ? 0 : (color.hashCode() >>> 31));
        return result;
    }
}
