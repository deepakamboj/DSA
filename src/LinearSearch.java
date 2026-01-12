public class LinearSearch {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6};
        int target = 5;
        int result1 = linearSearch(nums,target);

        if(result1!=-1) {
            System.out.println("The element is found at index : " + result1);
        }else{
            System.out.println("Element is not found");
        }

    }

    private static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for(int i=0;i<nums.length;i++){
            steps++;
            if(nums[i]==target) {
                System.out.println("steps taken by linear search : " + steps);
                return i;
            }
        }
        System.out.println("steps taken by linear search : "+steps);
        return -1;
    }
}
