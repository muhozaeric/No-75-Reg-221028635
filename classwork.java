//the program will calculate the simple interest of mr bob
public class classwork {
    static double amount(double p,double r,double t){ //main method
        return (p*r*t)/100;
    }

        public static void main(String[]args){ 
            classwork A =new classwork();//calling of main method
            double b=100000;
            double c=5;
            double d=5;
            System.out.println(A.amount(b,c,d));//printing interest after three years
        }
     
}
