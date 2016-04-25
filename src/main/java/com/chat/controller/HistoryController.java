package com.chat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chat.model.ChatDetails;
import com.chat.service.ChatDetailsService;

@Controller
public class HistoryController {

	@Autowired
	public ChatDetailsService chatDetailsService;
	
	@RequestMapping(value="/chat", method=RequestMethod.POST, consumes="application/json" )
	public ResponseEntity<String> saveChatDetails(@RequestBody ChatDetails json){
		boolean isSuccess = chatDetailsService.save(json);
		if (!isSuccess){
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
		return ResponseEntity.status(HttpStatus.OK).body(null);
	}
	
	@RequestMapping(value="/main")
	public String showMainPage(Model model){
		Integer messageCount = chatDetailsService.getMessageCount();
		model.addAttribute("messageCount", messageCount);
		return "main";
	}
	
	@RequestMapping(value="/chatsByCountry")
	public String showChatsByCountry(Model model){
		List<Object> chats = chatDetailsService.calculateChatsByCountry();
		
		model.addAttribute("chatsByCountry", chats);
		return "chatsByCountry";
	}
}
