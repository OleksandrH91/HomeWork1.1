package Collections.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> carNumbers = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String carNumber = bufferedReader.readLine();


        while (!carNumber.equals("СТОП")) {
            if (carNumber.equals("СПИСОК")) {
                for (String s : carNumbers) {
                    System.out.println(s);
                }
            } else {
                carNumbers.add(carNumber);
            }
            carNumber = bufferedReader.readLine();
        }

    }
}
