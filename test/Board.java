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
            System.arraycopy(tiles[i], 0, copy[i], 0, 15);
        }
        return copy;
    }

    public boolean boardLegal(Word word) {
        int row = word.getRow();
        int col = word.getCol();
        boolean vertical = word.isVertical();
        Tile[] wordTiles = word.getTiles();

        if (vertical) {
            if (row < 0 || row + wordTiles.length >= 15)
                return false;
            for (int i = 0; i < wordTiles.length; i++) {
                if (tiles[row + i][col] != null)
                    return false;
            }
        } else {
            if (col < 0 || col + wordTiles.length >= 15)
                return false;
            for (int i = 0; i < wordTiles.length; i++) {
                if (tiles[row][col + i] != null)
                    return false;
            }
        }
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

    public int tryPlaceWord(Word word) {
        return 0;
    }
}
