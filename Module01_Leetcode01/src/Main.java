import Day01.SuanFa_35_SearchInsertSolution;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SuanFa_35_SearchInsertSolution sol = new SuanFa_35_SearchInsertSolution();
        int[] nums = {1,3,5,6};
        int target = 4;
        int result = sol.SearchInsert(nums, 0, nums.length - 1, target);
        System.out.print("result: " + result);
    }
}