package sort;

// 插入排序
public class InsertionSort {
    public static void insertSort(int[] arr) {

        // 判断数组是否符合要求
        if (arr == null || arr.length < 2){
            return;
        }

        // 每次对前i个数进行排序，从第i个数向前比较交换
        for (int i = 0; i < arr.length; i++){
            for ( int j = i ; j > 0; j--){
                if (arr[j]>arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }

    }

    public static void swap(int[] arr, int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
