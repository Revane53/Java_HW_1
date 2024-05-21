import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*============= exercise 1 =============*/
        {
            System.out.print("============= exercise 1 =============\n");
            System.out.print("""
                    "Your time is limited,
                      so don't waste if
                          living someone else's life"
                              Steve Jobs
                    """);
        }
        /*============= exercise 2 =============*/
        {
            System.out.print("============= exercise 2 =============\n");
            System.out.print("Enter number\n");
            float a = in.nextFloat();
            System.out.print("Enter percent\n");
            float b = in.nextFloat();
            System.out.printf("%f percent of %f = %f\n", b, a, b / 100 * a);
        }
        /*============= exercise 3 =============*/
        {
            System.out.println("============= exercise 3 =============");
            System.out.print("Enter number one\n");
            int num1 = in.nextInt();
            System.out.print("Enter number two\n");
            int num2 = in.nextInt();
            System.out.print("Enter number three\n");
            int num3 = in.nextInt();
            System.out.printf("Your number = %d\n", num1 * 100 + num2 * 10 + num3);
        }
        /*============= exercise 4 =============*/
        {
            System.out.println("============= exercise 4 =============");
            System.out.print("Enter enter a six-digit number\n");
            if(in.hasNextInt()){
                int num = in.nextInt();
                if((num+"").length() != 6){
                    System.out.println("Your number is not a 6 digit number");
                } else {
                    System.out.printf("New number is %d\n", num%10*100000 + num/10%10*10000 + num/100%100*100 + num/10000%10*10 + num/100000);
                }
            } else {
                System.out.println("You did not enter a number");
            }
        }
        /*============= exercise 5 =============*/
        {
            System.out.println("============= exercise 5 =============");
            System.out.println("Enter month number");
            if(in.hasNextInt()){
                int monthNum = in.nextInt();
                if(monthNum == 1 || monthNum == 2 || monthNum == 12){
                    System.out.println("Winter");
                } else if (monthNum >= 3 && monthNum <= 5) {
                    System.out.println("Spring");
                } else if (monthNum >= 6 && monthNum <= 8) {
                    System.out.println("Summer");
                } else if (monthNum >= 9 && monthNum <= 11) {
                    System.out.println("Autumn");
                } else {
                    System.out.println("You did not enter a valid month number");
                }
            } else {
                System.out.println("You did not enter a number");
            }
        }
        /*============= exercise 6 =============*/
        {
            System.out.println("============= exercise 6 =============");
            System.out.println("Enter meters");
            double meters = 0;
            int userChoice = 0;
            if (in.hasNextDouble()) {
                meters = in.nextInt();
            } else {
                System.out.println("You did not enter a number");
            }
            System.out.println("""                
                    Select which unit of measurement to convert to:
                    1 ---> mile
                    2 ---> inches
                    3 ---> yards
                    """);
            while (userChoice < 1 || userChoice > 3) {
                if (in.hasNextInt()) {
                    userChoice = in.nextInt();
                } else {
                    System.out.println("You did not enter a number");
                }
            }
            switch (userChoice) {
                case 1:
                    System.out.printf("%f meters = %f miles", meters, meters / 1609.344);
                case 2:
                    System.out.printf("%f meters = %f inches", meters, meters * 39.37);
                case 3:
                    System.out.printf("%f meters = %f yards", meters, meters * 1.09361);
            }
        }
        /*============= exercise 7 =============*/
        {
            System.out.println("============= exercise 7 =============");
            int num1 = 0, num2 = 0;
            System.out.println("Enter number one");
            System.out.println("Enter number two");
            if (in.hasNextDouble()) {
                num1 = in.nextInt();
                if (in.hasNextDouble()) {
                    num2 = in.nextInt();
                    if(num1 > num2){
                        int tmp = num2;
                        num2 = num1;
                        num1 = tmp;
                    }
                    for (int i = num1; i <= num2 ; i++) {
                        if(i % 2 > 0)
                            System.out.printf("%d ", i);
                    }
                } else {
                    System.out.println("You did not enter a number");
                }
            } else {
                System.out.println("You did not enter a number");
            }
        }
        /*============= exercise 8 =============*/
        {
            System.out.println("============= exercise 8 =============");
            int num1 = 0, num2 = 0;
            System.out.println("Enter number one");
            System.out.println("Enter number two");
            if (in.hasNextDouble()) {
                num1 = in.nextInt();
                if (in.hasNextDouble()) {
                    num2 = in.nextInt();
                    if(num1 > num2){
                        int tmp = num2;
                        num2 = num1;
                        num1 = tmp;
                    }
                    for (int i = num1; i <= num2 ; i++) {
                        for (int j = 1; j < 11; j++) {
                            System.out.printf("%d * %d = %d ", i, j, i * j);
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("You did not enter a number");
                }
            } else {
                System.out.println("You did not enter a number");
            }
        }
        /*============= exercise 9 =============*/
        {
            System.out.println("============= exercise 9 =============");
            int []array = {1,2,3,4,5,6,7,8,9,-2,-3,0,99,-91,11}; //15
            int minNum = Integer.MAX_VALUE;
            int maxNum = Integer.MIN_VALUE;
            int zeroCount = 0, minusCount = 0, plusCount = 0;
            for (int i = 0; i < 15; i++) {
                if(array[i] > maxNum)
                    maxNum = array[i];
                if(array[i] < minNum)
                    minNum = array[i];
                if(array[i] == 0)
                    zeroCount++;
                if (array[i] > 0)
                    plusCount++;
                if (array[i] < 0)
                    minusCount--;
            }
            System.out.printf("""
                    maximum number in array = %d
                    minimum number in array = %d
                    zero count in array = %d
                    positive count in array = %d
                    negative count in array = %d
                    """,maxNum,minNum,zeroCount,plusCount,minusCount);
        }
        /*============= exercise 10 =============*/
    }
}