import java.util.Scanner;

public class minus {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число А = ");
        int a = scn.nextInt();
        System.out.println("Введите число В = ");
        int b = scn.nextInt();
        System.out.println("Разность= " + (a - b));
        System.out.println("Произведение= " + (a * b));
        System.out.println("Деление= " + (a / b));
    }
}

