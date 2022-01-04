package com.instagram.entity;

import java.time.LocalTime;

public class TimeLineEntity {
	private String timeofmessage;
	private String message;
	private String receiver;
	private String sender;
	public String getReceiver() {
		return receiver;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getTimeofmessage() {
		return timeofmessage;
	}
	public void setTimeofmessage(String timeofmessage) {
		this.timeofmessage = timeofmessage;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	
	
}

