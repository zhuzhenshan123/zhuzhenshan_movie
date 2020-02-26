package com.zhuzhenshan.movie.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhuzhenshan.movie.entity.Movie;
import com.zhuzhenshan.movie.service.MovieService;
import com.zhuzhenshan.movie.vo.MovieVO;


@Controller
public class MovieController {
	@Autowired
	private MovieService movieService;
	
	@RequestMapping("selects")
	public String list(Model model,MovieVO movieVO) {
		if(movieVO.getPageNum()==null||"".equals(movieVO.getPageNum())) {
			movieVO.setPageNum(1);
		}
		PageHelper.startPage(movieVO.getPageNum(), 3);
		
		List<Movie> movies = movieService.selects(movieVO);
		PageInfo<Movie> page = new PageInfo<Movie>(movies);
		//model.addAttribute("movies", movies);
		model.addAttribute("movieVO", movieVO);
		model.addAttribute("page", page);
		return "movies";
	}
	@RequestMapping("deleteAll")
	@ResponseBody
	public Object deleteAll(Integer[] ids) {
		boolean flag=movieService.deleteAll(ids);
		return flag;
	}
	
}
