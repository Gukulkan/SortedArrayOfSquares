import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertArrayEquals;

public class SortedArrayOfSquaresUtilTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void makeSquaresTest(){
        SortedArrayOfSquaresUtil util = new SortedArrayOfSquaresUtil();

        int[] input = {-7, -5, -4, -2, 0, 1, 3, 3, 5};
        int[] output = {0, 1, 4, 9, 9, 16, 25, 25, 49};

        assertArrayEquals(util.makeSquares(input), output);

        int[] input1 = {0,0,0,0,0,0,0};
        int[] output1 = {0,0,0,0,0,0,0};

        assertArrayEquals(util.makeSquares(input1), output1);

        int[] input2 = {1,1,1,1,1,1,1};
        int[] output2 = {1,1,1,1,1,1,1};

        assertArrayEquals(util.makeSquares(input2), output2);
    }

    @Test(expected = RuntimeException.class)
    public void makeSquaresUnsortedArrayTest(){
        SortedArrayOfSquaresUtil util = new SortedArrayOfSquaresUtil();

        int[] input = {-5, -7, -4, -2, 0, 1, 3, 3, 5};

        util.makeSquares(input);
    }

}
