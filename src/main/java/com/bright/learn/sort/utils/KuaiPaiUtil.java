package com.bright.learn.sort.utils;

public class KuaiPaiUtil {

    public static int[] sort(int[] nums, int n) {
        quickSort(nums,0, nums.length-1);
        return nums;
    }

    private static void quickSort(int[] nums, int begin, int end){

        if(begin>=end){
            return;
        }

        int position = partion(nums,begin,end);

        quickSort(nums,begin,position-1);

        quickSort(nums,position+1,end);
    }

    private static int partion(int[] nums, int begin, int end){

        int pivot = end;

        int i=begin,j=begin;

        for(;j<end;j++){
            if(nums[j] < nums[pivot]){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
        }
        int temp = nums[i];
        nums[i]=nums[pivot];
        nums[pivot]=temp;

        return i;
    }

    public static void main(String[] args) {
//        int[] nums = {6,4,5,2,7,1,3,5,332,53,43};
//        int[] nums = {1,2,3,4,5,6};
        int[] nums = {6,5,4,3,2,1};
        int[] res = sort(nums,nums.length);
        for (int i: res) {
            System.out.println(i);
        }
    }
}
