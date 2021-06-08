package com.sad.bus.search.bussearchservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Component
public class BusSearchService {
	@Autowired
	private RestTemplate restTemplate;
	
	
	@HystrixCommand(fallbackMethod = "fallbackFuta")  
	public List<Object> callFuta(){
		List<Object> ticketFuta = restTemplate.getForObject("http://futa/futa-ticket/", List.class);
			return ticketFuta;
	}
	@HystrixCommand(fallbackMethod = "fallbackVexere")  
	public List<Object> callVexere(){
		List<Object> ticketVexere = restTemplate.getForObject("http://vexere/vexere-ticket/", List.class);
			return ticketVexere;
	}
	public List<Object> fallbackFuta( Throwable hystrixCommand) {  
	      return new ArrayList<>();
	}
	public List<Object> fallbackVexere( Throwable hystrixCommand) {  
	      return new ArrayList<>();
	}
}
