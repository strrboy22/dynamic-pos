package dev.rafael.posbackend.Model;

import jakarta.persistence.*;

@Entity
@Table(name="restaurant_table")
public class RestaurantTable {
  @Id 
  @GeneratedValue(GenerationType.IDENTITY)
  private long id;

  @Column(name="status")
  private boolean status;

  @Column(name="table_number")
  private int tableNumber;
}
