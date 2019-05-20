package rest;

import java.util.List;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import Services.PollsService;
import entities.Polls;

@Path("/polls")
public class Rest {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Polls> getPoll() {
		PollsService pollsService = new PollsService();
		return pollsService.getPolls();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void postPolls(Polls poll) {

		PollsService pollsService = new PollsService();
		pollsService.createPolls(poll);
	}
}
