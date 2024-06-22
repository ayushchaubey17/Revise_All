import java.util.Arrays;

public class ExampleOnIt {
    public static void main(String[] args) {

        printZigZag("helloIamAbhishek",3);
    }


    public static void printZigZag(String str, int numberOfRows) {
        if (numberOfRows ==1 ) {
            System.out.println(str);
            return;
        }

        StringBuilder[]  rows = new StringBuilder[numberOfRows];


        for (int i = 0; i < numberOfRows ; i++) {
            rows[i] = new StringBuilder();
        }

        int len  = str.length();

        int currentRows = 0;
        boolean nicheJayeKya = false;


        for (int i = 0; i < len; i++) {
            rows[currentRows].append(str.charAt(i));

            if (currentRows == 0 || currentRows == numberOfRows - 1) {

                nicheJayeKya = !nicheJayeKya;
            }

            currentRows += nicheJayeKya? 1: -1;

        }


        int maxRowLength = 0;
        for (StringBuilder row : rows) {
           if(row.length()> maxRowLength) maxRowLength = row.length();
        }


        char [][] zigZagArray = new char[numberOfRows][maxRowLength];
        for (int i = 0; i < numberOfRows; i++) {
            Arrays.fill(zigZagArray[i], '-');
        }

//
        int curentCol =0;
        currentRows =0;
        nicheJayeKya = false;

//
        for (int i = 0; i < len ; i++) {
            zigZagArray[currentRows][curentCol] = str.charAt(i);
            if (currentRows==0 || currentRows == numberOfRows-1) nicheJayeKya = !nicheJayeKya;

            if (currentRows == numberOfRows-1 )curentCol++;


            currentRows += nicheJayeKya? 1:-1;

        }


        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < maxRowLength; j++) {
                System.out.print(zigZagArray[i][j]);
            }
            System.out.println();
        }



    }
}
