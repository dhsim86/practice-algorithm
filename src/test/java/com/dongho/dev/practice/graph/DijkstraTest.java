package com.dongho.dev.practice.graph;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class DijkstraTest {

    @Test
    public void getMinimumPathTest() {
        // given
        Dijkstra dijkstra = new Dijkstra();
        dijkstra.calculate(0);

        // when
        String result1 = dijkstra.getMinimumPath(0, 1);
        String result2 = dijkstra.getMinimumPath(0, 2);
        String result3 = dijkstra.getMinimumPath(0, 3);
        String result4 = dijkstra.getMinimumPath(0, 4);
        String result5 = dijkstra.getMinimumPath(0, 5);
        String result6 = dijkstra.getMinimumPath(0, 6);

        log.info("result: {}", dijkstra.getResult());

        // then
        assertThat(result1).isEqualTo("[0][4][1]");
        assertThat(result2).isEqualTo("[0][4][1][2]");
        assertThat(result3).isEqualTo("[0][4][1][2][3]");
        assertThat(result4).isEqualTo("[0][4]");
        assertThat(result5).isEqualTo("[0][5]");
        assertThat(result6).isEqualTo("[0][4][6]");
    }
}
