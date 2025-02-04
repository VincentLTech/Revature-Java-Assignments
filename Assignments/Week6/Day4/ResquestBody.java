
import com.fasterxml.jackson.databind.ObjectMapper;
import io.javalin.Javalin;

public class ResquestBody {
    public static Javalin getInstance(){
        Javalin app = Javalin.create();
        ObjectMapper om = new ObjectMapper();
        
        /**
         * problem1: retrieve the song object from the request body...
         *      1. return the song object as JSON in the response body.
         * 
         * Note: Please refer to the "RequestBody.MD" file for more assistance.
         */
        // app.post("/echo", ctx -> {
            
        //     //implement logic here
                
        // });
        app.post("/echo", ctx -> {
            //retrieve the json string from the request body
            String jsonString = ctx.body();

            //utilize jackson to convert the json string to a user object
            Song song = om.readValue(jsonString, Song.class);
            
            //now we can use the 'user' response body as a Java object in whatever way we see fit.
                
            //eg: return the user as the response body, but also have Javalin convert it to JSON  
            ctx.json(song);    
                
        });

        /**
         * problem2: retrieve the song object from the request body...
         *      1. update the artist in the song object to "Beatles"
         *      2. return the updated song object as JSON in the response body
         * 
         * Note: Please refer to the "RequestBody.MD" file for more assistance.
         */
        // app.post("/changeartisttobeatles", ctx -> {

        //     //implement logic here
               
        // });
        app.post("/changeartisttobeatles", ctx -> {
            String jsonString = ctx.body();
            Song song = om.readValue(jsonString, Song.class);
            song.setArtistName("Beatles");
            //now we can use the 'user' response body as a Java object in whatever way we see fit.
                
            //eg: return the user as the response body, but also have Javalin convert it to JSON  
            ctx.json(song);   
               
        });


        return app;
    }
}
