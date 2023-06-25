import java.util.Random;

public class Homework2506 {
    public static void main(String[] args) {

        Random r = new Random();

        int q = r.nextInt(0 ,28801);
        System.out.println(q + " - Seconds left");

        if (q>3600){
            System.out.println(q / 3600 + " - Full hours left");
        }
        else {
            System.out.println(" Less than an hour left ");
        }

    }
}
