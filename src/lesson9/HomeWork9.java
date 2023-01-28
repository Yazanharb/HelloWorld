package lesson9;

import java.util.Scanner;

public class HomeWork9 {
    //Напишите класс BaseConverter для конвертации из градусов по Цельсию в
    //Кельвины, Фаренгейты, и так далее. У класса должен быть метод convert, который
    //и делает конвертацию.
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Введите t = (°C)");
            double t =scn.nextDouble();

            System.out.println("t =  " +
                    new CelsiusConverter().getConvertedValue(t)+"(°C)");
            System.out.println("t =  " +
                    new KelvinConverter().getConvertedValue(t)+"(K)");
            System.out.println("t =  " +
                    new FahrenheitConverter().getConvertedValue(t)+"(°F)");
        }
    }


    interface Converter {
        double getConvertedValue(double baseValue);
    }

    class CelsiusConverter implements Converter {
        @Override
        public double getConvertedValue(double baseValue) {
            return baseValue;
        }
    }

    class KelvinConverter implements Converter {

        @Override
        public double getConvertedValue(double baseValue) {
            return baseValue + 273.15;
        }
    }

    class FahrenheitConverter implements Converter {
        @Override
        public double getConvertedValue(double baseValue) {
            return 1.8 * baseValue + 32;
        }
    }

