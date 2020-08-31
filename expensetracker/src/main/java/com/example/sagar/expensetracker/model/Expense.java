package com.example.sagar.expensetracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
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

    private String descript;
    
    // Id (PK),       Date, Description, User Id, Category Id
    //    1000,  9/19/2021, Visiting CA,       1, 10
    @ManyToOne
    private Category category;

    @ManyToOne
    private User user;


}
