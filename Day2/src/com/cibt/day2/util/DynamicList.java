package com.cibt.day2.util;

public class DynamicList<T>{
    private int counter=0;
    private int start=-1;
    private Object[] nums=new Object[counter];

    public void add(T n){
        if(counter==0){
            nums=new Object[++counter];
            nums[counter-1]=n;
            
        }else{
            
            Object[] nums1=new Object[++counter];

            for(int i=0;i<counter-1;i++){
                nums1[i]=nums[i];
            }
            nums1[counter-1]=n;
            nums=nums1;
            
        }
    }

    public boolean remove(int index){
        if(index>=counter){
            return false;
        }

        Object[] nums1=new Object[counter-1];
        for(int i=0;i<index;i++){
            nums1[i]=nums[i];
        }

        for(int i=index+1;i<counter;i++){
            nums1[i-1]=nums[i];
        }
        counter--;
        nums=nums1;
        return true;
    }

    public T get(int index){
        if(index<counter){
            return (T)nums[index];
        }
        System.out.println("index out of bound");
        return null;
    }


    public int size(){
        return counter;
    }

    public Object getValue(){
        return nums[start];
    }

    public boolean next(){
        start++;
        if(start<nums.length){
            return true;
        }
        return false;
    }

}