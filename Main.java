public class Main {
    public static void main(String[] args) {
        // shop and owner
        Shop shop = new Shop("Sadaqats Store");
// create some items and add to shop
    Item item1 = new Item("I001", "Pencil", 0.50);
    Item item2 = new Item("I002", "Notebook", 2.00);
    Item item3 = new Item("I003", "Eraser", 0.25);
    Shop.addItem(item1);
    Shop.addItem(item2);
    Shop.addItem(item3);

        // create a customer and register
    Customer cust = new Customer("Ali", 21, "C002", "pass1234");
    Shop.addCustomer(cust);

    //An order for the customer and take some items
    Order order = new Order(cust);
    order.takeOrder(item1);
    order.takeOrder(item2);
    
        // printing result
     System.out.println("Customer: " + order.getCustomer());
    System.out.println("Total bill: $" + order.getTotalBill());
    }
}

class Item {
    private String id;
    private String name;
    private double price;

    public Item() { }

    public Item(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;}
    public void setId(String id) {
        this.id = id;}
    public String getName() {
        return name;}
    public void setName(String name) {
        this.name = name;}
    public double getPrice() {
        return price;}
    public void setPrice(double price) {
        this.price = price;}
    public String toString() {
        return "Item[id=" + id + ", name=" + name + ", price=" + price + "]";
    }
}

class Customer {
    private String name;
    private int age;
    private String custID;
    private String pswd;

    public Customer() { }

    public Customer(String name, int age, String custID, String pswd) {
        this.name = name;
        this.age = age;
        this.custID = custID;
        this.pswd = pswd;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getCustID() { return custID; }
    public void setCustID(String custID) { this.custID = custID; }

    public String getPswd() { return pswd; }
    public void setPswd(String pswd) { this.pswd = pswd; }

    public String toString() {
        return "Customer[name=" + name +", id=" + custID + "]";
    }
}

class Shop {
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
    // looking for a registered customer in shop and returns true if the customer found
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
//Order class
class Order {
    private Item[] items = new Item[30];
    private Customer c;
    private double totalBill = 0.0;
    private int count = 0;
    public Order(Customer c) {
        this.c = c;
    }
    //takes the item to be bought as argument and adding it to the items list 
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


