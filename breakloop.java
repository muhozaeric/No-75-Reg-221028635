//Java Program to demonstrate the use of break statement 
public class breakloop {
    public static void main(String[]args){
       // using for loop
        for(int n=2;n<=10;n++){
            if(n==10)
            // breaking the loop
            break;
            System.out.println("n:" + n); //print the value of n
        }
    }
    
}
