package com.marital.services;

import com.marital.domain.User;

public class MatchResult {
    private final User user;
    private final double matchPercentage;

    public MatchResult(User user, double matchPercentage) {
        this.user = user;
        this.matchPercentage = matchPercentage;
    }

    public User getUser() { return user; }
    public double getMatchPercentage() { return matchPercentage; }
}
