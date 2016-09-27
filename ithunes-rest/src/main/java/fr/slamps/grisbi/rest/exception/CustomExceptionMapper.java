package fr.slamps.ithunes.rest.exception;

import org.springframework.stereotype.Component;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

@Component
public class CustomExceptionMapper implements ExceptionMapper<IllegalArgumentException> {

	@Override
	public Response toResponse(IllegalArgumentException exception) {
		return Response.ok("Illegal Argument Exception Caught").build();
	}
}
