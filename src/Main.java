import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("To create a bank account,we need the following data:\n Your name:");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.print("Your ID:");
        int id = input.nextInt();
        System.out.print("Your balance:");
        int bal = input.nextInt();
        BankAcc client1= new BankAcc(name,id,bal);
        client1.showMenu();
    }
}
