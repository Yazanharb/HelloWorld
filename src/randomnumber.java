import java.util.Random;
public class randomnumber {
    public static void main(String[] args){
        Random random = new Random();
        int a = random.nextInt(5);
        System.out.println("Число а :"+a);
        int b =random.nextInt(10);
        System.out.println("Число b :"+b);
        int c =random.nextInt(1000);
        System.out.println("Число c :"+c);
    }

}
