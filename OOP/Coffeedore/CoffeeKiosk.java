import java.util.ArrayList;

public class CoffeeKiosk {
    private String name;
    private double price;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();
    //private ArrayList<Order> orders;

    public CoffeeKiosk() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    public CoffeeKiosk (String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    public void addMenuItem(Item item) {
    items.add(item);
    }

    public void addMenuItem(String name , double price) {
        Item item = new Item(name , price);
        items.add(item);
    }

    public void displayMenu () {
        System.out.println("Customer Name: "+this.name);
        for(Item item : items){
            System.out.println(item.getName()+" - $"+item.getPrice());
        }
        System.out.println("Total: $"+getOrderTotal());
    }

    public double getOrderTotal(){
        double total = 0;
        for(Item item : items){
            total += item.getPrice();
        }
        return total;
    }


        //getters
        public String getName() { 
            return name; 
        }

        public boolean getReady() {
            return ready;
        }

        public double getPrice() { 
            return price; 
        }

        public ArrayList<Item> getItems(){
            return this.items;
        }

        //setters
        public void setName(String name){
            this.name = name;
        }

        public void setReady(boolean ready){
            this.ready = ready;
        }

        public void setPrice(double price) {
            this.price= price ;
        }

        public void setItems(ArrayList<Item> items){
            this.items = items;
        }

       

    
}