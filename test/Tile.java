package test;


public class Tile {

	public final char letter;
    public final int score;
    private Tile(char letter, int score){
        this.letter = letter;
        this.score = score;
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static class Bag {
        class Pair<T, U> {
            public T first;
            public U second;
        }
        private int[] quantities;
        private char[] tiles;

        private Bag() {
            quantities = new int[26];

            quantities[0] = 9;
            quantities[1] = 2;
            quantities[2] = 2;
            quantities[3] = 4;
            quantities[4] = 12;
            quantities[5] = 2;
            quantities[6] = 3;
            quantities[7] = 2;
            quantities[8] = 9;
            quantities[9] = 1;
            quantities[10] = 1;
            quantities[11] = 4;
            quantities[12] = 2;
            quantities[13] = 6;
            quantities[14] = 8;
            quantities[15] = 2;
            quantities[16] = 1;
            quantities[17] = 6;
            quantities[18] = 4;
            quantities[19] = 6;
            quantities[20] = 4;
            quantities[21] = 2;
            quantities[22] = 2;
            quantities[23] = 1;
            quantities[24] = 2;
            quantities[25] = 1;

            tiles = new char[26];

            tiles[0] = new Pair<>('A', 1);
            
        }

    }

}
