public class GameTester {


    public static void playGame(BoardGame bg, String name) {
        bg.addPiece("T-Rex");
        System.out.println("HELLO!");
        bg.play(name);
    }

    public static void playGame(Game game, String name) {
        game.play(name);
    }

    public static void main(String[] args) {

        Game hopscotch = new Game(3, 80, 1,
                4, "Hop followed by scotch", "hopscotch");

        Game monopoly = new BoardGame(27, 28,
                2, 8,
                "Flip the table.", "Monopoly");

        BoardGame bg = (BoardGame)monopoly;


        playGame(hopscotch, "Bobby");
        playGame(monopoly, "Buttercup");
        playGame(bg, "Thunder");
    }
}
