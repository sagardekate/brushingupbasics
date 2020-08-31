package com.example.sagar.expense.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name="expense")
public class Expense {

	@Id
	private Long id;
	
	private Instant expensedate;
	
	private String description;
	
	private String location;
	
	//  id,       date,  description, userid, categoryid
	//1000, 08/11/2016, 'Trip to FL',      1,         10
	
	@ManyToOne
	private Category category;
	
	@JsonIgnore
	@ManyToOne
	private User user;

}
