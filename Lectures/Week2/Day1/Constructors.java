
public class Constructors {
    public String playerName;
    public int level;
    public Constructors(String playerName){
        this.playerName=playerName;
        this.level=1;
    }
    public Constructors(String playerName, int level){
        this.playerName = playerName;
        this.level = level;
    }
    public static void main(String[] args) {
        Constructors targetPlayer = new Constructors("Mario", 35);
        System.out.println(targetPlayer.playerName); // should print "Mario"
    }
}

class Constructor {
    public Constructor(){
        System.out.println("Default constructor ran.");
    }
    public Constructor(int value){
        System.out.println(value);
    }
    public void talk(String value){
        System.out.println(value);
    }
    public static void main(String[] args) {
        //create instances here
        Constructor c = new Constructor(5839);
        c.talk("Hello");

        //use the no-arg constructor
        Constructor cNoArg = new Constructor();
        cNoArg.talk("Hello");
    }
}