package Recursion;

public class problem4 {
    public static int sum(int[] arr, int i){
        if (i <= 0)
            return 0;
        return (sum(arr, i-1) + arr[i - 1]);
    }
    public static void main(String[] args) {
        int[] arr = {92,33,15,-20,10};
        System.out.println(sum(arr,arr.length));
    }
}
