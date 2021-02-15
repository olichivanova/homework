package homework.homowork1.task1;

public class Circle extends AbstractFigure implements Calcsquare, Perimeter {
    private  double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calcPerimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    public double calcSquare() {

        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
