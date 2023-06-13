public class Homework120623 {
    public static void main(String[] args) {

        char met1 = '&';
        int w = met1;
        System.out.println(w - 38);



        char met2 = '9';
        String m = String.valueOf(met2);
        int  m2  = Integer.parseInt(m);
        System.out.println(m2 - 9);


        char met3 = '\u009E';
        int  z  = Character.getNumericValue(met3);
        System.out.println(z + 1);

    }
}
