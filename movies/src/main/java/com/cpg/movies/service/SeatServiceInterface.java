package com.cpg.movies.service;

import com.cpg.movies.dto.SeatDto;
import com.cpg.movies.exceptions.InvalidSeatServiceException;

public interface SeatServiceInterface {
	Enum<?> serviceBlockSeat(int seatid) throws InvalidSeatServiceException;
	 SeatDto serviceBookSeat(int seatid) throws InvalidSeatServiceException;
	 SeatDto serviceCancelSeat(int seatid) throws InvalidSeatServiceException;
	 void serviceGetSeatStatus(int seatid);

}
