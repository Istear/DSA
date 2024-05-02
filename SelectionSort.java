public class SelectionSort {
    public static void main (String [] arg){
        int num [] = {2,6,8,9,4,2,7,6,9,4,3};
        int minIndex = 0;
        int temp = 0;

        for (int i=0; i<num.length; i++){
            minIndex = i;
            for(int j=i+1; j<num.length;j++){
                if(num[minIndex]>num[j]){
                    minIndex=j;
                }
            }
            temp = num [i];
            num [i] = num [minIndex];
            num [minIndex] = temp;
        }
        for(int a:num){
            System.out.print(a+" ");
        }
    }
}
