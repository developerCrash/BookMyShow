package com.anil.BookMyShow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Seat extends BaseModel {
    private String seatNumber;
    private int row ;
    private int col;
    @ManyToOne
    private SeatType seatType ;

}
