    //this program will display adults basing on the conditon
public class ifelse {   
  public static void main(String[]args){//main method
   // initialization anddaclaration
    int age=50;
    if(age<55){
        System.out.println("adults");//display adults if condition is true
    }
    else if(age>=40 && age<50){
        System.out.println("middle");//display middle if condition is true
    }
    else if(age>=20 && age<35){
        System.out.println("youth");//display youth if condition is true
    }
    else if(age>=15 && age<18){
        System.out.println("young");//display young if condition is true
    }
    else if(age>=10 && age<12){
        System.out.println("child");//display chld if condition is true
    }
    else
    {
        System.out.println("baby"); //output
    }
}
}