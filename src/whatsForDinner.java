import java.util.Random;
import java.util.Scanner;

public class whatsForDinner {
    public static void main(String[] args) {
        System.out.println("Type anything and press 'Enter' to determine dinner");

        Scanner scan = new Scanner(System.in);
        scan.next();
        scan.close();

        Random rand = new Random();
        int r = rand.nextInt(15);


        if(r == 0) {
            System.out.println("Filipino");
        } else if (r == 1) {
            System.out.println("Vietnamese");
        }else if (r == 2) {
            System.out.println("Korean");
        }else if (r == 3) {
            System.out.println("Japanese");
        }else if (r == 4) {
            System.out.println("Jamaican");
        }else if (r == 5) {
            System.out.println("Indian");
        }else if (r == 6) {
            System.out.println("English");
        }else if (r == 7) {
            System.out.println("Wings");
        }else if (r == 8) {
            System.out.println("Italian");
        }else if (r == 9) {
            System.out.println("Taiwanese");
        }else if (r == 10) {
            System.out.println("Chinese");
        }else if (r == 11) {
            System.out.println("Thai");
        }else if (r == 12) {
            System.out.println("Peri Peri");
        }else if (r == 13) {
            System.out.println("Persian");
        }else if (r == 14) {
            System.out.println("French");
        }
    }
}
