package com.anil.BookMyShow.repository;

import com.anil.BookMyShow.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShowRepository extends JpaRepository<Show, Long> {

    Optional<Show> findById(Long showId);
    Show save(Show show);

}
