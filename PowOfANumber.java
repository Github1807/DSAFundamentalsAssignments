package assignments;

public class PowOfANumber {
    public static int pow(int num,int pow){
        if(pow==1){
            return num;
        }
        else{
            return num*pow(num,pow-1);
        }
    }
    public static void main(String[] args) {
        int pow=5;
        int num=5;
        System.out.println(pow(num,pow));
    }
}
