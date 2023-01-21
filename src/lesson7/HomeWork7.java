package lesson7;

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args){
        String newString ="";
        System.out.println("Введите массив целых чисел через запятую : ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()){
            newString = sc.next();
        }
        String [] arrStr = newString
                .replaceAll(" ","")
                .replaceAll("[a-zA-Zа-яА-Я_]","")
                .replaceAll("\\]","")
                .replaceAll("\\[","")
                .replaceAll("[;!#$%&<>:|]",",")
                .split(",");
        int [] arr = new int[arrStr.length];
        int counterWrite=0;
        for ( int i=0; i < arr.length; i++){
            if (arrStr==null || arrStr.equals("")){
                System.out.println("Введенный массив пустой или не содержит целых чисел");
            }else {
                try{
                    arr[counterWrite] = Integer.valueOf(arrStr[i]);
                    counterWrite++;
                } catch (NumberFormatException e){
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
