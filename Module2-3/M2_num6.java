import java.util.Scanner;

public class M2_num6 {

    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\tGav Wrangler Ramirez");
        System.out.print("\nEnter the Title: ");
        String title = scan.nextLine();
        System.out.print("Enter the Director's name: ");
        String name = scan.nextLine();
        System.out.print("Enter the Year: ");
        int year = scan.nextInt();
        System.out.print("Enter the Runtime: ");
        int runtime = scan.nextInt();
        System.out.print("Enter the Ratings: ");
        double ratings = scan.nextDouble();

        System.out.println("\nTitle: "+ title);
        System.out.println("Director: "+ name);
        System.out.println("Year: "+ year);
        System.out.println("Runtime: "+ runtime);
        System.out.println("Rating: "+ ratings);

        scan.close();
    }
}
