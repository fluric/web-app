package com.herokuapp.sizdelzy.webapp.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Highscore {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Long score;

    protected Highscore() {
    }

    public Highscore(String name, Long score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format(
                "HighscoreEntry[id=%d, name='%s', score='%d']",
                id, name, score);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getScore() {
        return score;
    }
}