package bob.sort;

import java.util.Arrays;

public class Bubblesort {

    public static void RightMethod(int[] arr){
        Arrays.sort(arr);
    }

    public static int[] generateRandomArray(int size,int value){
        // 生成随机长度的数组
        // Math.random() -----> double [0,1)
        int[] arr = new int[(int) ((size + 1) * Math.random())];
        for (int i = 0 ;i<arr.length;i++){
            arr[i] = (int) ((value + 1) * Math.random()) - (int)((size + 1) * Math.random());
        }
        return arr;
    }

    public static void bubbleSort(int[] arr) {

        // 判断数组是否符合排序要求
        if (arr == null || arr.length < 2){
            return;
        }

        for (int end = arr.length - 1;end > 0; end--){
            for (int i = 0; i < end; i++){
                if (arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }

    }

    public static void swap(int[] arr,int i,int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
