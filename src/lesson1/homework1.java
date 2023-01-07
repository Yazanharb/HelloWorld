package lesson1;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args)
    {
        int i,n, sum=0;
        {
            Scanner in= new Scanner(System.in);
            System.out.print("Введите число:");
            n = in.nextInt();
        }
        System.out.println("Сумма равна:"+n);

        for(i=1;i<=n;i++)
        {
            System.out.println(i);
            sum+=i;
        }
        System.out.println("Сумма чисел до "+n+ "чисел : "+sum);
    }
}


