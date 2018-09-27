/*
 * Julianne Wojdak
 * 19/09/18
 * Calculate bill of sale
 */

package billofsale;

/**
 *
 * @author JuWoj8013
 */
public class BillOfSale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double price=12.49;
        double tax=1.13;
        double pay=20.00;
        double total=0.0;
        double change=0.0;
        total=(price*tax);
        change=(pay-total);
        System.out.println("Total "+price+"$");
        System.out.println("Tax total "+total+"$");
        System.out.println("Paid with "+ pay+"$");
        System.out.println("Change "+change+"$");
        // TODO code application logic here
    }
    
}
