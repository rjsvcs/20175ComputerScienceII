public class Doll extends Toy {

    private boolean kungFuGrip;
    private boolean creepyRollingEyes;


    public Doll(boolean kungFuGrip, boolean creepyRollingEyes,
                double price, int minimumAge, int maximumAge,
                String name) {
        super(price, minimumAge, maximumAge, name);

        this.kungFuGrip = kungFuGrip;
        this.creepyRollingEyes = creepyRollingEyes;
    }
}
