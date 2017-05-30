public class Main {

    public static void main(String[] args) {

        int[] input = {-7, -5, -4, -2, 0, 1, 3, 3, 5};

        SortedArrayOfSquaresUtil util = new SortedArrayOfSquaresUtil();

        int[] tmp = util.makeSquares(input);

        System.out.println(util.getAsString(tmp));

    }
}
