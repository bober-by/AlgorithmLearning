package bob.sort;


/*

     Given an array and a cosnst named num, design a function to put the number smaller than num
    contained in the array in it's left ,and put the number bigger than num in array's right position
 */
public class ExchangeSort {

    public static void exchange(int[] arr,int num){
        int temp = 0;
        int r = arr.length-1;
        for (int i = 0;i <arr.length;i++){
            if(arr[i]>num){
                temp = arr[i];
                for (int j=r;j>=0;j--){
                    if(i==j){
                        return;
                    }
                    else if (arr[j]<num){
                        arr[i] = arr[j];
                        arr[j] = temp;
                        r = j;
                        break;
                    }
                }
            }
        }
    }

    public static void partition(int[] arr, int l ,int r ,int mid){




    }

    public static void main(String[] args) {

        int[] arr = {16, 23, 43, 2, 9, 21, 18, 56, 1, 19, 82};;
        int num = 20;
        exchange(arr,num);
        for (int i = 0;i <arr.length;i++){
            System.out.print(arr[i] + "  ");
        }

    }
}
