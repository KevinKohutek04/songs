package com.biscuit.demo.Repoitory;

import com.biscuit.demo.entitiy.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SongRepoitory extends JpaRepository<Song, Integer> {
    @Override
    Optional<Song> findById(Integer Song);

    @Override
    List<Song> findAll();
    List<Song> findBySong (String Song);
}
