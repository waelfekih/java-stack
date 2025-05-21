import java.util.ArrayList;
public class TestOrders {
        public static void main(String[] args) {

        // Menu items
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 3.9 ;

        Item item2 = new Item();
        item2.name = "Latte";
        item2.price = 2.5 ;

        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 2 ;

        Item item4 = new Item();
        item4.name = "cappuccino";
        item4.price = 2.5 ;

    
    
        // Order variables -- order1, order2 etc.

        Order order1 = new Order();
        order1.name = "Cindhuri";
        order1.total = 12.0 ;
        order1.ready = true ;

        Order order2 = new Order();
        order2.name = "Jimmy";
        order2.total = 12.0 + item1.price;
        order2.ready = true ;

        Order order3 = new Order();
        order3.name = "Noah";
        order3.total = item4.price ;
        order3.ready = true ;
        ArrayList<Item> itemList4 = new ArrayList<>();
        itemList4.add(item4);
        order3.items = itemList4;

        Order order4 = new Order();
        order4.name = "Sam";
        order4.total = (item2.price) * 2;
        order4.ready = false ;
        ArrayList<Item> itemList2 = new ArrayList<>();
        itemList2.add(item2);
        order4.items = itemList2;
    
    
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.println(order1);
        System.out.println(order1.total);
        System.out.println(order2.total);
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.println(order4.total);


        // test items
        System.out.printf("Item Name: %s\n" , item1.name);
        System.out.printf("Item price: %s\n" , item1.price);

        System.out.printf("Item Name: %s\n" , item2.name);
        System.out.printf("Item price: %s\n" , item2.price);

        System.out.printf("Item Name: %s\n" , item3.name);
        System.out.printf("Item price: %s\n" , item3.price);

        System.out.printf("Item Name: %s\n" , item4.name);
        System.out.printf("Item price: %s\n" , item4.price);
    }
}
