package lab5;

class ShoppingCart {
    private Item[] items;
    private int itemCount;
    public ShoppingCart() {
        this.items = new Item[100];
        this.itemCount = 0; 
    }
    class Item {
        String itemName;
        int quantity;
        double price;
        public Item(String itemName, int quantity, double price) {
            this.itemName = itemName;
            this.quantity = quantity;
            this.price = price;
        }
        public void dispItem() {
            System.out.println("Item: " + itemName + " | Qty: " + quantity + " | Price: $" + price + " | Subtotal: $" + (quantity * price));
        }
    }
    public void addItems(String itemName, int quantity, double price) {
        if (itemCount < items.length) {
            Item it = this.new Item(itemName, quantity, price);	
            items[itemCount] = it;
            itemCount++;
        } else {
            System.out.println("Cart is full!");
        }
    }
    public double calculateTotalPrice() {
        double grandTotal = 0;
        for (int i = 0; i < itemCount; i++) {
            grandTotal += (items[i].quantity * items[i].price);
        }
        return grandTotal;
    }
    public void display() {
        System.out.println("--- Cart Contents ---");
        for(int i = 0; i < itemCount; i++) {
            items[i].dispItem();
        }
        System.out.println("---------------------");
        System.out.println("Grand Total: $" + calculateTotalPrice()); 
    }
}
public class Exercise3 {
    public static void main(String[] args) {
        ShoppingCart b1 = new ShoppingCart();
        b1.addItems("Ice cream", 3, 10);
        b1.addItems("Charging cable", 1, 15);
        b1.addItems("Chips", 3, 9);       
        b1.display();
    }
}