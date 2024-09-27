import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int n=scan.nextInt();
//        for(int i=0;i<n;i++){
//
//        }
        int n=7;
        int[] ar={1,2,3,6,3,6,1};
        for(int i=0;i<n;i++){
            for(int j=i;j<n-1;j++){
                if(ar[i]==ar[j+1]){
                    System.out.print(ar[i]+",");
                }
            }
        }
    }
}
