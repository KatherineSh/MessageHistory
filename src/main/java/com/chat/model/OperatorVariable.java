package com.chat.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "operator_variable")
public class OperatorVariable implements Serializable {

	@Id
	@GeneratedValue
	private Integer id;

	private String name;
	private String value;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "chat_details_id")
	private ChatDetails chatDetails;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public ChatDetails getChatDetails() {
		return chatDetails;
	}

	public void setChatDetails(ChatDetails chatDetails) {
		this.chatDetails = chatDetails;
	}
}
