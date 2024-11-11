import io.javalin.Javalin;

public class JavalinSingleton {

    
    /**
     * Using the app.get method, Create an HTTP GET endpoint at the url: http://localhost:9000/hello that will
     * return the string "Hello World" in the response.
     *
     * You will not need to run app.start in this method. The test cases, or main method, will do this for you - this
     * method only needs to return a properly configured Javalin Server, represented by the 'app' object created below.
     * 
     * Note: Please refer to the "CreatingEndpoints.MD" file for more assistance if needed.
     */
    public static Javalin getInstance(){
        Javalin app = Javalin.create();
        
        //write endpoint here
        app.get("/hello", ctx -> {
            //logic to be executed when this endpoint is hit
            ctx.result("Hello World");
        });
        return app;
    }
    
}



import io.javalin.Javalin;


public class App 
{
    /**
     * You could run this method to start the server, and then access it using the 'curl' command. For example, you can
     * type into a terminal the following command in a new terminal:
     *      curl localhost:9000/hello/
     * Before this endpoint will return any information to you request, you will need to write that logic in
     * JavalinSingleton.java
     *
     * There is no need to change anything in this class. It exists for you to be able to interact with a Javalin server
     * yourself.
     */
    public static void main( String[] args )
    {
        Javalin app = JavalinSingleton.getInstance();

        app.start(9000);
    }
}