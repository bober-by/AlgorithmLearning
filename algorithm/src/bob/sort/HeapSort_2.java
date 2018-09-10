package bob.sort;

/*
    堆排序案例：
        将含有n个数据的数组存储到一个大根堆和一个小根堆中，各含有n/2各数据

    思路：
        大根堆存储小的数据，小根堆存储大的数据，每次将数据插入大根堆中，然后比较大根堆与小根堆的结点数量，
        若大根堆> 小根堆+1，则去大根堆根节点存入小根堆，然后取大根堆最后一个叶结点放入根节点，排序
 */

public class HeapSort_2 {

    public static void heapsort(int[] arr){

        if(arr == null || arr.length < 2){
            return;
        }

        int[] barr = {};
        int[] sarr = {};
        // 依次入堆
        for (int i = 0; i < arr.length ; i++){

            heapInsertbig(barr,i);
            int heapsize = barr.length;

            // 判断
            if (heapsize > sarr.length + 1){

                heapSortsmall(sarr,i);
                swap(barr,0,--heapsize);
                heapInsertbig(barr,0);

            }

        }
    }

    // 堆排序
    public static void heapify(int[] arr, int index,int heapsize){

        int leftchild = index * 2 + 1;

        while (leftchild < heapsize){

            // 获取左右子结点中最大的结点
            int largest = leftchild + 1 < heapsize && arr[leftchild + 1] > arr[leftchild] ? leftchild + 1 :leftchild;

            largest = arr[index] > arr[largest] ? index :largest;

            if(largest == index){
                break;
            }

            swap(arr,index,largest);
            index = largest;
            leftchild = index *2 +1;

        }


    }

    // 创建大根堆
    public static void heapInsertbig(int[] arr, int index){

        while (arr[index] > arr[(index-1)/2]){

            swap(arr,index,(index-1)/2);

            index = (index - 1) / 2;
        }

    }

    // 创建小根堆
    public static void heapSortsmall(int[] arr,int index){

        while (arr[index] < arr[(index - 1) / 2]){
            swap(arr,index,(index - 1)/2);
            index = (index - 1) / 2;
        }

    }

    public static void swap(int[] arr,int a, int b){

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

    public static void main(String[] args) {

    }
}
