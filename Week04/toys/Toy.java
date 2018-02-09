public class Toy {

    private double price;
    private int minimumAge;
    private int maximumAge;
    private String name;

    public Toy(double price, int minimumAge, int maximumAge, String name) {
        this.price = price;
        this.minimumAge = minimumAge;
        this.maximumAge = maximumAge;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMinimumAge() {
        return minimumAge;
    }

    public void setMinimumAge(int minimumAge) {
        this.minimumAge = minimumAge;
    }

    public int getMaximumAge() {
        return maximumAge;
    }

    public void setMaximumAge(int maximumAge) {
        this.maximumAge = maximumAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play(String childName) {
        System.out.println(childName + " plays with " + name);
    }
}
