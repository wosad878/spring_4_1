package com.iu.s4;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.iu.board.BoardDTO;

@Controller
@RequestMapping(value="/qna/**")
public class QnaController {
	@RequestMapping(value="qnaList")
	public String qnaList(@RequestParam(defaultValue="1") int curPage, Model model) {
		
		model.addAttribute("board", "qna");
		return "board/boardList";
	}
	@RequestMapping(value="qnaSelect")
	public String qnaSelect(int num, Model model) {
		model.addAttribute("board", "qna");
		return "board/boardSelect";
	}
	@RequestMapping(value="qnaWrite", method=RequestMethod.GET)
	public String write(Model model) {
		model.addAttribute("board", "qna");
		return "board/boardWrite";
	}
	@RequestMapping(value="qnaWrite", method=RequestMethod.POST)
	public void write(BoardDTO boardDTO) {
		System.out.println("write : " + boardDTO.getTitle());
	}
	@RequestMapping(value="qnaUpdate", method=RequestMethod.GET)
	public String update(Model model) {
		model.addAttribute("board", "qna");
		return "board/boardUpdate";
	}
	@RequestMapping(value="qnaUpdate", method=RequestMethod.POST)
	public void update(BoardDTO boardDTO) {
		System.out.println("update : " + boardDTO.getTitle());
	}
	@RequestMapping(value="qnaDelete", method=RequestMethod.POST)
	public void delete(int num) {
		System.out.println("delete : " + num);
	}
	@RequestMapping(value="qnaReply", method=RequestMethod.GET)
	public String reply(Model model) {
		model.addAttribute("board", "qna");
		return "board/boardReply";
	}
	@RequestMapping(value="qnaReply", method=RequestMethod.POST)
	public void reply(BoardDTO boardDTO) {
		System.out.println("reply : " + boardDTO.getTitle());
	}
}
