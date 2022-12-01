package Collections.Task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<User> users = new ArrayList<>();

        users.add(new User(random.nextInt(10), "Alex", "Cross", random.nextInt(50)));
        users.add(new User(random.nextInt(10), "John", "Wick", random.nextInt(50)));
        users.add(new User(random.nextInt(10), "Jack", "Reacher", random.nextInt(50)));
        users.add(new User(random.nextInt(10), "James", "Bond", random.nextInt(50)));
        users.add(new User(random.nextInt(10), "Ethan", "Hunt", random.nextInt(50)));
        users.add(new User(random.nextInt(10), "Sherlock ", "Holmes", random.nextInt(50)));
        users.add(new User(random.nextInt(10), "John", "Watson", random.nextInt(50)));
        users.add(new User(random.nextInt(10), "Professor", "Moriarty", random.nextInt(50)));
        users.add(new User(random.nextInt(10), "Jack", "Ryan", random.nextInt(50)));
        users.add(new User(random.nextInt(10), "Jason", "Bourne", random.nextInt(50)));

        System.out.println("-------до сортировки--------");

        for (User user : users) {
            System.out.println(user);
        }

        Collections.sort(users);


        System.out.print("\n-------после сортировки-----\n");

        for (User user : users) {
            System.out.println(user);
        }
    }
}
