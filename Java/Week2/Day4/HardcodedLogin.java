/**
 * This challenge represents a hardcoded login example:
 *     Let's say we have two users, named "admin" and "user".
 *     "admin" has a password of "qwerty".
 *     "user" has a password of "password".
 * The method should return true if the login should be permitted, and false if it should not. You will need to use
 * if/else statements.
 */
public class HardcodedLogin {
    
    public boolean login(String username, String password){//return true if there is a successful login, and false otherwise.
        if(username=="admin" && password=="qwerty"){
            return true;
        }
        else if(username=="user" && password=="password"){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        HardcodedLogin hl = new HardcodedLogin();
        System.out.println(hl.login("admin", "qwerty"));//true
        System.out.println(hl.login("user", "password"));//true
        System.out.println(hl.login("admin", "wrongpassword"));//false
        System.out.println(hl.login("user", "wrongpassword"));//false
    }
}