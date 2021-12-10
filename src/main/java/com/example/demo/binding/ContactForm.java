package com.example.demo.binding;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ContactForm 
{
	private Integer contactId;
	private String contactName;
	private String contactEmail;
	private Long contactNumber;
	private Integer switchz;
	private LocalDate createdDate;
	private LocalDate updatedDate;
	

}
