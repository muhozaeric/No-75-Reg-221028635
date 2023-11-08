
//interface
interface E {
    void car();
}
class A extends B implements E { //class A extend B impliments C

   public void car(){
        System.out.println("LANDCRUISER");

    }
    public void vehicle() {
        System.out.println("LANDCRUISER");
    }
}
class B extends C {//class B extend C
public void speed(){
    System.out.println("80km/h");
}
}
class C extends D {//class C extend D
    public void color(){
        System.out.println("black");
    }
}
class D {//class D
    public void fuel(){
        System.out.println("benzine");
    }
}
//main class
public class eric1 {
    
    public static void main(String[]args){
        //object main
        A Object=new A ();
        Object.vehicle();//calling methods
        Object.speed();
        Object.color();
        Object.fuel();
    }
}