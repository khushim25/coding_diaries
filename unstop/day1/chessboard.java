import java.util.Scanner;

class chessboard {
    public static String determineColor(String s) {
        // Write your logic here to determine the color based on the string s.
        // Return "Black" or "White" based on the problem statement.
        char letter = Character.toLowerCase(s.charAt(0));
        int row = Character.getNumericValue(s.charAt(1));

        //conversion of letter to number
        int col = letter - 'a' + 1;

        //even even odd odd logic
        //making boolean
        boolean isColEven = (col % 2 == 0);
        boolean isRowEven = (row % 2 == 0);

        //if both are even or both are odd -> black
        if(isColEven == isRowEven) {
            return "Black";
        } else {
            return "White";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        String result = determineColor(s);
        System.out.println(result);
    }
}