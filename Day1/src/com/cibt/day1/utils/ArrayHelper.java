package com.cibt.day1.utils;

public class ArrayHelper{
    public static int max(int[] nums){
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }

    public static int min(int[] nums){
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }

    public static int[][] zeros(int i,int j){
        int[][] nums=new int[i][j];
        return nums;
    }

}