package com.dongho.dev.coding_test.leetcode.hashtable._1189_MaximumNumberOfBalloons;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given

        // when
        int result1 = new Solution().maxNumberOfBalloons("nlaebolko");
        int result2 = new Solution().maxNumberOfBalloons("loonbalxballpoon");
        int result3 = new Solution().maxNumberOfBalloons("leetcode");
        int result4 = new Solution().maxNumberOfBalloons("lloo");

        // then
        assertThat(result1).isEqualTo(1);
        assertThat(result2).isEqualTo(2);
        assertThat(result3).isEqualTo(0);
        assertThat(result4).isEqualTo(0);
    }

}
