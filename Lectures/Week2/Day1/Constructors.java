
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