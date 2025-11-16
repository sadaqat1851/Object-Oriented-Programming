public class Shop {
    static private String owner;
    static private Item[] i = new Item[100];
    static private Customer[] c = new Customer[100];
    static private int itemCount = 0;
    static private int custCount = 0;
    public Shop() { }
   //one-argument  
    public Shop(String owner) {
        Shop.owner = owner;
    }
    // adding item toshop
    public static void addItem(Item item) {
        if (itemCount < i.length) {
            i[itemCount++] = item;
        }
    }
    //to add customer to shop
    public static void addCustomer(Customer cust) {
        if (custCount < c.length) {
            c[custCount++] = cust;
        }
    }
    // looking for a registered customer in shop and returns true if found
    public static boolean findCustomer(String custID) {
        for (int j = 0; j < custCount; j++) {
            if (c[j] != null && c[j].getCustID().equals(custID)) return true;
        }
        return false;
    }
    public static Item findItemById(String id) {
        for (int j = 0; j < itemCount; j++) {
            if (i[j] != null && i[j].getId().equals(id)) return i[j];
        }
        return null;
    }
}
