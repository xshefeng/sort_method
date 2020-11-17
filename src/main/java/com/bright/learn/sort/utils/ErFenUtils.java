package com.bright.learn.sort.utils;

public class ErFenUtils {

    public static int search(int[] nums, int target) {
        return erFenSearch(nums,0,nums.length-1,target);
    }
    private static int erFenSearch(int[] nums, int begin, int end, int target){

        if(begin >= end) return begin;

        int mid = begin+((end - begin)>>1);

        if(nums[mid] < target) {
            return erFenSearch(nums, mid+1, end,target);
        } else if (nums[mid] > target) {
            return erFenSearch(nums, begin, mid-1,target);
        } else {
            //重复元素取最后一个
            if(nums[mid+1] == target) {
                return erFenSearch(nums, mid+1, end ,target);
            } else {
                return mid;
            }

        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,4,5,6,8,8,8,8,18};

        int res = search(nums,8);
        System.out.println(res);
        System.out.println(nums[res]);
    }
}
