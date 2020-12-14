package CZ.educanet.webik;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.ArrayList;


@Path("users")
@Produces(MediaType.APPLICATION_JSON)
public class UsersResource {

    private static List<Users> names = new ArrayList<Users>();

    @GET
    public Response getAll() {
        return Response.ok(names).build(); }

    private boolean UserS(Users UserS) {
        for(int i = 0; i < names.size();i++){
            if(names.get(i).getUsername().equals(user.getUsername())) {
                return true;
            }
        }
        return false;
    }

    @PUT
    @Path(("/{{username}}"))
    public Object editUsers(Users user, String username, String newUsername) {

        Users UserS = new Users(username, "");
        if((UserS)) {
            for(int i = 0; i < names.size(); i++) {
                if(names.get(i).getUsername().equals(user.getUsername())) {
                    names.get(i).renameUser(newUsername);
                    return Response.ok().build(); }
            }
        } else {
            return Response.status(Response.Status.valueOf("...")).build(); }
        return Response.status(Response.Status.valueOf("..."));
    }@POST
    public Response createUsers(String username, String password) {
        Users tempUser = new Users(username, password);

        if((tempUser)) {
            return Response.status(Response.Status.valueOf("...")).build(); } else {
            names.add(tempUser);
            return Response.ok("...").build(); }
    } @GET
    public Response getLoggedUser() {
        return Response.ok(manager.user).build();
    }@DELETE
    public Response deleteUsers(Users user){
        if(BoolUser(user)) {
            names.remove(user);
            return Response.ok("...").build();
        } else {
            return Response.status(Response.Status.valueOf("..")).build(); } }
}

