package com.herokuapp.sizdelzy.webapp.service.impl;

import com.herokuapp.sizdelzy.webapp.repository.Highscore;
import com.herokuapp.sizdelzy.webapp.repository.HighscoreRepository;
import com.herokuapp.sizdelzy.webapp.service.HighscoreService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HighscoreServiceImpl implements HighscoreService {

    private final HighscoreRepository highscoreEntryRepository;

    public HighscoreServiceImpl(HighscoreRepository highscoreEntryRepository) {
        this.highscoreEntryRepository = highscoreEntryRepository;
    }

    @Override
    public List<Highscore> getAllHighscores() {
        return highscoreEntryRepository.findAll();
    }

    @Override
    public Long addHighscore(Highscore highscore) {
        return highscoreEntryRepository.save(highscore).getId();
    }
}
