package com.chat.repository;

import java.util.List;

import com.chat.model.ChatDetails;

public interface ChatDetailsRepository {
	
	public boolean save(ChatDetails chatDetails);

	public Integer getMessageCount();

	public List<Object> getChatsByCountry();

}
