
public class IfStatement {
    /**
     * An if statement uses a conditional statement (within parentheses) to determine if the code
     * within {curly braces} should run.
     * If statements can be coupled with an else{} statement or else if(){} statement.
     *
     * Let's make an if statement that does the following:
     * if bool is true, return x.
     * if bool is false, return y.
     * 
     * All variables needed to solve the problem are provided by the method parameters - boolean bool, int x, int y.
     * This means that you can use the variables bool, x, and y freely, within the if statement, to solve the problem.
     *
     * Additional Resource if needed: https://www.w3schools.com/java/java_conditions.asp
     *
     * @param bool a true/false value that determines if x or y is to be returned.
     * @param x first number to be compared.
     * @param y second number to be compared.
     * @return x if bool is true. if bool is false, return y.
     */
    public static int ifExample(boolean bool, int x, int y){
        if(bool==true){
            return x;
        }
        else if(bool==false){
            return y;
        }
        return 0;
    }
    /**
     * This method should return the parameter `x` if the parameter `bool` is true,
     * otherwise return the parameter `y`.
     * 
     * Using the paremeters `bool`, `x`, and `y`, to return the correct value.
     *
     * @param bool - a true or false value.
     * @param x    - first number to be compared.
     * @param y    - second number to be compared.
     * @return - x if bool is true, otherwise return y.
     */
    public static int exercise1(boolean bool, int x, int y) {
        if(bool==true){
            return x;
        }
        else{
            return y;
        }
    }

    /**
     * This method should return "Positive" if the parameter `x` is a positive number, "Negative" if the parameter `x` is a negative number, or "Zero" if the parameter `x` is zero.
     *  
     * @param x - a number that could be positive, negative, or zero.
     * @return - "Positive", "Negative", or "Zero" depending on the input.
     */
    public static String exercise2(int x) {
        if(x>0){
            return "Positive";
        } else if(x<0){
            return "Negative";
        }
        return "Zero";
    }

    /**
     * This method should return "Yes", "No", or depending on whether the parameter `year` represents a leap year.
     * 
     * - Return "No" if `year` is NOT divisible by 4
     * - If `year` is divisible by 4, then:
     *      - Return "Not quite" if `year` is also divisible by 100 but NOT by 400
     *      - Return "Yes" if `year` is also divisible by 100 AND by 400
     *      - Return "Yes" otherwise
     * 
     * To check if a value is divisible by another, use the modulo operator (%) to check if the remainder is zero.
     * 
     * @param year - an integer representing a year.
     * @return - "Yes", "No", or "Not quite!" depending on the input. 
     */
    public static String exercise3(int year) {
        if(year%4!=0){
            return "No";
        }else{
            if(year%100==0 && year%400!=0){
                return "Not quite";
                
            }
            else if(year%400==0){
                return "Yes";
            }
        }
        return "Yes";
    }
    public static void main(String[] args) {
        exercise1(true, 10,20);
        exercise2(20);
        exercise3(10);
    }

}