public class Parent {
    private int age;

    public Parent() {
        age = 30;
        System.out.println("Parent()");
    }

    public Parent(int age) {
        this.age = age;
        System.out.println("Parent(" + age + ")");
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "age=" + age +
                '}';
    }
}
