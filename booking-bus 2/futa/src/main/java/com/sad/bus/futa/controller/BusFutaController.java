package com.sad.bus.futa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sad.bus.futa.entity.FutaTicket;

import java.util.Arrays;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

@RestController
@RequestMapping("/")
public class BusFutaController {
	@Autowired
	private Environment env;

	@RequestMapping("/")
	public String home() {
		// This is useful for debugging
		// When having multiple instance of image service running at different ports.
		// We load balance among them, and display which instance received the request.
		return "Hello from Image Service running at port: " + env.getProperty("local.server.port");
	}
		
	@RequestMapping("/futa-ticket")
	public List<FutaTicket> getTickets() {
		List<FutaTicket> futaTicket = Arrays.asList(
			new FutaTicket(1, "Nha xe phuong trang", "17/05/2021", "19/05/2021", 10000L),
			new FutaTicket(2, "Nha xe phuong trang", "18/05/2021", "21/05/2021", 20000L),
			new FutaTicket(3, "Nha xe phuong trang", "20/05/2021", "25/05/2021", 30000L));
		return futaTicket;
	}

	
	
	
}