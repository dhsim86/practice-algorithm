package com.dongho.dev.practice.stack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StackTest {

    @Test
    public void isEmptyTest() {
        // given

        // when
        Stack stack = new ArrayStack();

        // then
        assertThat(stack.isEmpty()).isTrue();
        assertThat(stack.isFull()).isFalse();
    }

    @Test
    public void isFullTest() {
        // given
        Stack stack = new ArrayStack();

        // when
        for (int i = 0; i < 100; i++) {
            stack.push(i);
        }

        // then
        assertThat(stack.isEmpty()).isFalse();
        assertThat(stack.isFull()).isTrue();
    }

    @Test
    public void popTest() {
        // given
        Stack stack = new ArrayStack();

        // when
        stack.push(1);

        // the
        assertThat(stack.pop()).isEqualTo(1);
    }

    @Test
    public void listStackIsEmptyTest() {
        // given

        // when
        Stack stack = new ListStack();

        // then
        assertThat(stack.isEmpty()).isTrue();
        assertThat(stack.isFull()).isFalse();
    }

    @Test
    public void listStackIsPopTest() {
        // given
        Stack stack = new ListStack();

        // when
        stack.push(1);

        // the
        assertThat(stack.pop()).isEqualTo(1);
        assertThat(stack.isEmpty()).isTrue();
    }

    @Test
    public void bracketTest() {
        // given
        String expression0 = "{A[(i+1)] = 0};";
        String expression1 = "if((i == 0) && (j == 0)";
        String expression2 = "A[(i + 1]) = 0;";

        // when

        // then
        assertThat(BracketMatch.isMatch(expression0)).isTrue();
        assertThat(BracketMatch.isMatch(expression1)).isFalse();
        assertThat(BracketMatch.isMatch(expression2)).isFalse();
    }

    @Test
    public void postfixOperateTest() {
        // given
        String expression = "82/3-32*+";

        // when
        int result = BracketMatch.postfixOperate(expression);

        // then
        assertThat(result).isEqualTo(7);
    }

    @Test
    public void infixToPostfixTest() {
        // given
        String expression0 = "a+b";
        String expression1 = "(a+b)*c";
        String expression2 = "a+b*c";

        // when

        // then
        assertThat(BracketMatch.infixToPostfix(expression0)).isEqualTo("ab+");
        assertThat(BracketMatch.infixToPostfix(expression1)).isEqualTo("ab+c*");
        assertThat(BracketMatch.infixToPostfix(expression2)).isEqualTo("abc*+");
    }


}
