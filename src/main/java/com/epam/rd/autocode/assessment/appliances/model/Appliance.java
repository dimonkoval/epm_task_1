package com.epam.rd.autocode.assessment.appliances.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Appliance {
 private long id;
 private String name;
 private Employee employee;
 private Client client;
 private Category category;
 private String model;
 private Manufacturer manufacturer;
 private PowerType powerType;
 private String characteristic;
 private String description;
 private int power;

 @Override
 public String toString() {
  StringBuilder builder = new StringBuilder();
  builder.append(getClass().getSimpleName())
          .append("{");

  builder.append("id=").append(id).append(", ")
          .append("name='").append(name).append("', ")
          .append("model='").append(model).append("', ")
          .append("manufacturer='").append(manufacturer).append("', ")
          .append("powerType='").append(powerType).append("', ")
          .append("characteristic='").append(characteristic).append("', ")
          .append("description='").append(description).append("', ")
          .append("power=").append(power);

  if (employee != null) {
   builder.append(", employee='").append(employee).append("'");
  }
  if (client != null) {
   builder.append(", client='").append(client).append("'");
  }
  if (category != null) {
   builder.append(", category='").append(category).append("'");
  }

  builder.append("}");
  return builder.toString();
 }
}
