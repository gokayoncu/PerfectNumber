import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        int n, k;
        Scanner input = new Scanner(System.in);

        do {
            k = 0;
            System.out.print("Enter a number: ");
            n = input.nextInt();
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    k += i;
                }
            }
            if (k == n) {
                System.out.println(n + " is a perfect number.");
            } else {
                System.out.println(n + " isn't perfect number. ");
            }
        } while (n > 0);
    }
}
