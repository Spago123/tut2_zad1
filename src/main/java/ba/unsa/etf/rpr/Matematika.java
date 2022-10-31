package ba.unsa.etf.rpr;

/**
 * Matematika is a class that can do basic math operations
 * @author Harun Spago
 * @version 1.0
 */

public class Matematika {
    /**
     * Method that returns the factoriel of a number
     * @param number is a positive integer
     * @exception IllegalArgumentException if number is negative
     */
    static int factoriel(int number){
        if (number<0)
            throw new IllegalArgumentException("Number cannot be negative!");
        if(number==0 || number==1)
            return 1;
        return number*factoriel(number-1);
    }

    /**
     * Method that return the sin of an angle
     * @param angle in radians
     */
    static double sinus(double angle){
        int sign=1;
        double angleAccumulation=1;
        double result=0;
        for(int i=1;i<10;i=i+1){
            angleAccumulation=angleAccumulation*angle;
            if(i%2!=0) {
                result =result + sign * angleAccumulation / factoriel(i);
                sign=sign*(-1);
            }
        }
        return result;
    }
}
