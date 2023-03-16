package Day1;
//method with return type
public class Method1 {
    static int calculateSum(int x,int y)// static method
    {
       return x+y;
    }

    public int multiply(int a , int b) //non static method
    {
        return a*b;
    }

    public static void main(String[] args) {

        Method1 product = new Method1();///class object created for non static method
    
        System.out.println(calculateSum(2, 2));//output of static method
        System.out.println(product.multiply(3, 3));//output of non static method
    }

}
