import java.util.Arrays;

public class ZigZagPAttern {

    public static void printZigZag(String str, int numRows) {
        if (numRows == 1) {
            System.out.println(str);
            return;
        }

        // Initialize rows as StringBuilder arrays
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int length = str.length();
        int currentRow = 0;
        boolean goingDown = false;

        // Traverse the string and build rows
        for (int i = 0; i < length; i++) {
            rows[currentRow].append(str.charAt(i));
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            currentRow += goingDown ? 1 : -1;
        }

        // Calculate the maximum length of rows
        int maxRowLength = 0;
        for (StringBuilder row : rows) {
            if (row.length() > maxRowLength) {
                maxRowLength = row.length();
            }
        }

        // Add spaces to format the zig-zag pattern
        char[][] zigZagArray = new char[numRows][maxRowLength];
        for (int i = 0; i < numRows; i++) {
            Arrays.fill(zigZagArray[i], ' ');
        }

        currentRow = 0;
        goingDown = false;
        int currentCol = 0;

        for (int i = 0; i < length; i++) {
            zigZagArray[currentRow][currentCol] = str.charAt(i);
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            currentRow += goingDown ? 1 : -1;
            if (currentRow == 0 || currentRow == numRows - 1) {
                currentCol++;
            }
        }

        // Print the formatted zig-zag pattern
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < maxRowLength; j++) {
                System.out.print(zigZagArray[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
        int numRows = 4;
        printZigZag(str, numRows);
    }
}
