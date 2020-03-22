package com.cpg.movies.ui;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import com.cpg.movies.dto.SeatDto;
import com.cpg.movies.exceptions.InvalidSeatServiceException;
import com.cpg.movies.service.SeatService;
import com.cpg.movies.util.SeatRepository;

public class SeatUi {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		
		try
		{
		Scanner sc = new Scanner(System.in);
		SeatService ob1 = new SeatService();
		int choice;
		while(true)
		{
			System.out.println("\nEnter Your Choice\n"+"1.Block Seat\n"+"2.Book Seat\n"+"3.Cancel Seat");
			 choice = sc.nextInt();
		 switch(choice)
		{
		case 1:
			System.out.println("Enter the SeatId");
			int g = sc.nextInt();
			ob1.serviceBlockSeat(g);
			for (Map.Entry<List<SeatDto>, Enum<?>> entr : SeatRepository.listOfSeatsAndStatus.entrySet()) 
			{
				for(SeatDto j:entr.getKey())
				{	
						System.out.println("SeatId:"+j.getSeatId()+" SeatStatus:"+entr.getValue());
				}
			}
			break;
		case 2:
			System.out.println("Enter the SeatId");
			int g1 = sc.nextInt();
			ob1.serviceBookSeat(g1);
			for (Map.Entry<List<SeatDto>, Enum<?>> entr : SeatRepository.listOfSeatsAndStatus.entrySet()) 
			{
				for(SeatDto j:entr.getKey())
				{	
						System.out.println("SeatId:"+j.getSeatId()+" SeatStatus:"+entr.getValue());
				}
			}
			break;
		case 3:
			System.out.println("Enter the SeatId");
			int g2 = sc.nextInt();
			ob1.serviceCancelSeat(g2);
			for (Map.Entry<List<SeatDto>, Enum<?>> entr : SeatRepository.listOfSeatsAndStatus.entrySet()) 
			{
				for(SeatDto j:entr.getKey())
				{	
						System.out.println("SeatId:"+j.getSeatId()+" SeatStatus:"+entr.getValue());
				}
			}
			break;
			default:
			System.out.println("Exited");
			System.exit(0);
			
		}
		 

	}
	}
		catch(InvalidSeatServiceException e)
		{
			System.out.print(e);
		}
}
}
