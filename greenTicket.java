package Dlite;


public class greenTicket{
    public static void main(String []args){
        int result1=green_ticket(1, 2, 3);
        int result2=green_ticket(2, 2, 2);
        int result3=green_ticket(1, 1, 2);
        System.out.println("result1 :"+result1+"\nresult2 :"+result2+"\nresult3 :"+result3);
    }
    static int green_ticket(int a,int b,int c){
        if((a==b)&&(b==c)){
            return 20;
        }
        else if((a==b)||(a==c)||(b==c)){
            return 10;
        }
        else{
            return 0;
        } 

    }
}