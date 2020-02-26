package com.zhuzhenshan.movie.dao;

import java.util.List;

import com.zhuzhenshan.movie.entity.Movie;
import com.zhuzhenshan.movie.vo.MovieVO;

public interface MovieMapper {
	
	List<Movie> selects(MovieVO movieVOs);

	int deleteAll(Integer[] ids);
	
	
}
