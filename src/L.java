import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt(); // вместимость сковороды
        int m = scanner.nextInt(); // время обжарки одной стороны
        int n = scanner.nextInt(); // количество котлет

        if (n <= k) {
            System.out.println(2 * m);
        } else {
            int time = ((2 * n + k - 1) / k) * m;
            System.out.println(time);
        }

        scanner.close();
    }
}