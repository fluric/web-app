package com.herokuapp.sizdelzy.webapp.service;

import com.herokuapp.sizdelzy.webapp.repository.Highscore;

import java.util.List;

public interface HighscoreService {

    List<Highscore> getAllHighscoreEntries();

    Long addHighscoreEntry(Highscore highscore);
}
