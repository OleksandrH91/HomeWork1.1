package Collections.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        HashSet<String> carNumbers = new HashSet<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String carNumber = bufferedReader.readLine();


        while (!carNumber.equals("СТОП")) {
            if (carNumber.equals("СПИСОК")) {
                for (String s : carNumbers) {
                    System.out.println(s);
                }
            } else {
                if (!carNumbers.contains(carNumber)) {
                    carNumbers.add(carNumber);
                } else {
                    System.out.println("Машина с таким номером уже есть!");
                }
            }
            carNumber = bufferedReader.readLine();
        }
    }
}
