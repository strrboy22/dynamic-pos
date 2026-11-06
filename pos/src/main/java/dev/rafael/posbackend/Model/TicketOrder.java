package dev.rafael.posbackend.Model;

import java.util.List;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;


@Entity
@Table(name="ticket_order")
public class TicketOrder {
  protected TicketOrder() {}

  @Id 
  @GeneratedValue(GenerationType.IDENTITY)
  private long id;

  @OneToMany(mappedBy="ticketOrder")
  private List<TicketLineItems> lineItems;

  @ManyToOne(fetch=FetchType.LAZY)
  @JoinColumn(name="employee_id")
  private Employee server;

  @ManyToOne(fetch=FetchType.LAZY)
  private RestaurantTable table;

  @CreationTimestamp
  @Column(name="created_At", nullable=false)
  private LocalDateTime time;

}
