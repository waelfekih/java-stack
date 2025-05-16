import java.util.ArrayList;
import java.util.Arrays;

public class TestCafe {
    public static void main(String[] args) {

        CafeUtil appTest = new CafeUtil();
        
    /* 
      You will need add 1 line to this file to create an instance 
      of the CafeUtil class. 
      Hint: it will need to correspond with the variable name used below..
    */
    	
        /* ============ App Test Cases ============= */
    
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal());

        int numWeeks = 7 ;
        System.out.printf("Purchases needed after %d weeks: %d%n", numWeeks, appTest.getStreakGoal(numWeeks));

    
        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.5, 5.5};
        System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));
        
        System.out.println("----- Display Menu Test-----");
        
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("water");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        menu.add("Expresso");
        menu.add("mochito");

        appTest.displayMenu(menu);
    
        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // // --- Test 4 times ---

        
        for (int i = 0; i < customers.length; i++) {
             appTest.addCustomer(customers);
             System.out.println("\n");
        }
    }
}
