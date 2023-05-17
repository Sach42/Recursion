package Recursion;

public class problem5 {
   static int rev=0,r;
    public static int check(int n){
        if (n > 0) {
            r = n % 10;
            rev = rev + r * r * r;
            check(n / 10);
        }
        return rev;
    }
    public static void main(String[] args) {
        int n = 153;
        int ans = check(n);
        if(ans==n){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
