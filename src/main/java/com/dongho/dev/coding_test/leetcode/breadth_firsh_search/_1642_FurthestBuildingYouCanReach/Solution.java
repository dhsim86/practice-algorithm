package com.dongho.dev.coding_test.leetcode.breadth_firsh_search._1642_FurthestBuildingYouCanReach;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    private static class Info {
        int current;

        int currentBricks;
        int currentLadders;

        public Info(int current, int currentBricks, int currentLadders) {
            this.current = current;
            this.currentBricks = currentBricks;
            this.currentLadders = currentLadders;
        }
    }

    /*
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        
   PriorityQueue<Integer> min_heap=new PriorityQueue<>();  
          
        for(int i=0;i<heights.length-1;i++){
            int diff=heights[i+1]-heights[i];  // diff: difference
            
            if(diff>0){
                min_heap.add(diff);
            }
            
            if(min_heap.size()>ladders){
                bricks-=min_heap.remove();
            }
            
            if(bricks<0){  //means both bricks and ladder are finished .
                return i;
            }
        }  
       return heights.length-1;
    }
    */
    
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int max = Integer.MIN_VALUE;

        Queue<Info> queue = new LinkedList<>();
        queue.add(new Info(0, bricks, ladders));

        while (queue.isEmpty() == false) {
            Info info = queue.poll();
            max = Integer.max(max, info.current);

            if (info.current == heights.length - 1) {
                break;
            }

            int currentHeight = heights[info.current];
            int nextHeight = heights[info.current + 1];

            if (currentHeight >= nextHeight) {
                queue.add(new Info(info.current + 1, info.currentBricks, info.currentLadders));
            } else {
                int diff = nextHeight - currentHeight;

                if (diff <= info.currentBricks) {
                    queue.add(new Info(info.current + 1, info.currentBricks - diff, info.currentLadders));
                }

                if (info.currentLadders > 0) {
                    queue.add(new Info(info.current + 1, info.currentBricks, info.currentLadders - 1));
                }
            }
        }

        return max;
    }

}
