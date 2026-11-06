package dev.rafael.posbackend.DTO;

import java.util.List;
import jakarta.validation.constraints.NotNull;

public record TicketRequestDTO (

  private int ticketID;
  int tableId;
  String serverId;
  boolean status;
  List<LineItemDTO> lineItems;
  double subTotal;
  String createdAt;

) {}
