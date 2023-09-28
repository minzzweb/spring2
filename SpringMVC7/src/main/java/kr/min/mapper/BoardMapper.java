package kr.min.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.min.entity.Board;

//@Mapper
public interface BoardMapper {
	public List<Board> getList();
}
