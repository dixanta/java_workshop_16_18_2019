package com.cibt.day1;

import com.cibt.day1.utils.StringHelper;
import com.cibt.day1.utils.ArrayHelper;

public class Program{

    private static void print(Object message){
        System.out.println(message);
    }
    public static void main(String[] args){
        
        int[] nums={12,3,5,7,8,9,15,23,5,45,67,43};

        int param=450;
        
        int index=-1;

        for(int i=0;i<nums.length;i++){
           for(int j=i+1;j<nums.length;j++){
               if(nums[i] < nums[j]){
                   int temp=nums[i];
                   nums[i]=nums[j];
                   nums[j]=temp;
               }
           }
        }

        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        

        
    }
}