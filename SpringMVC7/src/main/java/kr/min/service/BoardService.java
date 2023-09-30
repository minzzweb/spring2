package kr.min.service;

import java.util.List;

import kr.min.entity.Board;
import kr.min.entity.Member;

public interface BoardService {

	public List<Board> getList();
	
	//로그인
	public Member login(Member vo);
}
