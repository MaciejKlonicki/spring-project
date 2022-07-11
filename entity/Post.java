package com.example.springytlearning.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table (name = "posts")
public class Post {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (nullable = false)
    private String postName;

    @Column (nullable = false)
    private String postText;

}
