package com.example.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enquiry")
public class FlightEnquiry {
	ArrayList<Flight> flightList = new ArrayList<>();
	public FlightEnquiry() {
		
		Flight flight = new Flight();
		flight.setAirLine("MyAirLine");
		flight.setFlightNumber(101);
		flight.setSrcCity("Mumbai");
		flight.setTargetCity("London");
		flight.setDepartureTime(LocalDateTime.of(2022, 06, 22, 16, 30));
		flight.setArrivalTime(LocalDateTime.of(2022, 06, 22, 18, 30));
		
		Flight flight2 = new Flight();
		flight2.setAirLine("MyAirLine");
		flight2.setFlightNumber(102);
		flight2.setSrcCity("Pune");
		flight2.setTargetCity("London");
		flight2.setDepartureTime(LocalDateTime.of(2022, 06, 22, 19, 30));
		flight2.setArrivalTime(LocalDateTime.of(2022, 06, 22, 23, 30));
		flightList.add(flight);
		flightList.add(flight2);
	}
	
	
	@RequestMapping(value= "/greet",method = RequestMethod.GET)
	String greeting() {
		return "Welcome to flight enquiry !";
	}
	@RequestMapping(value= "/bye",method = RequestMethod.GET)
	String bye() {
		return "Bye......";
	}
	
	@RequestMapping(value= "/getFlight/{fid}",method = RequestMethod.GET)
	public Flight getFlightObj(@PathVariable("fid") int flightNumber) {
		for (Flight flight : flightList) {
			if(flight.getFlightNumber() == flightNumber)
				return flight;
		}
		return null;
	}
	
	@RequestMapping(value= "/getAllFlights",method = RequestMethod.GET)
	public List<Flight> getAllFlightsObj() {
		
		return flightList;
	}
	
	
	
}
