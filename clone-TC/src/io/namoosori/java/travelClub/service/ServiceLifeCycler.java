package io.namoosori.java.travelClub.service;

import io.namoosori.java.travelClub.service.logic.ClubServiceLogic;

public class ServiceLifeCycler {
    private static ServiceLifeCycler uniqueInstance;
    private ClubService clubService;

    private ServiceLifeCycler() {
        this.clubService = new ClubServiceLogic();
    }
    public static ServiceLifeCycler getUniqueInstance(){
        if (uniqueInstance == null) {
            uniqueInstance = new ServiceLifeCycler();
        }

        return uniqueInstance;
    }

    public ClubService getClubService() {
        return this.clubService;
    }
}
