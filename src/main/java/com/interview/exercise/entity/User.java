package com.interview.exercise.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    private String company;
    private LocalDateTime insertTime;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Role> role;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    public List<Package> packages;
}
