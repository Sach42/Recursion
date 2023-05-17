package Recursion;

public class problem3 {
    public static int max(int[] arr, int i){
        if(i==1)
        return arr[0];

        return Math.max(arr[i-1],max(arr, i-1));
    }
    public static void main(String[] args) {
        int[] arr = {13,1,-3,22,5};
        int i = arr.length;
        System.out.println(max(arr,i));
    }
}
