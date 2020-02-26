package com.zhuzhenshan.movie.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhuzhenshan.movie.dao.MovieMapper;
import com.zhuzhenshan.movie.entity.Movie;
import com.zhuzhenshan.movie.service.MovieService;
import com.zhuzhenshan.movie.vo.MovieVO;
@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
	private MovieMapper movieMapper;
	
	@Override
	public List<Movie> selects(MovieVO movieVOs) {
		// TODO Auto-generated method stub
		return movieMapper.selects(movieVOs);
	}

	@Override
	public boolean deleteAll(Integer[] ids) {
		// TODO Auto-generated method stub
		int i =movieMapper.deleteAll(ids);
		return i>0;
	}

}
