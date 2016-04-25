package com.chat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chat.model.ChatDetails;
import com.chat.repository.ChatDetailsRepository;

@Service("chatDetailsService")
public class ChatDetailsServiceImpl implements ChatDetailsService {

	@Autowired
	private ChatDetailsRepository repo;

	@Override
	public boolean save(ChatDetails chatDetails) {
		return repo.save(chatDetails);
	}

	@Override
	public Integer getMessageCount() {
		return repo.getMessageCount();
	}

	@Override
	public List<Object> calculateChatsByCountry() {
		return repo.getChatsByCountry();
	}

}
