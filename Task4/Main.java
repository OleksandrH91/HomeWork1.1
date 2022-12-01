package Collections.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, String> carNumbersAndOwners = new HashMap<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String carNumber = bufferedReader.readLine();

        while (!carNumber.equals("СТОП")) {
            if (carNumber.equals("СПИСОК")) {
                Set<Map.Entry<String, String>> entries = carNumbersAndOwners.entrySet();
                for (Map.Entry<String, String> pair : entries) {
                    System.out.println(pair.getKey() + " " + pair.getValue());
                }
            } else if (carNumber.equals("ВЛАДЕЛЬЦЫ")) {
                for (String owner : carNumbersAndOwners.values()) {
                    System.out.println(owner);
                }
            } else if (carNumber.equals("АВТОМОБИЛИ")) {
                for (String number : carNumbersAndOwners.keySet()) {
                    System.out.println(number);
                }
            } else {
                String carOwner = bufferedReader.readLine();
                carNumbersAndOwners.put(carNumber, carOwner);
            }
            carNumber = bufferedReader.readLine();
        }
    }
}