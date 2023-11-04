public class question2 {//program will calculate thr compound interest of mr bob
   static double amount(double p,double r,double t,double n){
    return p*(Math.pow(1+(r/(n*100)),n*t));
   }
        public static void main(String[]args){// main method
            question2 A = new question2();
            double p = 500000;
            double r=18;
            double t=3;
            double n=12;
            System.out.println(A.amount(500000, 18, 3,12));//output
        }
}

