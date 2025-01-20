public class Operators{
    private static void main(String[] args){
        ArithmeticOperators arithmeticOperators = new ArithmeticOperators();
        arithmeticOperators.main(args);
    }
}
class ArithmeticOperators{  
    public static void main(String args[]){  
        int a=10;  
        int b=5;  
        System.out.println(a+b);//15  
        System.out.println(a-b);//5  
        System.out.println(a*b);//50  
        System.out.println(a/b);//2  
        System.out.println(a%b);//0  
    }
} 

class ComparisonsOperators{
    public static void main(String[] args){
        int a= 10;
        int b =5;
        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a!=b);
        
    }
}

class UnaryOperators {
    public static void main(String[] args) {
        int num = 10;
        // Increment operator
        System.out.println("Increment: " + num++);//10 (11) 
        
        // Decrement operator
        System.out.println("Decrement: " + num--);//11 (10)  
        
        // Increment operator
        System.out.println("Increment: " + ++num);//11
        
        // Decrement operator
        System.out.println("Decrement: " + --num);//10
        
        // Unary negation operator
        System.out.println("Negation: " + -num);
        
        // Bitwise NOT operator
        System.out.println("Bitwise NOT: " + ~num);
        
        // Logical NOT operator
        System.out.println("Logical NOT: " +!true);
    }
}