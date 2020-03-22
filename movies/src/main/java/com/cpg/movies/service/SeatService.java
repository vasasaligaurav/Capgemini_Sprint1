package com.cpg.movies.service;

import com.cpg.movies.dao.SeatDao;
import com.cpg.movies.dto.SeatDto;
import com.cpg.movies.exceptions.InvalidSeatServiceException;
import com.cpg.movies.util.*;

public class SeatService implements SeatServiceInterface{
	SeatDao ob1 = new SeatDao();
	SeatDto sbobj;
	SeatDto cbobj;
	SeatRepository obj = new SeatRepository();
	Enum<?> gav;
	@Override
	public Enum<?>  serviceBlockSeat(int seatid) throws InvalidSeatServiceException
	{
		 gav = ob1.blockSeat(seatid);
		 if(gav == null)
		 {
			 throw new InvalidSeatServiceException("May be the seatid not present");
		 }
		 else
		 {
			 return gav;
		 }
		
	}
	@Override
	public SeatDto serviceBookSeat(int seatid) throws InvalidSeatServiceException
	{
		sbobj =  ob1.bookSeat(seatid);
		if(sbobj == null)
		{
			throw new InvalidSeatServiceException("May be the seatid not present or it is blocked");
		}
		else
		{
			return sbobj;
		}
	}
	@Override
	public SeatDto serviceCancelSeat(int seatid) throws InvalidSeatServiceException
	{
		cbobj =  ob1.cancelSeatBooking(seatid);
		if(cbobj==null)
		{
			throw new InvalidSeatServiceException("May be the seatid not present or it is blocked");
		}
		else
		{
			return cbobj;
		}
	}
	@Override
	public void serviceGetSeatStatus(int seatid)
	{
		ob1.getstatus(seatid);
	}
	public boolean setSeatId(int seatid)
	{
		String sid = String.valueOf(seatid);
		if(sid.length()<6)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
