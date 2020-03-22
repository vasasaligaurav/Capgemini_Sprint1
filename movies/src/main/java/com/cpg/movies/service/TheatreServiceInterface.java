package com.cpg.movies.service;

import com.cpg.movies.dto.MovieDto;
import com.cpg.movies.dto.ScreenDto;
import com.cpg.movies.exceptions.InvalidTheatreServiceExceptions;

public interface TheatreServiceInterface {
	MovieDto serviceSearchMovie(String moviename,String theaterName) throws InvalidTheatreServiceExceptions,Exception;
	 ScreenDto serviceSearchScreen(int screenid,String theaterName) throws InvalidTheatreServiceExceptions;
	 boolean NameContactNo(String name,int contactNo);
	 boolean theatreId(int theaterId);
}
