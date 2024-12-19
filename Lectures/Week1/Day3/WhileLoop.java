public class WhileLoop {
    public static void main(String[] args) {
        //A for loop is an iteration method that is best used when you know the number of iterations ahead of time
        //A while loop is an iteration method that is best used when you don't know the number of iterations ahead of time
        boolean on = true;
        while (on){
    		System.out.println("Inside the while loop");
    		on = false;
    	}

        int d = 1;
        while (d <= 5){
            System.out.println(d);
            d++;
        }
    }
}
