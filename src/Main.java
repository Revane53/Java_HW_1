import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*============= exercise 1 =============*/
        System.out.print("============= exercise 1 =============\n");
        System.out.print("""
                "Your time is limited,
                  so don't waste if
                      living someone else's life"
                          Steve Jobs
                """);

        /*============= exercise 2 =============*/
        System.out.print("============= exercise 2 =============\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number\n");
        float a = in.nextFloat();
        System.out.print("Enter percent\n");
        float b = in.nextFloat();
        System.out.printf("%f percent of %f = %f\n", b, a, b/100*a);

        /*============= exercise 3 =============*/
        System.out.print("============= exercise 3 =============\n");
        System.out.print("Enter number one\n");
        int num_1 = in.nextInt();
        System.out.print("Enter number two\n");
        int num_2 = in.nextInt();
        System.out.print("Enter number three\n");
        int num_3 = in.nextInt();
        System.out.printf("Your number = %d\n", num_1*100 + num_2*10 + num_3);

        /*============= exercise 4 =============*/
        /*============= exercise 5 =============*/
        /*============= exercise 6 =============*/
        /*============= exercise 7 =============*/
        /*============= exercise 8 =============*/
        /*============= exercise 9 =============*/
        /*============= exercise 10 =============*/
    }
}