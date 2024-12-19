class EmployeeCount{
    private int numOfEmployees = 0;
    public void setNumOfEmployees (int numOfEmployees){
        this.numOfEmployees = numOfEmployees;
    }
    public double getNumOfEmployees () {
        return numOfEmployees;
        //this.numOfEmployees also works.
    }
}
public class Encapsulation{
    public static void main(String args[]){
        EmployeeCount obj = new EmployeeCount ();
        obj.setNumOfEmployees(5613);
        System.out.println("No Of Employees: "+(int)obj.getNumOfEmployees());
        // System.out.println(numOfEmployees); // compilation error - cannot access numOfEmployees
    }
}