//5% Discount on Online Purchase if the Total is Greater Than or Equal to 500 and the 
//Customer is a First-Time Shopper 
package conditional_statements;
import java.util.*;
public class q1 {
    public static void main(String[] args) {
        int price;
        int coustomer_visit;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the price:");
        price= sc.nextInt();
        System.out.print("enter the coustumer visit details(1,2,3..):");
        coustomer_visit=sc.nextInt();
        if (price>=500 && coustomer_visit==1) {
            price=(int) (price-(0.05*price));
            System.out.println(price);
        }
        
    }
    
}
