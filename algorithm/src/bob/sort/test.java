package bob.sort;

public class test {

        public static void quickSort(int[] arr) {
            if (arr == null || arr.length < 2) {
                return;
            }
            quickSort(arr, 0, arr.length - 1);
        }

        public static void quickSort(int[] arr, int l, int r) {
            if (l < r) {
                swap(arr, l + (int) (Math.random() * (r - l + 1)), r);
                int[] p = partition(arr, l, r);
                quickSort(arr, l, p[0] - 1);
                quickSort(arr, p[1] + 1, r);
            }
        }

        public static int[] partition(int[] arr, int l, int r) {
            int less = l - 1;
            int more = r;
            while (l < more) {
                if (arr[l] < arr[r]) {
                    swap(arr, ++less, l++);
                } else if (arr[l] > arr[r]) {
                    swap(arr, --more, l);
                } else {
                    l++;
                }
            }
            swap(arr, more, r);
            return new int[] { less + 1, more };
        }

        public static void swap(int[] arr, int i, int j) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }



        // for test
        public static void printArray(int[] arr) {
            if (arr == null) {
                return;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        // for test
        public static void main(String[] args) {

            int[] arr1 = {16, 23,20, 43, 2, 9, 21,20,18,20, 56, 1, 19, 82};
            quickSort(arr1);
            printArray(arr1);

        }



}
