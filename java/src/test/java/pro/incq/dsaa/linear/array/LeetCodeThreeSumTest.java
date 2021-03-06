package pro.incq.dsaa.linear.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author yun.516@gmail.com
 */
public class LeetCodeThreeSumTest {
    private LeetCodeSolution leetCodeSolution;

    @Before
    public void setUp() {
        if (leetCodeSolution == null) {
            leetCodeSolution = new LeetCodeSolution();
        }
    }

    @Test
    public void firstMissingPositive() {
        int[] nums = {};
        assertEquals(1, leetCodeSolution.firstMissingPositive(nums));
        nums = new int[]{1};
        assertEquals(2, leetCodeSolution.firstMissingPositive(nums));
        nums = new int[]{1, 2, 0};
        assertEquals(3, leetCodeSolution.firstMissingPositive(nums));
        nums = new int[]{-1, 4, 2, 1, 9, 10};
        assertEquals(3, leetCodeSolution.firstMissingPositive(nums));
    }
}