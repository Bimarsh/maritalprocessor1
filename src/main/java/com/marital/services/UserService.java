package com.marital.services;

import com.marital.domain.User;
import com.marital.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> findMatches(User user) {
        List<User> potentialMatches = userRepository.findByGender(user.getGender().equals("Male") ? "Female" : "Male");
        return potentialMatches.stream()
                .map(match -> new MatchResult(match, calculateMatchPercentage(user, match)) {
                })
                .filter(result -> result.getMatchPercentage() > 50)
                .sorted((a, b) -> Double.compare(b.getMatchPercentage(), a.getMatchPercentage()))
                .map(MatchResult::getUser)
                .toList();
    }

    private double calculateMatchPercentage(User user1, User user2) {
        double score = 0;
        if (user1.getEducation().equalsIgnoreCase(user2.getEducation())) {
            score += 30;
        }
        long commonInterests = user1.getInterests().stream().filter(user2.getInterests()::contains).count();
        score += (commonInterests * 10);
        return Math.min(score, 100);
    }
}
