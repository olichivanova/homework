package homework.homowork1.task1;

public abstract class AbstractFigure implements Calcsquare, Perimeter {
    private  String name;

    public AbstractFigure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
