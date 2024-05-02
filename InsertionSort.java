public class InsertionSort {
    public static void main(String[] args) {
        int [] nums = {5,6,2,3,1};
        insertion(nums);

        for(int num:nums){
            System.out.print(num + " ");
        }
    
    }
    public static void insertion(int [] array){
        for (int i= 1; i<array.length;i++){
            int temp = array[i];
            int j = i-1;
            while (j>=0 && array[j]>array[j+1]) {
                temp = array [j+1];
                array[j+1]= array[j];
                array[j]= temp;
                j--; 
            }
        }
    }
}
