package com.realestate.listing.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data   // 🔥 this does everything (getters, setters, toString)
@NoArgsConstructor
@AllArgsConstructor
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String location;
    private int price;
    private int bhk;
}