package io.namoosori.java.travelClub.ui.console;

import io.namoosori.java.travelClub.entity.TravelClub;
import io.namoosori.java.travelClub.util.ConsoleUtil;

public class ClubConsole {
    private ConsoleUtil consoleUtil;

    public ClubConsole() {
        this.consoleUtil = new ConsoleUtil();
    }
    public void register(){
        while(true){
            String clubName = consoleUtil.getValueOf("Club Name(0.Club Menu)");
            if (clubName.equals("0")){
                return;
            }

            String intro = consoleUtil.getValueOf("Club Intro(0.Club Menu)");
            if (clubName.equals("0")){
                return;
            }

            TravelClub newClub = new TravelClub(clubName, intro);
            // 배열에 저장
            System.out.println("Registered club : " + newClub);
        }
    }

    public void findAll() {
        System.out.println("Find All");
    }

    public void findById(){

    }
}
