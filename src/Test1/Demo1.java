package Test1;

public class Demo1 {
    public static int main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        int resIndex = SearchInsert(nums,0,nums.length-1,target);
        System.out.println(target);
        return target;
    }
    public static int SearchInsert(int[] nums, int left, int right, int target){

        while (left<=right){
            int mid = (left+right)/2;
            if (nums[mid]==target){
                return mid;
            }else if (nums[mid]>target){
                return SearchInsert(nums,mid+1,right,target);
            }else {
                return SearchInsert(nums,left,mid-1,target);
            }
        }
        if (left>right) return left;
        return left;
    }
}
