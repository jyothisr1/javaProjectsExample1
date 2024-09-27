public class longestcommonprefix {
    public static void main(String[] args) {
        int sr=0;
        String[] st={"geeksforgeeks", "geeks", "geek", "geezer"};
        for(int i=0;i<st.length-2;i++){
            if(st[i].length()<st[i+1].length()){
                sr=i;
            }
            else{
                sr=i+1;
            }
        }
        String ss="";
        for(int i=0;i<st[sr].length()-1;i++){
            char ch=st[0].charAt(i);

            if(st[0].charAt(i)==ch||st[1].charAt(i+1)==ch||st[2].charAt(i)==ch||st[3].charAt(i)==ch){
                ss=ss+st[0].charAt(i);
            }
        }
        System.out.println(ss);
    }
}
