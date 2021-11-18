package com.dongho.dev.coding_test.leetcode.array._1095_FindInMountainArray;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given

        // when
        int result1 = new Solution().findInMountainArray(3, new CMountainArray(new int[] {
            1, 2, 3, 4, 5, 3, 1
        }));

        int result2 = new Solution().findInMountainArray(3, new CMountainArray(new int[] {
            0, 1, 2, 4, 2, 1
        }));
        int result3 = new Solution().findInMountainArray(2, new CMountainArray(new int[] {
            1, 2, 3, 4, 5, 3, 1
        }));
        int result4 = new Solution().findInMountainArray(0, new CMountainArray(new int[] {
            3, 5, 3, 2, 0
        }));
        int result5 = new Solution().findInMountainArray(1, new CMountainArray(new int[] {
            1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,100,99,98,97,96,95,94,93,92,91,90,89,88,87,86,85,84,83,82
        }));

        // then
        assertThat(result1).isEqualTo(2);
        assertThat(result2).isEqualTo(-1);
        assertThat(result3).isEqualTo(1);
        assertThat(result4).isEqualTo(4);
        assertThat(result5).isEqualTo(0);
    }
    
}
