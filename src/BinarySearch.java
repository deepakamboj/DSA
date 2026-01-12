public class BinarySearch {

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6};
        int target = 5;
      //  int result1 = linearSearch(nums,target);
        int result2 = BinarySearch(nums,target);
        if(result2!=-1) {
            System.out.println("The element is found at index : " + result2);
        }else{
                System.out.println("Element is not found");
             }

    }



    public static int BinarySearch(int[] nums, int target) {
        int left=0;
        int right = nums.length-1;

        while(left<=right){

            int mid = (left+right)/2;

            if(nums[mid]==target)
                return mid;
            else if (nums[mid]<target) {
                left = mid + 1;
            }else{
                   left = mid-1;

            }

        }
        return -1;
    }
}
