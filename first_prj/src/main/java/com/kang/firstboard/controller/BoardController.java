package com.kang.firstboard.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kang.firstboard.service.BoardService;
import com.kang.firstboard.vo.BoardVO;


@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Inject
	private BoardService boardService;
	
	@RequestMapping(value= "/list", method=RequestMethod.GET)
	public String list(Model model) throws Exception {
		System.out.println("---------list page----------");
		List<BoardVO> boards = boardService.listAll();
		model.addAttribute("list",boards);
		return "list";
	}
	
	@RequestMapping(value = "/write", method=RequestMethod.GET)
	public String write() throws Exception {
		System.out.println("----------write GET------------");
		return "write";
		
	}
	
	@RequestMapping(value = "/write", method=RequestMethod.POST)
	public String writePOST(BoardVO boardVO, Model model) throws Exception {
		System.out.println("-----------write POST----------");
		boardService.insert(boardVO);
		return "redirect:/board/list";
	}
	
	@RequestMapping(value = "/read", method=RequestMethod.GET)
	public String read(@RequestParam("bno") int bno, Model model) throws Exception {
		System.out.println("-----------read GET-------------");
		BoardVO boards = boardService.read(bno);
		model.addAttribute("list",boards);
		return "read";
	}
	
	@RequestMapping(value = "/update", method=RequestMethod.GET)
	public String update(@RequestParam("bno") int bno, Model model) throws Exception {
		System.out.println("----------update GET-------------");
		BoardVO boards = boardService.read(bno);
		model.addAttribute("list",boards);
		return "update";
	}
	
	@RequestMapping(value = "/update", method=RequestMethod.POST)
	public String updatePOST(BoardVO boardVO, Model model) throws Exception {
		System.out.println("-----------update POST------------");
		boardService.update(boardVO);
		return "redirect:/board/list";
	}
	
	@RequestMapping(value = "/delete", method=RequestMethod.GET)
	public String delete(@RequestParam("bno") int bno, Model model) throws Exception {
		System.out.println("------------delete GET-------------");
		boardService.delete(bno);
		return "redirect:/board/list";
	}
}
