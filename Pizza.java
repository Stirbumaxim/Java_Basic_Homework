public class Pizza {
    public static void main(String[] args) {
        // r = d /2
        //a = pi * r^2
        // kkal = area * cklcm2
        //calorie1 - 2


        int pizzadm1 = 24;
        int pizzadm2 = 28;
        int kcalpercm = 40;

        calcextrcall(pizzadm1 , pizzadm2 , kcalpercm);
        System.out.println(calcextrcall(pizzadm1 , pizzadm2 , kcalpercm));
    }


    public static double calcextrcall (int pizzadm1 , int pizzadm2 , int kcalpercm){

        double radius1 = (double) pizzadm1 / 2;
        double radius2 = (double) pizzadm2 / 2;
        double Area1 = Math.PI * (radius1 * radius1);
        double Area2 = Math.PI * (radius2 * radius2);
        double Calories1 = Area1 * kcalpercm;
        double Calories2  = Area2 * kcalpercm;
        double ExtraCalories = Calories2 - Calories1;
        return ExtraCalories;

    }
}
