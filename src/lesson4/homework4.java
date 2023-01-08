package lesson4;

import java.util.Random;

public class homework4 {
    public static void main(String[] args) {
        Random random = new Random();
        double a = random.nextInt(5);
        System.out.println("Число а :" + a);
        double b = random.nextInt(10);
        System.out.println("Число b :" + b);
        double c = random.nextInt(1000);
        System.out.println("Число c :" + c);
        System.out.println("Сумма = " + (a + b));
        System.out.println("Разность = " + (a - b));
        System.out.println("Произведение = " + (a * b));
        System.out.println("Деление = " + (a / b));
        if (b == 0) {
            try {
                System.out.println("На ноль делить нельзя");
            } catch (Exception e) {
                System.out.println("Исключение ");
            }
        }
    }
}