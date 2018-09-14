package sort;

public class QuickSort {

    public static void quickSort(int[] arr,int L,int R){
        if(L < R){
            int[] p = partition(arr,L,R);
            quickSort(arr,L,p[0]);
            quickSort(arr,p[1]+1,R);
        }

    }

    public static int[] partition(int[] arr,int L,int R){
        int less = L -1;
        int more = R;
        while (L < more){
            if(arr[L] < arr[R]){
                Swap(arr,++less,L++);
            }
            else if (arr[L] > arr[R]){
                Swap(arr,--more,L);
            }
            else {
                L++;
            }
        }
        Swap(arr,more,R);
        return new int[] {less,more};

    }

    public static void Swap(int[] arr,int l,int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {16, 23,20, 43, 2, 9, 21,20,18,20, 56, 1, 19, 82};
        quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

    }
}
