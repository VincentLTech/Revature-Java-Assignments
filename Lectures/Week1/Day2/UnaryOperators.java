public class UnaryOperators {
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
