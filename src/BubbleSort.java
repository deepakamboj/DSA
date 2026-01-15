import java.util.Arrays;

public class BubbleSort {
    //greatest element reached at the last
    public static void main(String[] args) {
        int nums[] ={6,4,8,9,2,5};
        int size = nums.length;
        int temp=0;

        System.out.println("Before sorting : ");
        for(int num:nums){
            System.out.print(num +" ");
        }

        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){

                if(nums[j]>nums[j+1]){
                temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
                }
            }
            System.out.println((i+1)+"th iteration");
            for(int num:nums){
                System.out.print(num+" ");
            }
        }
        System.out.println();
        System.out.println("After sorting : ");
        for(int num:nums){
            System.out.print(num +" ");
        }
    }
}
