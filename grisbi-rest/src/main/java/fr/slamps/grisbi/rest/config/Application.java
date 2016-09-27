package fr.slamps.grisbi.rest.config;

import fr.slamps.grisbi.core.domain.Account;
import fr.slamps.grisbi.rest.AccountResource;
import fr.slamps.grisbi.rest.exception.CustomExceptionMapper;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

public class Application extends ResourceConfig {

	/**
	 * Register JAX-RS application components.
	 */
	public Application() {
		register(RequestContextFilter.class);
		register(AccountResource.class);
//		register(SpringSingletonResource.class);
//		register(SpringRequestResource.class);
		register(CustomExceptionMapper.class);
	}
}
