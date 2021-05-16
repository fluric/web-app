package com.herokuapp.sizdelzy.webapp.service;

import com.herokuapp.sizdelzy.webapp.repository.Highscore;

import java.util.List;

public interface HighscoreService {

    List<Highscore> getAllHighscores();

    Long addHighscore(Highscore highscore);
}
