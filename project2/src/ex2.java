import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex2 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        Integer[]arr=list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));



        int n=list.size();
        buggy(n,list);

    }
    public static int buggy(int n, List<Integer> arr){
        int sum=0;
        for (int i = 0; i <n; i++) {
            if(arr.get(i)<10 && arr.get(i)%2!=0) {
//                sum+=factorial(arr.get(i));
//                System.out.println(arr.get(i));
                System.out.println("fact=" + factorial(arr.get(i)));
            }
        }
        return sum;
    }

    public static int factorial(int n) {
//        System.out.println((n == 1 || n == 0) ? 1 : factorial(n - 1) + n);
        return (n==1||n==0) ? 1:n*factorial(n-1);
    }
}
