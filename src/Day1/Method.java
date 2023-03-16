package Day1;

public class Method {
    //static method with no retuirn type
    static void myName()
    {
        System.out.println("Mahesh");
    }
    //non static method with no return type
    public void mySurname()
    {
        System.out.println("Nehere");
    }
    public static void main(String[] args) {
        myName();      //static method directly called
        Method info = new Method();  // created object of class
        info.mySurname();//non static method called with class object.
        
    }

}
