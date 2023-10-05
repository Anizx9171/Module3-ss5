public class Circle {
   private double radius;
   private String color;

    Circle(){}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public double area(){
        return Math.PI*radius*2;
    }

    public double parameter(){
        return Math.PI*radius*radius;
    }
}
