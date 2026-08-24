package com.api_gateway.ratelimiter.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RateLimiterConfig {
	
	@Bean
	public KeyResolver ipKeyResolver() {
		
		return exchange -> reactor.core.publisher.Mono
                .just(exchange.getRequest().getRemoteAddress().getAddress().getHostAddress());
	}
}
