package practice.morskojboj;

// в этой версии корабли стали обьектами, они знают свой размер, они знают свои координаты.
//корабли стали намного умнее. и я немного тоже. а бой стал более ООПэшны м

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
