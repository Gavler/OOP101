import java.lang.classfile.instruction.NewMultiArrayInstruction;
import java.sql.SQLOutput;
import java.util.Scanner;

public class M2_num8 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\tGav Wrangler Ramirez");
        System.out.print("\nStudent Name: ");
        String name = scan.nextLine();
        System.out.print("Course Code: ");
        String code = scan.next();
        scan.nextLine();
        System.out.print("Subject Title: ");
        String title = scan.nextLine();
        System.out.print("Units: ");
        int num = scan.nextInt();
        System.out.print("Section: ");
        char section = scan.next().charAt(0);

        System.out.println("\nName: "+name);
        System.out.println("Code: "+code);
        System.out.println("Title: "+title);
        System.out.println("Units: "+num);
        System.out.println("Section: "+section);

        scan.close();
    }
}
