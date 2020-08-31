package com.example.sagar.expense.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@NoArgsConstructor
@Entity
@Data
@Table(name="category")
public class Category {

	@Id
	private Long id;
	
	//Travel, Grocery, Diner...
	private String name;

    /*
	 * @ManyToOne(cascade = CascadeType.PERSIST) private User user;
	 */
}
