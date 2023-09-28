package kr.min.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import kr.min.entity.Board;
import kr.min.service.BoardService;

@Controller //POJO
public class BoardController {
 
	@Autowired
	BoardService service;
	
//	public List<Board> getList(){
//		
//		return 
//	}
}
