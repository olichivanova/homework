package homework.homowork1.task1;

import homework.homowork1.task1.IO.Console;
import homework.homowork1.task1.IO.ConsoleImp;

import java.io.IOException;

public class Task1 {
    private Console console;


    public Task1() {
        this.console = new ConsoleImp();
    }



    public void start(){
        while (true){

            System.out.println(console.MENU_LEGENT);
            System.out.println("Please, press the number");
            String number = " ";
            try{number = console.readLine();
        } catch (Exception e )
            {e.printStackTrace();}
            if (number == null)
                break;
            try {
            switch (number){
                case "1" :
                    System.out.println("Please, write down a radius");
                    double radius = console.readDouble();
                    AbstractFigure figure = new Circle("circle", radius);
                    System.out.println("Perimeter = " + figure.calcPerimeter());
                    System.out.println("Square = " + figure.calcSquare());
                    break;
                case "2" :
                    System.out.println("Please, write down a side A");
                    double sideA = console.readDouble();
                    System.out.println("Please, write down a side B");
                    double sideB = console.readDouble();
                    AbstractFigure figure1 = new Rectangle( "rectangle", sideA, sideB);
                    System.out.println("Perimeter = " + figure1.calcPerimeter());
                    System.out.println("Square = " + figure1.calcSquare());
                    break;
                case "3" :
                    System.out.println("Please, write down a side");
                    double side = console.readDouble();
                    AbstractFigure figure2 = new Square("square", side);
                    System.out.println("Perimeter = " + figure2.calcPerimeter());
                    System.out.println("Square = " + figure2.calcSquare());
                    break;


            }}
            catch (Exception e){e.getMessage();}
        }
    }
}
