package Recursion;

public class problem1 {
    public static int sum_of_dit(int n){
        if(n==0){
            return 0;
        }
        else{
            return n%10 + sum_of_dit(n/10);
        }
    }
    public static void main(String[] args) {
        int n = 12345;
        int ans = sum_of_dit(n);
        System.out.println(ans);
    }
}
