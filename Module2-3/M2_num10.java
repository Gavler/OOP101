import java.util.Scanner;

public class M2_num10 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        System.out.println("\tGav Wrangler Ramirez");
        System.out.print("\nEmployee Name: ");
        String name = scan.nextLine();
        System.out.print("Employee ID: ");
        String id = scan.next();
        scan.nextLine();
        System.out.print("Position: ");
        String position = scan.nextLine();
        System.out.print("Work Hours: ");
        double hours = scan.nextDouble();
        System.out.print("Hourly Rate: ");
        double rate = scan.nextDouble();

        System.out.println("\nName: "+name);
        System.out.println("ID: "+id);
        System.out.println("Position: "+position);
        System.out.println("Work Hours: "+hours);
        System.out.println("Rate: "+rate);

        scan.close();
    }

}
