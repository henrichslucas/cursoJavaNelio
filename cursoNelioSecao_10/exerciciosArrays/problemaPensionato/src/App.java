import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");

        int n = sc.nextInt();
        sc.nextLine(); // limpando buffer

        Room rooms[] = new Room[10]; // dez quartos, como solicitado no entitulado da questao

        for (int i = 0; i < n; i++) {
            System.out.printf("Rent #%d %n", i + 1);

            System.out.print("Name: ");
            String ownerName = sc.nextLine();

            System.out.print("Email: ");
            String ownerEmail = sc.nextLine();

            System.out.print("Room: ");
            int number = sc.nextInt();
            sc.nextLine();

            rooms[number] = new Room(ownerName, ownerEmail, number);
        }

        System.out.println("Busy rooms: ");

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                System.out.printf("%d: %s, %s %n", rooms[i].getNumber(), rooms[i].getOwnerName(),
                        rooms[i].getOwnerEmail());
            }
        }

        sc.close();
    }
}
