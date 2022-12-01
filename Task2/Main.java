package Collections.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) throws IOException {
        LinkedList<String> carNumbers2 = new LinkedList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String carNumber = bufferedReader.readLine();

        while (!carNumber.equals("СТОП")) {
            if (carNumber.equals("СПИСОК")) {
                for (String s : carNumbers2) {
                    System.out.println(s);
                }
            } else {
                int carID = Integer.parseInt(bufferedReader.readLine());
                if (carID > carNumbers2.size()) {
                    carNumbers2.addLast(carNumber);
                } else {
                    carNumbers2.add(carID, carNumber);
                }
            }
            carNumber = bufferedReader.readLine();
        }
    }
}

