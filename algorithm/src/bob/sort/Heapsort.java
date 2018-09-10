package bob.sort;

public class Heapsort {

    // 顺序表实现大根堆

    public static int[] Heapsort(int[] arr){

        if(arr == null || arr.length < 2){

            return arr;
        }

        // 从第一元素开始，依次入堆,创建大根堆
        for(int i = 0 ;i< arr.length;i++){

            heapInsert(arr,i);
        }

        // 大根堆排序
        int size = arr.length;
        Swap(arr,0,--size);
        while (size > 0){

            heapify(arr,0,size);
            Swap(arr,0,--size);

        }

        return arr;

    }

    // 大根堆排序，每趟排序固定一个最大值
    public static void heapify(int[] arr,int index,int heapSize){

        int leftchild = index * 2 + 1;

        while (leftchild < heapSize){

            int largest = leftchild + 1 < heapSize && arr[leftchild] < arr[leftchild + 1] ? leftchild + 1 : leftchild;

            largest = arr[largest] > arr[index] ?largest : index;

            if(largest == index){
                break;
            }
            Swap(arr,largest,index);
            index = largest;
            leftchild = index * 2 + 1;
        }
    }

    // 创建堆
    public static void heapInsert(int[] arr,int index){

        // 当前元素大于父元素，交换，逐层向上比较
        while (arr[index] > arr[(index -1) / 2 ]){

            Swap(arr,index,(index -1) / 2 );

            index = (index -1) / 2;
        }

    }

    public static void Swap(int[] arr, int a, int b){

        int temp = arr[a];

        arr[a] = arr[b];

        arr[b] = temp;
    }


    public static void main(String[] args) {

//        int[] arr = {16, 23, 20, 43, 2, 9, 21, 20, 18, 20, 56, 1, 19, 82};
        int[] arr = {16, 23, 20, 43, 2, 9};
        int[] arr1 = Heapsort(arr);

        for (int i = 0; i < arr1.length; i++) {

            System.out.print(arr1[i] + "  ");
        }

    }
}
