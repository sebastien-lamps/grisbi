package fr.slamps.grisbi.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.slamps.grisbi.core.domain.Account;
import fr.slamps.grisbi.core.service.AccountService;

@Component
@Path("/accounts")
@Api(value = "accounts", description = "Endpoint for Account specific operations")
public class AccountResource {
	@Autowired
	AccountService service;

	@GET
	@Path("/{accountUUID}")
	@Produces("application/json")
	@ApiOperation(value = "Returns account details", notes = "Returns account details.", response = Account.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successful retrieval of account entity", response = Account.class),
			@ApiResponse(code = 404, message = "Account with given uuid does not exist"),
			@ApiResponse(code = 500, message = "Internal server error") }
	)
	public Response getAccount() {

		Account account = service.getAccount();

		return Response.status(200).entity(account).build();

	}
}
