public class Polymorphism {
    
}
class DisplayOverloading{
    public void disp(char c){
      System.out.println(c);
    }
    public void disp(char c, int num){
      System.out.println(c + " "+num);
    }
    public void disp2(int x){
      System.out.println(x);
    }
    public void disp2(double x){
      System.out.println(x);
    }
    
  }
class ExampleOverloading{
    public static void main(String args[]){
      DisplayOverloading obj = new DisplayOverloading();
      obj.disp('a');
      obj.disp('a',10);
      obj.disp2(4);
      obj.disp2(4.0);
    }
}


class Animal{
  public void animalSound(){
    System.out.println("Default Sound");
  }
}
class Dog5 extends Animal{

  public void animalSound(){
      System.out.println("Woof");
  }

  public static void main(String args[]){
      Animal obj = new Dog5();
      obj.animalSound();
  }
}