package bob.sort;

public class Sort {

    // 递归
    public static int getMax(int[] arr,int L ,int R){

        if(L==R){
            return arr[L];
        }
        int mid = (L +R)/2;

        int maxl = getMax(arr,L,mid);

        int maxr = getMax(arr,mid+1,R);

        return Math.max(maxl,maxr);
    }



    public static void main(String[] args) {

        int[] arr = {4,6,8,3,1,5};

        int maxNum = getMax(arr,0,arr.length-1);
        System.out.println(maxNum);


    }
}
