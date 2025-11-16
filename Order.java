//Order class
public class Order {
    private Item[] items = new Item[30];
    private Customer c;
    private double totalBill = 0.0;
    private int count = 0;
    public Order(Customer c) {
        this.c = c;
    }
    //takes the item to be bought as argument, add it to the items list 
    public void takeOrder(Item item) {
        if (count < items.length && item != null) {
            items[count++] = item;
            totalBill += item.getPrice();
        }
    }
    public double getTotalBill() {
        return totalBill;
    }
    public Customer getCustomer()
      { return c; }
}

