package wb.rest;



import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
 
@Path("/get")
public class Service {
	
	    @GET
	    public String getMsg()
	    {
	         return "Hello World !! - Jersey 2";
	    }
	    
	    @Path("/post")
	    @POST
	    public String getMsg1()
	    {
	         return "WAOOOOOOO !! - Jersey 3";
	    }
	    
	    
	    @Path("/delete")
	    @DELETE
	    public String getMsg13()
	    {
	         return "DELETE il nulla !!"; 
	    }
	    
	    @PUT
	    public String getMsg12()
	    {
	         return "METODO PUT !!!";
	    }
	}

