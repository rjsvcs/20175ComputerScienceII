public class Game extends Toy {
    private int numberOfPlayers;
    private String rules;

    public Game(double price,
                int minimumAge,
                int maximumAge,
                String name,
                int numberOfPlayers,
                String rules) {
        super(price, minimumAge, maximumAge, name);

        this.numberOfPlayers = numberOfPlayers;
        this.rules = rules;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    @Override
    public void play(String name) {
        System.out.println(name + " invites his/her friends over to play " +
                getName());
    }

    public static void main(String[] args) {
        Toy toy = new Game(49.99, 10, 100, "Ticket to Ride", 5, "Build railroads");
        Toy slinky = new Toy(0.5, 0, 100, "Slinky");

        ToyPrinter.printToy("Buttercup", toy);
        ToyPrinter.printToy("Bobby", slinky);
    }
}
