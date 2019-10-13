package demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Person { 

  public Person() {}

  public Person(int id, String name) {
    this.id = id;
    this.name = name;
  }

  @Id
  private int id;
  private String name;

}