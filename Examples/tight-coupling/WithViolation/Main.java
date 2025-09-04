public class Main {
    public static void main(String[] args) {
        MarioGame marioGame = new MarioGame();
        SuperContraGame superContraGame = new SuperContraGame();

        GameRunner gameRunner = new GameRunner(superContraGame);
        gameRunner.run();
    }
}
