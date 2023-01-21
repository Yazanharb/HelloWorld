package lesson6;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args){
      //Если введеное число больше 7 , то вывести "Привет"
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a =sc.nextInt();
        if (a >7)
            System.out.println("Привет");
        else{
            System.out.println("Маленькое число ");
        }

    }
}
