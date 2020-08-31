package com.example.sagar.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sagar.expense.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
	

}
