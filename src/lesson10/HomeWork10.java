package lesson10;
import java.util.*;
public class HomeWork10 {
// Метод, который будет вычислять угол между часовой и минутной стрелками часов.
// На вход функции подается время в виде двух переменных: "hours" и "minutes"

    public static void main(String args[]) {
        int hours, minutes;

        System.out.println("Введите часы (0-24) : ");
        Scanner hr = new Scanner(System.in);
        hours = hr.nextInt();

        System.out.println("Введите минуты (0-59) : ");
        Scanner mns = new Scanner(System.in);
        minutes = mns.nextInt();

        if (hours >= 0 && hours <= 24 && minutes >= 0 && minutes <= 59) {


                double hDegrees = ((hours % 12) * 30) + (minutes * 0.5);
                double mDegrees = minutes * 6;
                double diff = Math.abs(hDegrees - mDegrees);

                System.out.println("Угол между часовой и минутной стрелками часов : " + diff);
                if (diff > 180) {

                    diff = 360 - diff;
                    System.out.println("Угол между часовой и минутной стрелками часов  :  " + diff);
                }

            }

         else{
            System.out.println("Минуты или Часы не могут быть отрицательными");
            System.out.println("Допустимые числа(часы) от 0 до 24");
            System.out.println("Допустимые числа(минуты) от 0 до 59");
            }

        }
}



