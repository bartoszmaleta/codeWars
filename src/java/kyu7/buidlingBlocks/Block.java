package java.kyu7.buidlingBlocks;

public class Block {
    private int width;
    private int length;
    private int height;

    public Block(int[] array) {

        this.width = array[0];
        this.length = array[1];
        this.height = array[2];
    }

    public int getVolume() {
        return width * height * length;
    }

    public int getSurfaceArea() {
        int area = (2 * (width * length) + (2 * (width * height)) + (2 * (height * length)));
        return area;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
}
