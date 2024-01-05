package com.myblog.firstblog.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="posts")
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    private String content;
    private String title;
}
