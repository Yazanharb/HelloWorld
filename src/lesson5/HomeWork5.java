package lesson5;

import java.util.Scanner;

public class HomeWork5 {
    //если введенное имя совпадает с Вячеслав то вывести "Привет,Вячеслав", если нет, то вывести "Нет такого имени"
    public static void main(String[] args){
        String name = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя");
        name = sc.next();
       if(name.equals("Вячеслав")) {
           System.out.println("Привет," + name);
       }
        else {
           System.out.println("Нет такого имени");
       }
       }
    }
