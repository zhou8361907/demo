package com.example.test;

public class leet {
    public int removeDuplicates(int[] nums,int target) {
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != target){
                nums[i++] = nums[j];
            }
        }
        return i;
    }

    public static String toBinaryString(int num) {
        if (num == 0) return ""+0;
        String result = "";
        // 左面0的个数
        int n = Integer.numberOfLeadingZeros(num);
        num <<= n;
        for (int i=0; i<32-n; ++i) {
            int x = (Integer.numberOfLeadingZeros(num) == 0)?1:0;
            result += x;
            num <<= 1;
        }
        return result;
    }


    public static void main(String[] args) {
//        leet leet = new leet();
//        int[] n = {1,1,1,3,4,65,7,8,8,9};
//        leet.removeDuplicates(n,3);


        int i = 16;
        System.out.println("正常："+Integer.toBinaryString(i));
        System.out.println("反码："+Integer.toBinaryString(~i));
        System.out.println("补码："+(Integer.toBinaryString(~i+1)));
        System.out.println("正常^补码："+(Integer.toBinaryString(i^(~i+1))));
    }
}
