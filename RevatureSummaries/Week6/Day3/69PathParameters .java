

import io.javalin.Javalin;

public class JavalinSingleton {
    /**
     * Assignment: retrieve the variable "first" from the path parameter and send it in the response body. Produce
     * the response using:
     *      ctx.result(StringVariable);
     *
     * You will not need to run app.start in this method. The test cases, or main method, will do this for you - this
     * method only needs to return a properly configured Javalin Server, represented by the 'app' object created below.
     *
     * Please refer to the "PathParameters.MD" file.
     */
    public static Javalin getInstance(){
        Javalin app = Javalin.create();

        app.get("/firstname/{first}", ctx -> {
            
            String firstname =ctx.pathParam("first");
            ctx.result(firstname);
        });

        return app;
    }
    
}

import io.javalin.Javalin;

public class JavalinSingleton {
    /**
     * Assignment: retrieve the variable "first" from the path parameter and send it in the response body. Produce
     * the response using:
     *      ctx.result(StringVariable);
     *
     * You will not need to run app.start in this method. The test cases, or main method, will do this for you - this
     * method only needs to return a properly configured Javalin Server, represented by the 'app' object created below.
     *
     * Please refer to the "PathParameters.MD" file.
     */
    public static Javalin getInstance(){
        Javalin app = Javalin.create();

        app.get("/firstname/{first}", ctx -> {
            
            String firstname =ctx.pathParam("first");
            ctx.result(firstname);
        });

        return app;
    }
    
}



import io.javalin.Javalin;


public class App 
{

    /**
     * You could run this method to start the server, and then access it using the 'curl' command. For example, you can
     * type into a terminal the following command:
     *      curl localhost:9000/firstname/Ted
     *      or
     *      curl localhost:9000/firstname/Kevin
     * Before this endpoint will return any information to you request, you will need to write that logic in
     * JavalinSingleton.java
     *
     * There is no need to change anything in this class. It exists for you to be able to interact with a Javalin server
     * yourself.
     */
    public static void main( String[] args ) {
        Javalin app = JavalinSingleton.getInstance();
        
        app.start(9000);
        
    }
}