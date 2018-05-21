public class Customer {
    private int age;
    private int height;
    private double wallet;
    
    public Customer(int age, int height, double wallet){
        this.age = age;
        this.height = height;
        this.wallet = wallet;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public double getWallet() {
        return wallet;
    }
}
