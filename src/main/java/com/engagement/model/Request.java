package com.engagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Request {
	
	public static enum RequestTypes{
		INTERVENTION, TALENT
	}
	
	public static enum Status{
		PENDING, DONE
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int requestId;
	
	@Column(nullable = false)
	private RequestTypes requestType;
	
	@Column(nullable = false)
	private Status status;
	
	private String message;
	
	private int clientId;
	
	
	

}
