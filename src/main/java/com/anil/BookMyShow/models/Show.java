package com.anil.BookMyShow.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@Entity
public class Show extends BaseModel{
    @ManyToOne
    private Movie movie;
    private Date startTime;
    private Date endTime;
    @ManyToOne
    private Screen screen ;
    private List<ShowSeat> showSeatList;
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> featureList ;

}
