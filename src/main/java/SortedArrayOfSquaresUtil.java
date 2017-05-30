
public class SortedArrayOfSquaresUtil {

    public int[] makeSquares(int[] input){

        int[] output = new int[input.length];

        int tailIndex = input.length-1;
        int headIndex = 0;

        for (int i = 0; i < input.length; i++){

            if (i + 1 < input.length && input[i] > input[i + 1]) {
                throw new RuntimeException("It is not sorted array!");
            }

            if( Math.abs(input[headIndex]) > Math.abs(input[tailIndex])){
                output[input.length-1-i] = input[headIndex] * input[headIndex];
                headIndex++;
            }else {
                output[input.length-1-i] = input[tailIndex] * input[tailIndex];
                tailIndex--;
            }
        }

        return output;
    }

    public String getAsString(int[] input){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < input.length; i++)
            s.append(input[i] + " ");
        return s.toString();
    }
}
