package test;
import java.util.ArrayList;

public class Board {

    private static Board instance = null;
    private Tile[][] tiles;

    private Board() {

        tiles = new Tile[15][15];
    }

    public static Board getBoard() {

        if (instance == null) {
            instance = new Board();
        }

        return instance;
    }

    public Tile[][] getTiles() {

        Tile[][] copy = new Tile[15][15];

        for (int i = 0; i < 15; i++) {

            for (int j = 0; j < 15; j++) {
                copy[i][j] = tiles[i][j];
            }
            
        }

        return copy;
    }

    public boolean boardLegal(Word word) {
        return true;
    }

    public boolean dictionaryLegal(Word word) {
        return true;
    }

    public ArrayList<Word> getWords(Word word) {
        return new ArrayList<>();
    }

    public int getScore(Word word) {
        return 0;
    }
}

