package dev.rafael.posbackend.Model;

import jakarta.persistence.^;

@Entity
@Table(name="employee")
public class Employee {
  @Id
  @GeneratedValue(GenerationType.IDENTITY)
  private long id;

  private String employeeName;
}
