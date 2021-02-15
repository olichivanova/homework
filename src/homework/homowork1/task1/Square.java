package homework.homowork1.task1;

public class Square extends AbstractFigure implements Calcsquare, Perimeter{
    private double side;

    public Square(String name, double side) {
        super(name);
        this.side = side;
    }

    @Override
    public double calcSquare() {
        return side*side;
    }

    @Override
    public double calcPerimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
