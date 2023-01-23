package practice.morskojboj;

// в этой версии корабли стали обьектами, они занют свой размер, они знают свои координаты.
//корабли стали намного умнее. и я немного тоже. а бой стал более ООПэшным

public class Demo {
    public static void main(String[] args) {
        GameBoard board = new GameBoard();
        GameVsUser game = new GameVsUser();

        board.createBoard();
        board.createShip();
        board.print();

        game.gameVsUser();

    }
}
