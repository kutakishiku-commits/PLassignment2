import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int x2 = input.nextInt();
        int y1 = input.nextInt();
        int y2 = input.nextInt();
        if (x1 == y1 || x2 == y2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}