public abstract class Ride {
    private String name;
    private double price;
    private int minAge;
    private int minHeight;

    public Ride(String name, double price, int age, int height){
        this.name = name;
        this.price = price;
        this.minAge = age;
        this.minHeight = height;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public int getAge(){
        return this.minAge;
    }

    public int getHeight(){
        return this.minHeight;
    }
}
