import java.util.Scanner;

public class reverse1 {
    public static void main(String[] args) {
        int sr=0;

        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        String st="";
        int end=s.length()-1;
        for(int i=s.length()-1;i>=0;i--){
//            System.out.println(s.charAt(i));
            char ch=s.charAt(i);
            if(ch==' '){
                for(int j=i+1;j<=end;j++){
                    st=st+s.charAt(j);
                }st=st+" ";
                end=i-1;
            }

        }
        for(int j=0;j<=end;j++){
            st=st+s.charAt(j);
        }
        System.out.println(st);
    }
}
