package test;

import java.util.Objects;

public class Tile {

	public final char letter;
    public final int score;
    private Tile(char letter, int score){
        this.letter = letter;
        this.score = score;
    }

    public char getLetter() {
        return letter;
    }

    public int getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tile tile = (Tile) o;
        return letter == tile.letter && score == tile.score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(letter, score);
    }

    public static class Bag{

        private int[] quantities = new int[26];
        final private int[] quantities_game = {9,2,2,4,12,2,3,2,9,1,1,4,2,6,8,2,1,6,4,6,4,2,2,1,2,1};
        private Tile[] tiles = new Tile[26];
        private static Bag bag;

        private Bag(){

            for(int i = 0; i < 26; i++){
                this.quantities[i] = this.quantities_game[i];
            }

            for(int i = 0; i < 26; i++){
                char letter = (char)('A' + i);
                this.tiles[i] = new Tile(letter, findLetterValue(letter));
            }
        }

        private int findLetterValue(char letter){
            switch (letter) {
                case 'A':
                case 'E':
                case 'I':
                case 'L':
                case 'N':
                case 'O':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                    return 1;
                case 'D':
                case 'G':
                    return 2;
                case 'B':
                case 'C':
                case 'M':
                case 'P':
                    return 3;
                case 'F':
                case 'H':
                case 'V':
                case 'W':
                case 'Y':
                    return 4;
                case 'K':
                    return 5;
                case 'J':
                case 'X':
                    return 8;
                case 'Q':
                case 'Z':
                    return 10;
            }
            return 0;
        }

        public Tile getRand(){
            int rand = (int)(Math.random() * 26);
            while (this.quantities[rand] == 0){
                rand = (int)(Math.random() * 26);
            }
            this.quantities[rand]--;
            return this.tiles[rand];
        }

        public Tile getTile(char letter) {

            int index  = (letter - 'A');
            if(index < 0 || index > 25){
                return null;
            }
            if(this.quantities[index] == 0){
                return null;
            }
            this.quantities[index]--;
            return this.tiles[index];
        }

        public void put(Tile tile){

            int index = (tile.getLetter() - 'A');
            if(index < 0 || index > 25){
                return;
            }
            if(this.quantities[index] + 1 > this.quantities_game[index]){
                return;
            }
            this.quantities[index]++;
        }

        public int size(){
            int size = 0;
            for(int i = 0; i < 26; i++){
                size+=this.quantities[i];
            }
            return size;
        }

        public int[] getQuantities(){

            int[] clone = new int[26];
            for(int i = 0; i < 26; i++){
                clone[i] = this.quantities[i];
            }
            return clone;
        }

        public static Bag getBag(){
            if(bag == null){
                bag = new Bag();
            }
            return bag;
        }
    }


}

