package com.bright.learn.sort.utils;

public class SortLevel2Utils {


    public static int[]  guibing(int[] nums, int length){
        int[]  res = map(nums,0,length-1);
        return res;
    }

    public static int[] map(int[] nums, int begin, int end){
        if(begin>=end){
            return new int[]{nums[begin]};
        }
        int pos = (begin+end)/2;
        int[] numsPre = map(nums,begin,pos);
        int[] numsEnd = map(nums,pos+1,end);
        return reduce(numsPre,numsEnd);
    }
    public static int[] reduce(int[] preNums, int[] endNums){
        int[] res = new int[preNums.length+endNums.length];
        int i=0,j=0,k=0;
        while(i<preNums.length && j< endNums.length){
            if(preNums[i]<=endNums[j]){
                res[k++]=preNums[i++];
            } else {
                res[k++]=endNums[j++];
            }
        }
        if(i<preNums.length) {
            for(;i<preNums.length;i++){
                res[k++]=preNums[i];
            }
        }
        if(j<endNums.length) {
            for(;j<endNums.length;j++){
                res[k++]=endNums[j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {6,4,5,2,7,1,3,5,332,53,43};
//        int[] nums = {1,2,3,4,5,6};
//        int[] nums = {6,5,4,3,2,1};
        int[] res = guibing(nums,nums.length);
        for (int i: res) {
            System.out.println(i);
        }
    }
}
