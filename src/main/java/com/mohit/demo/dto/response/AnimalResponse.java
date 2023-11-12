package com.mohit.demo.dto.response;

public class AnimalResponse {
   private String name;
   private int legs;

   private int id;

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getLegs() {
      return legs;
   }

   public void setLegs(int legs) {
      this.legs = legs;
   }
}
