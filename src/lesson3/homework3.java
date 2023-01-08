package lesson3;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число А = ");
        double a = scn.nextDouble();
        System.out.println("Введите число В = ");
        double b = scn.nextDouble();
        System.out.println("Сумма = " + (a + b));
        System.out.println("Разность= " + (a - b));
        System.out.println("Произведение= " + (a * b));
        if(b == 0){
            System.out.println("На ноль делить нельзя");
        }
        System.out.println("Деление= " + (a / b));
    }
}
