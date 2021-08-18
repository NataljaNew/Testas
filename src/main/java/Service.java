import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Service {
    Map<Integer, Person> map = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    public void menu() {
        do {
            System.out.println(" _______________________________");
            System.out.println("|    [1]   user registration    |");
            System.out.println("|    [2]   print all users      |");
            System.out.println("|    [3]   exit                 |");
            System.out.println("|_______________________________|");
            System.out.println("Enter [1], [2] or [3]");
            String input = sc.next();
            switch (input) {
                case "1" -> {
                    System.out.println("*** User Registration ***");
                    registration();
                }
                case "2" -> {
                    System.out.println(map.toString());
                }
                case "3" -> System.exit(0);
                default -> System.out.println("something went wrong, try again.");
            }
        } while (true);
    }

    public void registration() {
        int key = getUniqueID ();
        System.out.println("Please enter your name:");
        String name = sc.next();
        System.out.println("Please enter your surname:");
        String surname = sc.next();
        map.put(key, new Person(name,surname,key));
        System.out.println("Registration successful");
        System.out.println("number of users registered " + map.size());
    }

    public int getUniqueID() {
        System.out.println("Imeskite jusu asmens koda: ");
        int personalID = 0;
        do {
            int idCheck = getValidNumber();
            if (map.get(idCheck) == null) {
                personalID= idCheck;
            } else {
                System.out.println("This personal number already exists, please check your personal number and try again");
            }
        } while (personalID == 0);
        return personalID;
    }

    public int getValidNumber() {
        int numberCheck = 0;
        System.out.println("Enter it here:");
        String number = sc.next();
        try {
            numberCheck = parseInt(number);
        } catch (NumberFormatException e) {
            System.out.println("Your number is invalid. Try again.");
            getValidNumber();
        }
        return numberCheck;
    }
}

