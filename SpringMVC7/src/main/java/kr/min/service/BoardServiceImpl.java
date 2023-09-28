package kr.min.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.min.entity.Board;
import kr.min.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	BoardMapper boardMapper;

	@Override
	public List<Board> getList() {
		
		List<Board> list = boardMapper.getList();
		
		return list;
	}

}
