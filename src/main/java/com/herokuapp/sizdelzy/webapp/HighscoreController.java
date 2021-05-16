package com.herokuapp.sizdelzy.webapp;

import com.herokuapp.sizdelzy.webapp.repository.Highscore;
import com.herokuapp.sizdelzy.webapp.service.HighscoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HighscoreController {

    private final HighscoreService highscoreService;

    public HighscoreController(HighscoreService highscoreService) {
        this.highscoreService = highscoreService;
    }

    @GetMapping("/highscore")
    public List<Highscore> getHighscoreEntries() {
        return highscoreService.getAllHighscoreEntries();
    }

    @PostMapping("/highscore")
    public Long addHighscoreEntry(@RequestBody Highscore highscore) {
        return highscoreService.addHighscoreEntry(highscore);
    }
}