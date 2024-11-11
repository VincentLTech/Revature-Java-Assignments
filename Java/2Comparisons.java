public class 2Comparisons{
    public boolean isEqual(int a, int b){
        return a==b;
    }

    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is greater than b, false otherwise.
     */
    public boolean greaterThan(int a, int b){
        return a>b;
    }
    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is less than b, false otherwise.
     */
    public boolean lessThan(int a, int b){
        return a<b;
    }
    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is greater than or equal to b, false otherwise.
     */
    public boolean greaterThanOrEqualTo(int a, int b){
        return a>=b;
    }
    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is less than or equal to b, false otherwise.
     */
    public boolean lessThanOrEqualTo(int a, int b){
        return a<=b;
    }

    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is not equal to b, false otherwise.
     */
    public boolean notEqualTo(int a, int b){
        return a!=b;
    }
}