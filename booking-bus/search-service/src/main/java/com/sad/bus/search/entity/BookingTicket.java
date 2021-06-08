package com.sad.bus.search.entity;

import java.util.List;

public class BookingTicket {
    private Integer id;
    private List<Object> tickets;

    public BookingTicket(Integer id, List<Object> images) {
        this.id = id;
        this.tickets = images;
    }

    public BookingTicket() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

	public List<Object> getTickets() {
		return tickets;
	}

	public void setTickets(List<Object> tickets) {
		this.tickets = tickets;
	}


}
