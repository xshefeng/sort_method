package com.bright.learn.sort.utils;

public class SortUtils {

    public static void maoPao(int[] nums){

        int length = nums.length;
        boolean ismove = false;
        for(int i=0; i<length; i++){
            for(int j=0; j<length-i-1; j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1]=temp;
                    ismove=true;
                }
            }
            System.out.println(i+"次");
            if(!ismove){
                break;
            }
        }

    }

    public static void charu(int[] nums){
        int length= nums.length;
        for(int i=1; i<length ; ++i){
            int value = nums[i];
            int j=i-1;
            for(; j>=0; j--){
                if(nums[j] > value) {
                    nums[j+1] = nums[j];
                } else {
                    break;
                }
            }
            nums[j+1]=value;
        }

    }

    public static void kuaipai(int[] nums){

    }
    public static void main(String[] args) {
//        int[] nums = {6,4,5,3,1,3};
//        int[] nums = {1,2,3,4,5,6};
        int[] nums = {6,5,4,3,2,1};
        charu(nums);
        for (int i: nums) {
            System.out.println(i);
        }
    }
}
