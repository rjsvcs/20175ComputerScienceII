public class Game {

    private int minimumAge;
    private int maximumAge;

    private int minimumPlayers;
    private int maximumPlayers;
    private String rules;

    private String name;

    public Game(int minimumAge, int maximumAge, int minimumPlayers,
                int maximumPlayers, String rules, String name) {
        this.minimumAge = minimumAge;
        this.maximumAge = maximumAge;
        this.minimumPlayers = minimumPlayers;
        this.maximumPlayers = maximumPlayers;
        this.rules = rules;
        this.name = name;
    }

    public int getMinimumAge() {
        return minimumAge;
    }

    public int getMaximumAge() {
        return maximumAge;
    }

    public int getMinimumPlayers() {
        return minimumPlayers;
    }

    public int getMaximumPlayers() {
        return maximumPlayers;
    }

    public String getRules() {
        return rules;
    }

    public String getName() {
        return name;
    }

    public void play(String name) {
        System.out.println(name + " plays " + this.name);
    }

    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        else if(obj instanceof Game) {
            Game other = (Game)obj;
        }

        return false;
    }
}
