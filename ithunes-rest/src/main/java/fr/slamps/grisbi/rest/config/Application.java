package fr.slamps.ithunes.rest.config;

import fr.slamps.ithunes.core.domain.Account;
import fr.slamps.ithunes.rest.AccountResource;
import fr.slamps.ithunes.rest.exception.CustomExceptionMapper;
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
