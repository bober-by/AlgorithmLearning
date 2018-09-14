package sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        sortProcess(arr, 0, arr.length - 1);
    }

    public static void sortProcess(int[] arr, int L, int R) {
        if (L == R) {
            return;
        }
        // (L + R)/2 ===>L+R maybe result in overflow
        // (L + R)/2 == L + (R-L)/2 ===> divide by 2 is equal to right shift 1 byte === L + （R-L)>>1
        // Right shift operation is faster than arithmetic operation
        int mid = L + ((R - L) >> 1);
        sortProcess(arr, L, mid);
        sortProcess(arr, mid + 1, R);
        merge(arr, L, mid, R);

    }

    public static void merge(int[] arr, int L, int mid, int R) {
        // create a temp array
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= R) {
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= mid) {
            help[i++] = arr[p1++];
        }
        while (p2 <= R) {
            help[i++] = arr[p2++];
        }
        for (i = 0; i < help.length; i++) {
            arr[L + i] = help[i];
        }

    }

    // for test
    public static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    public static void correctSort(int[] arr) {
        Arrays.sort(arr);

    }

    public static void main(String[] args) {

        int[] arr = {16, 23, 43, 2, 9, 21, 18, 56, 1, 19, 82};
        int[] arr2 = copyArray(arr);
        mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("  ");
        correctSort(arr2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr2[i] + "  ");
        }

    }
}

