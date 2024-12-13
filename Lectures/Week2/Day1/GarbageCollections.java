
// Correct code to count number
// of employees excluding interns.
 
class Employee {
   
    private int ID;
    private String name;
    private int age;
    private static int nextId = 1;
   
    // it is made static because it
    // is keep common among all and
    // shared by all objects
    public Employee(String name, int age){
        this.name = name;
        this.age = age;
        this.ID = nextId++;
    }
    public void show(){
        System.out.println("Show Id=" + ID + " Name=" + name
                           + " Age=" + age);
    }
    public void showNextId(){
        System.out.println("Next employee id will be="
                           + nextId);
    }
    protected void finalize(){
        --nextId;
        // In this case,
        // gc will call finalize()
        // for 2 times for 2 objects.
    }
}
 
public class GarbageCollections {
    public static void main(String[] args){
        Employee E = new Employee("GFG1", 56);
        Employee F = new Employee("GFG2", 45);
        Employee G = new Employee("GFG3", 25);
        E.show();//Show Id=1 Name=GFG1 Age=56
        F.show();//Show Id=2 Name=GFG2 Age=45
        G.show();//Show Id=3 Name=GFG3 Age=25
        E.showNextId();//Next employee id will be=4
        F.showNextId();//Next employee id will be=4
        G.showNextId();//Next employee id will be=4
        {
            // It is sub block to keep
            // all those interns.
            Employee X = new Employee("GFG4", 23);
            Employee Y = new Employee("GFG5", 21);
            X.show();
            Y.show();
            X.showNextId();
            Y.showNextId();
            X = Y = null;
            System.gc();
            System.runFinalization();
        }
        E.showNextId();
    }
}