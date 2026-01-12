public class LinearSearch {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6};
        int target = 1;
        int result1 = linearSearch(nums,target);

        if(result1!=-1) {
            System.out.println("The element is found at index : " + result1);
        }else{
            System.out.println("Element is not found");
        }

    }

    private static int linearSearch(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
                return i;
        }
        return -1;
    }
}
