
public class Private{  
  private int data=40;  
  private void msg(){
    System.out.println(data);
  }  
  public static void main(String[] args){
    Private obj=new Private();  
    obj.msg();
    System.out.println(obj.data); //prints 40  (Accessing private member)
    //obj.data = 50; //Compile Time Error (Cannot modify private member)
    //obj.msg(); //Compile Time Error (Cannot call private method)
  
  }
}  
//this class will try to use the private member in Private only to result in compile time errors.
class Private2{  
  public static void main(String args[]){  
    Private obj=new Private();  
    // System.out.println(obj.data);//Compile Time Error  
    // obj.msg();//Compile Time Error  
    }  
}  