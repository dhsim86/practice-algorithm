package com.dongho.dev.coding_test.leetcode.array._1095_FindInMountainArray;

interface MountainArray {
    public int get(int index);
    public int length();
}

class CMountainArray implements MountainArray {

    private int[] array;
    private int callCount = 0;

    public CMountainArray(int[] array) {
        this.array = array;
    }

    @Override
    public int get(int index) {
        callCount++;

        if (callCount > 100) {
            throw new RuntimeException("100 times more called.");
        }

        return array[index];
    }

    @Override
    public int length() {
        return array.length;
    }

}



public class Solution {
    
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length();
        int mid = (start / end) / 2;

        int val;
        int leftVal;
        int rightVal;

        while (true) {
            mid = (start + end) / 2;

            val = mountainArr.get(mid);

            if (mid - 1 < 0 || mid + 1 >= mountainArr.length()) {
                break;
            }

            leftVal = mountainArr.get(mid - 1);
            rightVal = mountainArr.get(mid + 1);

            if (leftVal > val) {
                end = mid;
            } else if (val < rightVal) {
                start = mid + 1;
            } else {
                break;
            }
        }

        int leftStart = 0;
        int leftEnd = mid;
        int leftMid = -1;

        int rightStart = mid;
        int rightEnd = mountainArr.length();
        int rightMid = -1;

        leftVal = -1;
        rightVal = -1;

        while (true) {
            leftVal = leftVal == target ? target : -1;
            rightVal = rightVal == target ? target : -1;

            if (leftVal != target && leftEnd - leftStart >= 1) {
                leftMid = (leftStart + leftEnd) / 2;
                leftVal = mountainArr.get(leftMid);
            } 

            if (rightVal != target && rightEnd - rightStart >= 1) {
                rightMid = (rightStart + rightEnd) / 2;
                rightVal = mountainArr.get(rightMid);
            }

            if (target < leftVal) {
                leftEnd = leftMid;
            } else if (leftVal < target) {
                leftStart = leftMid + 1;
            }

            if (target < rightVal) {
                rightStart = rightMid + 1;
            } else if (rightVal < target) {
                rightEnd = rightMid;
            }

            if ((leftVal == -1 && rightVal == -1) ||
                (leftVal == target && (rightEnd - rightStart < 1)) ||
                (leftEnd - leftStart < 1 && rightVal == target) ||
                (leftVal == target && rightVal == target)) {
                break;
            }
        }

        if (leftVal == target) {
            return leftMid;
        } else if (rightVal == target) {
            return rightMid;
        }

        return -1;
    }

}
