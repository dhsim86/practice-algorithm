package com.dongho.dev.coding_test.programmers.stock_price;

public class Solution {

    /*
        테스트 1 〉	통과 (1.47ms, 50.4MB)
        테스트 2 〉	통과 (1.50ms, 52.9MB)
        테스트 3 〉	통과 (6.24ms, 52.5MB)
        테스트 4 〉	통과 (6.71ms, 50.5MB)
        테스트 5 〉	통과 (8.62ms, 52.5MB)
        테스트 6 〉	통과 (1.36ms, 52.9MB)
        테스트 7 〉	통과 (3.95ms, 50.6MB)
        테스트 8 〉	통과 (5.00ms, 53.2MB)
        테스트 9 〉	통과 (1.56ms, 52.7MB)
        테스트 10 〉	통과 (9.05ms, 50.2MB)
     */

    // O(N ^ 2)
    public int[] slowSolution(int[] prices) {
        int[] answer = new int[prices.length];
        boolean[] dropped = new boolean[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int currentPrice = prices[i];

            for (int j = 0; j < i; j++) {
                if (dropped[j] == false) {
                    answer[j] += 1;
                }

                if (currentPrice < prices[j]) {
                    dropped[j] = true;
                }
            }
        }

        return answer;
    }

    static class Element {
        private int index;
        private int price;

        public Element(int index, int price) {
            this.index = index;
            this.price = price;
        }

        public int getPrice() {
            return this.price;
        }

        public int getIndex() {
            return this.index;
        }
    }

    static class ElementHeap {
        private int maxSize;
        private Element[] array;
        private int size = 0;

        public ElementHeap(int maxSize) {
            this.maxSize = maxSize + 1;
            array = new Element[this.maxSize];
            size = 0;
        }

        public void insert(int index, int price) {
            Element element = new Element(index, price);
            int i = ++size;

            while(i != 1 && array[i / 2].getPrice() < element.getPrice()) {
                array[i] = array[i / 2];
                i = i / 2;
            }

            array[i] = element;
        }

        public Element poll() {
            if (size <= 0) {
                return null;
            }

            Element root = array[1];
            Element tmp = array[size--];

            int parent = 1;
            int child = 2;

            while (child <= size) {
                if (child < size && array[child].getPrice() < array[child + 1].getPrice()) {
                    child++;
                }

                if (tmp.getPrice() >= array[child].getPrice()) {
                    break;
                }

                array[parent] = array[child];
                parent = child;
                child = child * 2;
            }

            array[parent] = tmp;
            return root;
        }

        public Element peek() {
            if (size > 0) {
                return array[1];
            }
            return null;
        }

    }
    /*
        테스트 1 〉	통과 (2.21ms, 52.2MB)
        테스트 2 〉	통과 (2.28ms, 52.1MB)
        테스트 3 〉	통과 (3.00ms, 52.7MB)
        테스트 4 〉	통과 (3.63ms, 50.5MB)
        테스트 5 〉	통과 (4.18ms, 52.4MB)
        테스트 6 〉	통과 (2.16ms, 52.9MB)
        테스트 7 〉	통과 (3.20ms, 51MB)
        테스트 8 〉	통과 (3.21ms, 52.1MB)
        테스트 9 〉	통과 (2.33ms, 50.2MB)
        테스트 10 〉	통과 (3.80ms, 52MB)
     */
    // O(N * logN)
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        ElementHeap elementHeap = new ElementHeap(prices.length);
        Element current;

        for (int i = 0; i < prices.length; i++) {
            elementHeap.insert(i, prices[i]);

            while ((current = elementHeap.peek()) != null && current.getIndex() != i && current.getPrice() > prices[i]) {
                current = elementHeap.poll();
                answer[current.getIndex()] = i - current.getIndex();
            }
        }

        while((current = elementHeap.poll()) != null) {
            answer[current.getIndex()] = (prices.length - 1) - current.getIndex();
        }

        return answer;
    }
}
