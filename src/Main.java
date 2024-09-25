import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isRaining = false;
        boolean isSunny = true;
        int b = 2;

        // if (true == false) or if (true != true)
        if (!isSunny) {
            System.out.println("Its not sunny");
        }

        // Same as above
        if (isSunny == false) {
            System.out.println("Its not sunny");
        }

        for (int i = 0; i < b; i++) {
            if (isRaining && isSunny) {
                System.out.println("Its sunny and its raining!");
            }
            else {
                System.out.println("Its raining! It will always be raining!");
                isRaining = true;
            }
        }

        int a = 5;
        int c = ++a; // 5 + 1, then c = 6
        int d = a++; // c = 5, then 5 + 1

        // Basic if else statement
        int age = 25;
        if (age >= 25) {
            System.out.println("Too old to live");
        }
        else {
            System.out.println("Too young to live");
        }

        // Ternary operator = same as above
        String access = (age >= 25) ? "Too old to live":"Too young to live";
        System.out.println(access);

        int dayNumber = scanner.nextInt();
        while (dayNumber != 8) {
            switch (dayNumber) {
                case 1:
                    System.out.println("Wrong day to live");
                    break;
                case 2:
                    System.out.println("Another day to live");
                    break;
                case 3:
                    System.out.println("Another day to work");
                    break;
                case 4:
                    System.out.println("Pathetic day to live");
                    break;
                case 5:
                    System.out.println("A good day to get drunk");
                    break;
                case 6:
                    System.out.println("A good day to celebrate");
                    break;
                case 7:
                    System.out.println("The day when you are devastated");
                default:
                    System.out.println("Day to think what you have done in a week");
                    break;
            }
            dayNumber = scanner.nextInt();
        }


    }
}