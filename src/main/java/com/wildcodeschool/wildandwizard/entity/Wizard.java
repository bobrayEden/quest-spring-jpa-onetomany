package com.wildcodeschool.wildandwizard.entity;

import javax.persistence.*;
import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Wizard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private Date birthday;
    private String birthPlace;
    private String biography;
    private boolean muggle;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "school_id")
    private School school;

    public Wizard() {
    }
}