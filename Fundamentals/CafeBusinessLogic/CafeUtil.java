import java.util.List;
import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal() {
        int sum= 0;
        for (int i = 1; i <= 10 ; i++) {
            sum = sum + i;
        }
        return sum ;
    }

    public int getStreakGoal(int numWeeks) {
        int summ= 0;
        for (int j = 1; j <= numWeeks ; j++) {
            summ = summ+ j;
        }
        return summ ;
    }

    public double getOrderTotal(double[] prices){
        double lineItems = 0 ;
        for (int m = 0 ; m < prices.length ; m++) {
            lineItems += prices[m] ;
        }
        return lineItems;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int n = 0 ; n < menuItems.size() ; n++) {
            System.out.println( n + " " + menuItems.get(n) );
        }        
    }

    public String addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        customers.add(username);
        System.out.println("Hello, " + username);
        System.out.println("There are " + (customers.size() - 1) + " customers ahead of you.");

        return username;

    }









}