package homework.homowork1.task1.IO;

import java.io.IOException;

public interface Console {
    String MENU_LEGENT =
                    "\t1. create a circle\n" +
                    "\t2. create a rectangle\n" +
                    "\t3. create a square\n" ;


    String readLine() throws IOException;
    double readDouble() throws IOException, NumberFormatException;
}
