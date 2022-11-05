public class challenge1 {
    public static void main(String[] args) {
        calcFeetAndInchesToCM(6, 0);
        calcFeetAndInchesToCM(100);
    }
    public static double calcFeetAndInchesToCM(double feet, double inch) {
        if((feet < 0) || ((inch < 0) || (inch > 12))) {
            System.out.println("Invalid input");
            return -1;
        }
        double inch1 = feet * 12;
        double centi = (inch + inch1) * 2.54;
        System.out.println(feet + "ft, " + inch + " in = " + centi + " cm");
        return centi;
    }
    public static double calcFeetAndInchesToCM(double inch) {
        if((inch < 0)){
            System.out.println("Invalid input");
            return -1;
        }
        double feet = (int) inch / 12;
        double remInch = inch % 12;
        return calcFeetAndInchesToCM(feet, remInch);
    }
}
