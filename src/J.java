import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int costInKopecks = a * 100 + b;
        int paidInKopecks = c * 100 + d;

        int changeInKopecks = paidInKopecks - costInKopecks;

        int e = changeInKopecks / 100;
        int f = changeInKopecks % 100;

        System.out.println(e + " " + f);

        scanner.close();
    }
}