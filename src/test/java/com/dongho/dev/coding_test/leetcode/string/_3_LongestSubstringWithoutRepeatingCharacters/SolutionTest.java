package com.dongho.dev.coding_test.leetcode.string._3_LongestSubstringWithoutRepeatingCharacters;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given
        String input0 = "abcabcbb";
        String input1 = "bbbbb";
        String input2 = "pwwkew";
        String input3 = "";
        String input4 = " ";
        String input5 = "aabaab!bb";
        Solution solution = new Solution();

        // when
        
        int result0 = solution.lengthOfLongestSubstring(input0);
        int result1 = solution.lengthOfLongestSubstring(input1);
        int result2 = solution.lengthOfLongestSubstring(input2);
        int result3 = solution.lengthOfLongestSubstring(input3);
        int result4 = solution.lengthOfLongestSubstring(input4);
        int result5 = solution.lengthOfLongestSubstring(input5);

        // then
        
        assertThat(result0).isEqualTo(3);
        assertThat(result1).isEqualTo(1);
        assertThat(result2).isEqualTo(3);
        assertThat(result3).isEqualTo(0);
        assertThat(result4).isEqualTo(1);
        assertThat(result5).isEqualTo(3);
    }
    
}
