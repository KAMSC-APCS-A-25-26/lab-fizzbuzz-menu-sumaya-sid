import java.util.Scanner;

// DO NOT CHANGE THE CLASS NAME, IT WILL BREAK THE AUTO GRADER
public class FizzBuzzMenu
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        boolean run = true;

        while (run)
        {
            // Display menu
            System.out.println("\n\n----FizzBuzz Menu----");

            // Output options
            System.out.println("1. Buzz (Multiples of 3)");
            System.out.println("2. Fizz (Multiples of 5)");
            System.out.println("3. FizzBuzz (Multiples of 3 and 5)");
            System.out.println("4. Exit");

            // Prompt user
            System.out.print("Enter your choice:  ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (int j = 1; j < 101; j++) {
                        if (j % 3 == 0) {
                            System.out.print(j + " ");
                        }
                        j++;
                    }
                    break;
                case 2:
                    for (int j = 1; j < 101; j++) {
                        if (j % 5 == 0)
                        {
                            System.out.print(j + " ");
                        }
                        j++;
                    }
                    break;
                case 3:
                    for (int j = 1; j < 101; j++)
                    {
                        if (j%5 == 0 & j%3 ==0)
                        {
                            System.out.print(j + " ");
                        }
                        j++;
                    }
                    break;
                case 4:
                    System.out.print("Goodbye!");
                    run = false;
                    break;
            }
        }
    }
}
