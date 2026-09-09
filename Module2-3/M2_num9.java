import java.util.Scanner;

public class M2_num9 {
    static void main() {
        Scanner scan = new Scanner(System.in);

        System.out.println("\tGav Wrangler Ramirez");
        System.out.print("\nUsername: ");
        String name = scan.nextLine();
        System.out.print("Character Name:");
        String charname = scan.nextLine();
        System.out.print("Level: ");
        int lvl = scan.nextInt();
        System.out.print("EXP Points: ");
        long exp = scan.nextLong();
        scan.nextLine();
        System.out.print("Rank: ");
        String rank = scan.next();

        System.out.println("\nUsername: "+name);
        System.out.println("Character Name: "+charname);
        System.out.println("Level: "+lvl);
        System.out.println("EXP: "+exp);
        System.out.println("Rank: "+rank);


        scan.close();
    }
}
