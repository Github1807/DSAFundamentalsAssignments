package assignments;

public class RecursiveCodeForPalindrome {
    public static boolean CheckPalindrome(String s,int i,int j){
        if(i==j || i>j){
            return true;
        }
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        else{
          CheckPalindrome(s,++i,--j);
        }
        return true;
    }
    public static void main(String[] args) {
        String s="TejaswiniMeshram";
        System.out.println(palindrome(s,0,s.length()-1));
    }
}
