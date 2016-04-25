package com.chat.service;
import java.util.List;

import com.chat.model.ChatDetails;

public interface ChatDetailsService {
	
	public boolean save(ChatDetails chatDetails);

	public Integer getMessageCount();

	public List<Object> calculateChatsByCountry();

}
