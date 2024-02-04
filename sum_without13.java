package Dlite;

public class sum_without13 {
    public static void main(String []args){
        int result1=luckysum(1, 2, 3);
        int result2=luckysum(1, 2, 13);
        int result3=luckysum(1, 13, 3);
        System.out.println("result1 :"+result1+"\nresult2 :"+result2+"\nresult3 :"+result3);
    }
    static int luckysum(int a,int b,int c){
        if(a == 13){
            return 0;
        }
        else if(b == 13){
            return a;
        }
        else if(c == 13){
            return a+b;
        }
        else{
            return a+b+c;
        }
    }
}
