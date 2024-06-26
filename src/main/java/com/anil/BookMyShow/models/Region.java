package com.anil.BookMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Region extends BaseModel{

    private String name ;
    @OneToMany
    private List<Theatre> theatre ;

}
