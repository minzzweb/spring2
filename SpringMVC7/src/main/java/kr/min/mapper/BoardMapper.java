package kr.min.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.min.entity.Board;
import kr.min.entity.Member;

//@Mapper
public interface BoardMapper {	
	//list
	public List<Board> getList();
	
	//create
	 public void insert(Board vo);
	
	 public void insertSelectKey(Board vo);
	//read
	
	//update
	
	//delete
	 
	 
	 //login 
	 public Member login(Member vo);
}
