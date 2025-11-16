public class Customer {
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

    @Override
    public String toString() {
        return "Customer[name=" + name +", id=" + custID + "]";
    }
}
