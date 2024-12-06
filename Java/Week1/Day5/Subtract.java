
public class Subtract {
    public double sub(double a, double b){//return a minus b
        return a-b;// numbers, but prices are better represented with doubles / decimal numbers.
    }
    public static void main(String[] args) {
        Subtract subtract = new Subtract();
        System.out.println(subtract.sub(10.5, 5.2));
    }
}