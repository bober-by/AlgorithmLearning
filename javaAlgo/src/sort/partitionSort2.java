package sort;

/*
    荷兰国旗问题：
        给定一个数组arr，和一个常数num，将数组中小于num的值放数组左边，大于num的放右边，等于num的放中间
 */

public class partitionSort2 {

    public static void partition(int[] arr,int num){
        // 记录左边小于num的下标
        int less = 0;
        // 记录右边第一个大于num的下标
        int more = arr.length -1;
        // 记录当前下标
        int cur;
        for(cur = 0;cur<=more;cur++){

            if(arr[cur] < num){
                Swap(arr,less,cur);
                less++;
            }
            else if(arr[cur] > num){
                Swap(arr,cur,more);
                more--;
                --cur;
                continue;
                }
            }
        }



    public static void Swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {                                                               
        int[] arr = {16, 23,20, 43, 2, 9, 21,20,18,20, 56, 1, 19, 82};
        int num = 20;
        partition(arr, num);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");

        }
    }
}
