package com.lcwd.hotel.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hotels")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {
    @Id
    private String id;
    private String name;
    private String location;
    private String about;

}
