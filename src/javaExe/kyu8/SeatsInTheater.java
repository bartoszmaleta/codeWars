package javaExe.kyu8;

public class SeatsInTheater {

    // HELPING VERSION
    public static int seatsInTheater2(int nCols, int nRows, int col, int row) {
        if (nCols == nRows && nRows == col && col == row) return 0;

        int restRows = nRows - row;
        int restCols = nCols - col;

        return (restRows * restCols) + restRows;
    }

    public static void main(String[] args) {
        System.out.println(seatsInTheater(16,11,5,3));
        System.out.println(seatsInTheater(13,6,8,3));
        System.out.println(seatsInTheater(1000,1000,1000,1000));
    }

    public static int seatsInTheater(int nCols, int nRows, int col, int row) {
        return (nCols == nRows && nRows == col && col == row) ? 0 : ((nRows - row) * (nCols - col)) + (nRows - row);
    }

    // SECOND OPTION
    public static int seatsInTheater3(int nCols, int nRows, int col, int row) {
        return (nCols-col+1)*(nRows-row);
    }
}
