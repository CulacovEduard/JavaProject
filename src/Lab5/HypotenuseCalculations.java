//n6.15
package Lab5;

public class HypotenuseCalculations {

    public static void main(String[] args) {


        System.out.println( hypotenuse(209,20));
        System.out.println( hypotenuseSimple(100.0,200.0));

    }

    public static double hypotenuse(double side1, double side2){
        double hypotenuse=0.0;
        double val1=side1;
        double val2=side2;
        for(int i=1;i<2;i++){
            val1*=side1;
            val2*=side1;

        }
        hypotenuse=val1+val2;
        double hypo=Math.sqrt(hypotenuse);
        return hypo;
    }

    public static double hypotenuseSimple(double side1, double side2){
        double hypotenuse=0.0;

        hypotenuse=Math.pow(side1,2)+Math.pow(side2,2);
        double hypo=Math.sqrt(hypotenuse);


        return hypo;
    }

}
