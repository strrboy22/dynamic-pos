package dev.rafael.posbackend.Model;

import java.util.List;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
@Table(name="ticket_line_item")
public class TicketLineItem {

  protected TicketLineItem() {}


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private l`ong id;

  //parent id 
  @ManyToOne(fetch= FetchType.LAZY)
  @JoinColumn(name="ticket_id")
  private TicketOrder ticketOrder;

  @Column(name="item_name", nullable=false)
  private String name;
  
  @Column(name="item_quantity", nullable=false)
  private int quantity;

  @Column(name="item_price", nullable=false)
  private double unitPrice;

  @JdbcTypeCode(SqlTypes.JSON)
  @Column(ColummDefinition= "jsonb")
  private List<String> modifiers;


  //getter
  public String getName() {
    return this.name;
  }
  public int getQuantity() {
    return this.quantity;
  }
  public double getUnitPrice() {
    return this.unitPrice;
  }
  public List<String>b getModifiers() {
    return this.modifiers;
  }

  //setter
  public void setName(String name) {
    this.name = name;
  }
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
  public void setUnitPrice(double unitPrice) {
    this.unitPrice = unitPrice;
  }
  public void setModifiers(List<String> modifiers) {
    this.modifiers = modifiers;
  } 
}
