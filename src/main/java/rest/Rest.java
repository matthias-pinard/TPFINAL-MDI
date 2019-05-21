package rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import Services.PollsService;
import entities.Event;
import entities.User;

@Path("/polls")
public class Rest {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Event> getPolls() {
		PollsService pollsService = new PollsService();
		return pollsService.getPolls();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Event getPoll(@PathParam("id") Long id) {
		PollsService pollsService = new PollsService();
		return pollsService.getPoll(id);
	}
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void postPolls(Event event) {

		PollsService pollsService = new PollsService();
		pollsService.createPolls(event);
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/add/{id}")
	public void addUser(@PathParam("id") Long id, User user) {
		PollsService pollsService = new PollsService();
		pollsService.addUser(id, user);
	}
}
