package Day1;
public class Vehicle {
    static int carnum=123;  
    static String Carname="Innova";
    static  int bikeNum=5678;
     static String bikeName="Passion";
    
static void myCar()
{
    System.out.println(carnum);
    System.out.println(Carname);
}

static void myBike()
{
    System.out.println(bikeNum);
    System.out.println(bikeName);
}
}
class volvo{
public static void main(String[] args) {
  
    Vehicle.myCar();
    Vehicle.myBike();
   }
}