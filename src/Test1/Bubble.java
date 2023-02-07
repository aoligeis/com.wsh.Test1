package Test1;

public class Bubble {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 1, 5, 2, 8, 6, 4, 56, 8};
        int i;
        int j;
        for(i = 1; i < nums.length; ++i) {
            for(j = 0; j < nums.length - i; ++j) {
                if (nums[j + 1] < nums[j]) {
                    int a;
                    a = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = a;
                }
            }
        }
        for (int a : nums) {
            System.out.print(a+" ");
        }
        //for( int a:nums) {
         //   System.out.print(a+ " ");
        }

    }

