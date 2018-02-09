import java.util.ArrayList;
import java.util.List;

public class BoardGame extends Game {

    private List<String> pieces;

    public BoardGame(int minimumAge, int maximumAge,
                     int minimumPlayers, int maximumPlayers,
                     String rules, String name) {
        super(minimumAge, maximumAge, minimumPlayers, maximumPlayers, rules, name);

        pieces = new ArrayList<>();
    }

    public void addPiece(String piece) {
        pieces.add(piece);
    }

    public List<String> getPieces() {
        return pieces;
    }

    @Override
    public void play(String name) {
        System.out.println(name + " pulls out the board game called " +
                getName());
    }
}
