import java.util.Scanner;

public class sostatkom {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число А = ");
        double a = scn.nextDouble();
        System.out.println("Введите число В = ");
        double b = scn.nextDouble();
        System.out.println("Сумма = " + (a + b));
        System.out.println("Разность= " + (a - b));
        System.out.println("Произведение= " + (a * b));
        System.out.println("Деление= " + (a / b));
    }
}
