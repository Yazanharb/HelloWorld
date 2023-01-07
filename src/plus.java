import java.util.Scanner;

public class plus {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число А = ");
        int a = scn.nextInt();
        System.out.println("Введите число В = ");
        int b = scn.nextInt();
        System.out.println("Сумма = " + (a + b));
    }
}
