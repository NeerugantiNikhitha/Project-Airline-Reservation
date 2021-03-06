package com.airline.service;

import java.util.List;

import com.airline.model.FlightDetails;
import com.airline.model.FlightSearchDetails;
import com.airline.model.Flights;
import com.airline.model.LoginCredentials;
import com.airline.model.Passengers;
import com.airline.model.PaymentDetails;
import com.airline.model.SeatInfo;
import com.airline.model.Tickets;
import com.airline.model.User;

public interface AirlineService {
	public long registerUser(User user);
	public long getUser(LoginCredentials credential);
	public List<Flights> getFlightDetails(FlightSearchDetails details);
	public List<String> getBookedSeats(long flightId);
	public int getPaymentConfirmation(PaymentDetails details);
	public int bookTicket(Tickets details);
	public void bookSeats(SeatInfo seatDetails);
	public List<Tickets> getTicket(long userId);
	public Passengers getUser(long userId);
	public int addFlightDetails(FlightDetails details);
	public int deleteFlight(long flightId);
	public List<String> getUserBookedSeats(long flightId, long userId);
	public int cancelTicket(long ticketNumber);
}
