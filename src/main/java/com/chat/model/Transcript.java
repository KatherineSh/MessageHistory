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
@Table(name = "transcript")
public class Transcript implements Serializable {

	@Id
	@GeneratedValue
	private Integer transcript_id;

	private String id;
	private String date;
	private Integer date_seconds;
	private Integer date_milliseconds;
	private String alias;
	private String message;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "chat_details_id")
	private ChatDetails chatDetails;

	public Integer getTranscript_id() {
		return transcript_id;
	}

	public void setTranscript_id(Integer transcriptId) {
		this.transcript_id = transcriptId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getDate_seconds() {
		return date_seconds;
	}

	public void setDate_seconds(Integer dateSeconds) {
		this.date_seconds = dateSeconds;
	}

	public Integer getDate_milliseconds() {
		return date_milliseconds;
	}

	public void setDate_milliseconds(Integer dateMilliseconds) {
		this.date_milliseconds = dateMilliseconds;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ChatDetails getChatDetails() {
		return chatDetails;
	}

	public void setChatDetails(ChatDetails chatDetails) {
		this.chatDetails = chatDetails;
	}
}
