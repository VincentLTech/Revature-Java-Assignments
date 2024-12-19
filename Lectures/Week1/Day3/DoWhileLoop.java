public class DoWhileLoop {
    public static void main(String[] args) {
        //A `do...while` loop gets executed at least once, even if the condition is false.
        boolean on2 = false;
    	do{
    		System.out.println("Inside the do-while loop");
    	} while (on2);

        int x = 0;
        do{
    		System.out.println(x);
            x++;
    	} while (x<5);

        int y = 0;
        do{
    		System.out.println(y);
            y++;
    	} while (y<1);

        int z = 0;
        do{
    		System.out.println(z);
            z++;
    	} while (z<0);
    }
}
