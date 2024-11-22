package com.epam.rd.autocode.assessment.appliances.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Manufacturer {
   private long id;
   private String name;

   @Override
   public String toString() {
      return "Manufacturer{" +
              "id=" + id +
              ", name='" + name + '\'' +
              '}';
   }
}
