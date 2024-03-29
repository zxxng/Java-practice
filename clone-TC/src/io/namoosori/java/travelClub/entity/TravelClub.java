package io.namoosori.java.travelClub.entity;

import io.namoosori.java.travelClub.util.DateUtil;

import java.util.UUID;

public class TravelClub {
    // Fields
   private static final int MINIMUM_NAME_LENGTH = 3;
   private static final int MINIMUM_INTRO_LENGTH = 5;
   private String id;
   private String clubName;
   private String intro;
   private String foundationDay;

   private TravelClub() {
      this.id = UUID.randomUUID().toString();
      this.foundationDay = DateUtil.today();
   }

   public TravelClub(String clubName, String intro){
      this();
      setClubName(clubName);
      setIntro(intro);
   }

   public String getId() {
      return id;
   }

   public String getClubName() {
      return clubName;
   }

   public void setClubName(String clubName) {
      if (clubName.length() < MINIMUM_NAME_LENGTH) {
         System.out.println("Club name should be longer then " + MINIMUM_NAME_LENGTH);
         return ;
      }
      this.clubName = clubName;
   }

   public String getIntro() {
      return intro;
   }

   public void setIntro(String intro) {
      if (intro.length() < MINIMUM_INTRO_LENGTH) {
         System.out.println("Club intro should be longer then " + MINIMUM_INTRO_LENGTH);
         return ;
      }
      this.intro = intro;
   }

   public String getFoundationDay() {
      return foundationDay;
   }

   public static TravelClub getSample() {
//      String clubName = "Sample Club";
//      String intro = "Sample Intro";
//      TravelClub sampleClub = new TravelClub(clubName, intro);

      return new TravelClub("Sample Club", "Sample Intro");
   }

   @Override
   public String toString() {
      StringBuilder builder = new StringBuilder();
      builder.append("TravelClub club ID : ").append(id);
      builder.append(", ClubName : ").append(clubName);
      builder.append(", Intro : ").append(intro);
      builder.append(", FoundationDay : ").append(foundationDay);

      return builder.toString();
   }
}
