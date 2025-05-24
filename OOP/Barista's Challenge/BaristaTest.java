import java.util.ArrayList;

public class BaristaTest {
    public static void main(String[] args) {

        Item item1 = new Item("Coffee", 3.0);
        Item item2 = new Item("Latte", 4.5);
        Item item3 = new Item("Cappuccino", 5.0);
        Item item4 = new Item("Espresso", 2.5);

        Order order1 = new Order();
        Order order2 = new Order();

        Order order3 = new Order("John");
        Order order4 = new Order("Jane");
        Order order5 = new Order("Paul");

        order1.addItem(item1);
        order1.addItem(item2);

        order2.addItem(item2);
        order2.addItem(item4);

        order3.addItem(item2);
        order3.addItem(item3);

        order4.addItem(item2);
        order4.addItem(item3);

        order5.addItem(item1);
        order5.addItem(item2);
        order5.addItem(item3);

        System.out.println(order5.getStatusMessage());
        order5.setReady(true);
        System.out.println(order5.getStatusMessage());

        
        System.out.println(order5.getOrderTotal());
        order5.display();

    }

}
