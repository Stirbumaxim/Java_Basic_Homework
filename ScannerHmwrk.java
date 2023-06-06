package scanerHomework;

import java.util.Scanner;

public class ScannerHmwrk {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);




        System.out.println("Enter pls value for A");
        int a = sc.nextInt();

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toOctalString(a));
        System.out.println(Integer.toHexString(a));





    }
}
