public class bubbleSort {
    public static void main (String [] args){
    int nums [] = {12,8,2,9,4,7,1};
    int temp = 0;

    for(int i=0; i<nums.length;i++){
        for(int j=0; j<nums.length-1;j++){
            if (nums[j]>nums[j+1]){
                temp = nums [j+1];
                nums[j+1]= nums[j];
                nums[j]=temp;
            }
        }
    }

    for(int num:nums){
        System.out.print(num+" ");
    }
}
}