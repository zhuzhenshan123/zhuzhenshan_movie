package com.zhuzhenshan.movie.service;

import java.util.List;

import com.zhuzhenshan.movie.entity.Movie;
import com.zhuzhenshan.movie.vo.MovieVO;

public interface MovieService {
	
	List<Movie> selects(MovieVO movieVOs);

	boolean deleteAll(Integer[] ids);
	
	
}
