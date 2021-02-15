package homework.homowork1.task1.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleImp implements Console {
  private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    @Override
    public String readLine() throws IOException {
        return reader.readLine();
    }

    @Override
    public double readDouble() throws IOException, NumberFormatException{
        return Double.parseDouble(reader.readLine());
    }
}
