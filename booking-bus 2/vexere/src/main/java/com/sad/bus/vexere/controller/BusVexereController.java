package com.sad.bus.vexere.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sad.bus.vexere.entity.VexereTicket;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class BusVexereController {
	@Autowired
	private Environment env;

	@RequestMapping("/")
	public String home() {
		// This is useful for debugging
		// When having multiple instance of image service running at different ports.
		// We load balance among them, and display which instance received the request.
		return "Hello from Image Service running at port: " + env.getProperty("local.server.port");
	}
		
	@RequestMapping("/vexere-ticket")
	public List<VexereTicket> getImages() {
		List<VexereTicket> images = Arrays.asList(
			new VexereTicket(1, "vexere 1", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3842005760"),
			new VexereTicket(2, "vexere 2", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3698134272"),
			new VexereTicket(3, "vexere 3", "https://www.imdb.com/title/tt0096697/mediaviewer/rm1445594112"));
		return images;
	}
}