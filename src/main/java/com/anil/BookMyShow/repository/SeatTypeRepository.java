package com.anil.BookMyShow.repository;

import com.anil.BookMyShow.models.SeatType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SeatTypeRepository extends JpaRepository<SeatType, Long> {

    @Override
    Optional<SeatType> findById(Long seatTypeId);
    @Override
    SeatType save (SeatType seatType);

}
