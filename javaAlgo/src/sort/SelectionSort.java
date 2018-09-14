package sort;

public class SelectionSort {
    // 交换排序：每一趟遍历找出最小值后与第i个元素交换，i++

    public static void selectionSort(int[] arr){

        if(arr == null || arr.length <2){
            return;
        }

        for (int i = 0;i < arr.length -1; i++){
            // 假设当前arr[i]为最小值
            int min = i;
            // 从i+1开始遍历，每一趟遍历找出最小值的下标，用min记录
            for(int j = i+1;j<arr.length -1;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            // 交换最小值与初始值
            Swap(arr,i,min);
        }
    }

    public static void Swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
