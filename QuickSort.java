public class QuickSort {
    public static void main(String[] args) {
        int [] nums = {5,6,2,3,1};
        quickSort(nums, 0, nums.length-1);

        for(int num:nums){
            System.out.print(num + " ");
        }
    
    }
    public static void quickSort(int [] array, int low, int high){
        if (low < high){
        int p = partition(array, low, high);
        quickSort(array, low, p - 1);
        quickSort(array, p + 1, high);
        }
    }
    private static int partition(int[] array, int low, int high) {
        int pivot = high;
        int t =0;
        int j= low-1;
        for (int i = low; i <= high-1; i++) {
            if(array[i]<array[high]){
                j++;
                t=array[j];
                array[j]=array[i];
                array[i]=t;
            }
        }
        t=array[j+1];
        array[j+1]=array[high];
        array[high]=t;
        pivot=j+1;
        return pivot;
}
}
