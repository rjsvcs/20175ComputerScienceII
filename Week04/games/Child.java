public class Child extends Parent {

    private String name;

    public Child(String name) {
        super(24);
        System.out.println("Child(" + name + ")");
    }

    public Child(int age, String name) {
        super(age);
        this.name = name;

        System.out.println("Child(" + age + "," + name + ")");
    }

    public static void main(String[] args) {
        Child one = new Child("Buttercup");
    }
}
