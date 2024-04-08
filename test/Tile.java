package test;
import java.util.Random;

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

        public Tile getRand() {

            int totalTiles = 0;
            for (int quantity : quantities) {
                totalTiles += quantity;
            }
        
            int randomIndex = random.nextInt(totalTiles);
        
            int count = 0;
            for (int i = 0; i < 26; i++) {
                count += quantities[i];
                if (randomIndex < count) {
                    return tiles[i];
                }
            }
        
            return null;
        }

        public Character getTile(char letter) {

            if (letter < 'A' || letter > 'Z') {
                System.out.println("Invalid letter provided.");
                return null;
            }

            int index = letter - 'A';

            if (quantities[index] > 0) {
                quantities[index]--;
                return letter;
            } 
            else {
                return null;
            }
        }


        private int[] quantities;
        private Tile[] tiles; 
        private Random random;

        

        private Bag() {
            quantities = new int[26];
            random = new Random();

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

            tiles[0] = new Tile('A', 1); 
            tiles[1] = new Tile('B', 3);
            tiles[2] = new Tile('C', 3);
            tiles[3] = new Tile('D', 2);
            tiles[4] = new Tile('E', 1);
            tiles[5] = new Tile('F', 4);
            tiles[6] = new Tile('G', 2);
            tiles[7] = new Tile('H', 4);
            tiles[8] = new Tile('I', 1);
            tiles[9] = new Tile('J', 8);
            tiles[10] = new Tile('K', 5);
            tiles[11] = new Tile('L', 1);
            tiles[12] = new Tile('M', 3);
            tiles[13] = new Tile('N', 1);
            tiles[14] = new Tile('O', 1);
            tiles[15] = new Tile('P', 3);
            tiles[16] = new Tile('Q', 10);
            tiles[17] = new Tile('R', 1);
            tiles[18] = new Tile('S', 1);
            tiles[19] = new Tile('T', 1);
            tiles[20] = new Tile('U', 1);
            tiles[21] = new Tile('V', 4);
            tiles[22] = new Tile('W', 4);
            tiles[23] = new Tile('X', 8);
            tiles[24] = new Tile('Y', 4);
            tiles[25] = new Tile('Z', 10);   
        }

    }

}
