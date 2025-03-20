package com.kh.spring.board.model.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.kh.spring.board.model.dto.BoardDTO;

public interface BoardService {
	
	// 게시글 작성(파일첨부)
	void insertBoard(BoardDTO board, MultipartFile file);
	/*
	 * 보편적인 메서드명
	 * insertBoard();
	 * save();
	 */
	
	// 게시글 목록조회
	List<BoardDTO> selectBoardAll(int currentPage);
	/*
	 * 보편적인 메서드명
	 * selectBoardList();
	 * selectAll();
	 * findAll();
	 */
	// 게시글 상세보기(댓글도 같이 조회) => 새로운 기술
	BoardDTO selectBoard(int boardNo);
	/*
	 * selectBoard();
	 * findByXXXX();
	 */
	
	// 게시글 수정
	BoardDTO updateBoard(BoardDTO board, MultipartFile file); 
	/*
	 * updateBoard();
	 * updateByXXX();
	 */
	
	// 게시글 삭제(Update STATUS로 해야함 'N'으로 번경)
	void deleteBoard(int boardNo);
	
	// ------ 1절
	// 게시글 검색 기능
	
	// 댓글작성
}
