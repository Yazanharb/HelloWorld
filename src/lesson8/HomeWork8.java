package lesson8;

import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        name();
        number7();
        multiple3();
    }
    //Если введенное имя совпадает с Вячеслав , то вывести "Привет,Вячеслав", если нет , то вывести "Нет такого имени"
    static void name() {
        String name = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя");
        name = sc.next();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет," + name);
        } else {
            System.out.println("Нет такого имени");
        }
    }


    //Если введеное число больше 7 , то вывести "Привет"
    static void number7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();
        if (a > 7)
            System.out.println("Привет");
        else {
            System.out.println("Маленькое число ");
        }

    }
    //На входе есть числовой массив,необоходимо вывести элементы массива кратные 3
    public static void multiple3() {
        String newString = "";
        System.out.println("Введите массив целых чисел через запятую : ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            newString = sc.next();
        }
        String[] arrStr = newString
                .replaceAll(" ", "")
                .replaceAll("[a-zA-Zа-яА-Я_]", "")
                .replaceAll("\\]", "")
                .replaceAll("\\[", "")
                .replaceAll("[;!#$%&<>:|]", ",")
                .split(",");
        int[] arr = new int[arrStr.length];
        int counterWrite = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arrStr == null || arrStr.equals("")) {
                System.out.println("Введенный массив пустой или не содержит целых чисел");
            } else {
                try {
                    arr[counterWrite] = Integer.valueOf(arrStr[i]);
                    counterWrite++;
                } catch (NumberFormatException e) {
                    System.out.println("Введенный массив содержит символы, включая пробел, дробные числа или он не содержит чисел. допустим только массив целых чисел");
                }
            }
        }

        for (int i = 0; i < counterWrite; i++) {
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}