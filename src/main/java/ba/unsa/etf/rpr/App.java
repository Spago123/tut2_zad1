package ba.unsa.etf.rpr;

/**
 * Hello world!
 *
 */
public class App {
    /**
     * Entry method for app
     * @param args is a double, which represents an angle in radians
     */
        public static void main (String[] args){
            if(args[0].equals("sinus"))
                System.out.println("Sinus od " + args[1] + " je: " + Matematika.sinus(Double.parseDouble(args[1])*3.14/180));
    }
}
