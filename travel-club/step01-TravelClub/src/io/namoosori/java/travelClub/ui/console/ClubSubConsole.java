package io.namoosori.java.travelClub.ui.console;

import io.namoosori.java.travelClub.service.ClubService;
import io.namoosori.java.travelClub.service.ServiceLogicLifeCycler;
import io.namoosori.java.travelClub.service.logic.ClubServiceLogic;

public class ClubSubConsole {
    private ClubService clubService;

    public ClubSubConsole() {
        this.clubService = ServiceLogicLifeCycler.getUniqueInstance().getClubService();
    }
}
