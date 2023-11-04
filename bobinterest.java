//the program will calculate simple interest
class work{
    public static double interest(double p,double r,double t){ // main method
return p*r*t;
    }
    public static void main(String[]args){
    //declaration and initialization
double p=100000;
double r=0.05;
double t=5;
double result=interest(p,r,t);
System.out.println(+result); //print output
    }
    }
