package com.hgshequ.springcloud;

import java.util.Arrays;

/**
 * @author : Sunny
 * @version V1.0
 * @Project: lianxi
 * @Package com.hgshequ.springcloud
 * @Description: TODO
 * @date Date : 2019年05月03日 17:16
 */
public class SortMy {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 4, 5, 2, 1, 33, 9, 0};
        // bubbleSort(nums);
        quickSort(nums, 0, 7);
        Arrays.stream(nums).forEach(value -> System.out.print(" " + value));
    }

    public static int getMiddle(int[] nums, int low, int heigh) {

        int temp = nums[low];
        while (low < heigh) {

            while (low < heigh && nums[heigh] > temp) {
                heigh--;
            }
            nums[low] = nums[heigh];
            while (low < heigh && nums[low] < temp) {
                low++;
            }
            nums[heigh] = nums[low];
        }
        nums[low] = temp;
        return low;
    }

    public static void quickSort(int[] nums, int low, int heigh) {
        if (low < heigh) {
            int middle = getMiddle(nums, low, heigh);
            quickSort(nums, low, middle - 1);
            quickSort(nums, middle + 1, heigh);
        }
    }


    public static void bubbleSort(int[] nums) {
        int size = nums.length;
        int temp = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
