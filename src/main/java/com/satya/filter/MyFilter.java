package com.satya.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class MyFilter implements GlobalFilter{

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		System.out.println("filter() -> execute.... ");
		
		// Pre process request
		
		//ServerHttpRequest request = exchange.getRequest();
		return chain.filter(exchange);
		
	}
	
	

}
