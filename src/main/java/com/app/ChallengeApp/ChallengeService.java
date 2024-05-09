package com.app.ChallengeApp;

import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// JPA

@Service
public class ChallengeService {

//    private List<Challenge> challenges = new ArrayList<>();

    private Long nextId = 1L;

    @Autowired
    ChallengeRepository challengeRepository;

    public ChallengeService(){

    }

    public List<Challenge> getAllChallenges(){

        return challengeRepository.findAll();
    }

    public boolean addChallenge(Challenge challenge){

        if (challenge != null){
            challenge.setId(nextId++);
            challengeRepository.save(challenge);
            return true;
        }

        return false;
    }

    public Challenge getChallenges(String month) {

        Optional<Challenge> challenge = challengeRepository.findByMonthIgnoreCase(month);

//        for(Challenge challenge: challenges){
//            if (challenge.getMonth().equalsIgnoreCase(month)){
//                return challenge;
//            }
//        }
        return challenge.orElse(null);
    }

    public boolean updateChallenge(Long id, Challenge updatedChallenge) {

        Optional<Challenge> challenge = challengeRepository.findById(id);

        if (challenge.isPresent()){
            Challenge challengeToUpdate = challenge.get();
            challengeToUpdate.setMonth(updatedChallenge.getMonth());
            challengeToUpdate.setDescription(updatedChallenge.getDescription());
            challengeRepository.save(challengeToUpdate);
            return true;
        }

//        for(Challenge challenge: challenges){
//            if (challenge.getId().equals(id)){
//                challenge.setMonth(updatedChallenge.getMonth());
//                challenge.setDescription(updatedChallenge.getDescription());
//                return true;
//            }
//        }

        return false;
    }

    public boolean deleteChallenge(Long id) {

        Optional<Challenge> challenge = challengeRepository.findById(id);

        if (challenge.isPresent()){
            challengeRepository.deleteById(id);
            return true;
        }

        return false;

//        return challenges.removeIf(challenge -> challenge.getId().equals(id));
    }
}
