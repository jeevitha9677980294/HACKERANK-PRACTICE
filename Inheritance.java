

class Arithmetic {
    int add(int a,int b){
        return a+b;
    }
}
class Adder extends Arithmetic{
    
}

public class Inheritance {
    public static void main(String[] args) {
        Adder adder = new Adder();
        int result = adder.add(5, 10);
        System.out.println("The sum is: " + result);
    }
}