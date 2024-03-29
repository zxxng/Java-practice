package io.namoosori.java.travelClub.ui.console;

import io.namoosori.java.travelClub.entity.TravelClub;
import io.namoosori.java.travelClub.service.ClubService;
import io.namoosori.java.travelClub.service.ServiceLifeCycler;
import io.namoosori.java.travelClub.service.logic.ClubServiceLogic;
import io.namoosori.java.travelClub.util.ConsoleUtil;

import java.util.List;

public class ClubConsole {
    private ConsoleUtil consoleUtil;
    private ClubService clubService;

    public ClubConsole() {
        this.consoleUtil = new ConsoleUtil();
        this.clubService = ServiceLifeCycler.getUniqueInstance().getClubService();
    }

    public void register(){
        while(true) {
            String clubName = consoleUtil.getValueOf("Club Name(0.Club Menu)");
            if (clubName.equals("0")) {
                return ;
            }

            String intro = consoleUtil.getValueOf("Club Intro(0.Club Menu)");
            if (intro.equals("0")){
                return ;
            }

            TravelClub newClub = new TravelClub(clubName, intro);
            clubService.register(newClub);

            System.out.println("Registered club : " + newClub);
        }
    }

    public void findAll() {
        List<TravelClub> foundClubs = clubService.findAll();

        if(foundClubs.isEmpty()) {
            System.out.println("Empty~~");
            return ;
        }

        foundClubs.forEach(System.out::println);
    }

    public void findById(){
        TravelClub foundClub = null;

        while(true) {
            String clubId = consoleUtil.getValueOf("Club id to find(0.Club Menu)");
            if (clubId.equals("0")) {
                break;
            }

            foundClub = clubService.findById(clubId);

            if (foundClub != null) {
                System.out.println(foundClub);
            } else {
                System.out.println("Can not find club, ID :" + clubId);
            }
        }
    }
    public void findByName(){
        List<TravelClub> foundClubs = null;

        while(true) {
            String clubName = consoleUtil.getValueOf("Club id to find(0.Club Menu)");
            if (clubName.equals("0")) {
                break;
            }

            foundClubs = clubService.findByName(clubName);

            if (foundClubs != null && !foundClubs.isEmpty()) {
                foundClubs.forEach(System.out::println);
            } else {
                System.out.println("Can not find club, Name :" + clubName);
            }
        }
    }

    private TravelClub findOne() {
        TravelClub foundClub = null;

        while(true) {
            String clubId = this.consoleUtil.getValueOf("Club id to find(0.Club Menu)");
            if (clubId.equals("0")){
                break;
            }

            foundClub = this.clubService.findById(clubId);
            if (foundClub != null) {
                break;
            }
            System.out.println("Can not find club, ID : " + clubId);
        }

        return foundClub;
    }

    public void modify() {
        TravelClub targetClub = this.findOne();
        String newName = this.consoleUtil.getValueOf("New club name(0.Club Menu, Enter. No Change.");
        if (!newName.equals("0")){
            if (!newName.isEmpty()) {
                targetClub.setClubName(newName);
            }

            String newIntro = this.consoleUtil.getValueOf("New club intro(0.Club Menu, Enter. No Change.");
            if (!newIntro.equals("0")){
                if (!newIntro.isEmpty()){
                    targetClub.setIntro(newIntro);
                }

                this.clubService.modify(targetClub);
                System.out.println("Modify Club : " + targetClub.toString());
            }
        }
    }

    public void remove() {
        TravelClub targetClub = this.findOne();
        String confirmStr = this.consoleUtil.getValueOf("Remove this club?(Y: yes, N: no)");
        if (!confirmStr.toLowerCase().equals("y") && !confirmStr.toLowerCase().equals("yes")) {
            System.out.println("Remove cancelled, your club is safe." + targetClub.getClubName());
        } else {
            System.out.println("Removing a club --> " + targetClub.getClubName());
            this.clubService.remove(targetClub.getId());
        }
    }

}
