import java.util.Scanner;

public class M2_num7 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\tGav Wrangler Ramirez");
        System.out.print("\nAccount Holder: ");
        String name = scan.nextLine();
        System.out.print("Account Number: ");
        String num = scan.next();
        System.out.print("Account type: ");
        String type = scan.nextLine();
        System.out.print("Balance: ");
        double balance = scan.nextDouble();

        System.out.println("\nHolder: "+ name);
        System.out.println("Number: "+ num);
        System.out.println("Type: "+type);
        System.out.println("Balance: PHP "+balance);

        scan.close();

    }
}
