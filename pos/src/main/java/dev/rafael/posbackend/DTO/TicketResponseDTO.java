package dev.rafael.posbackend.DTO;


public record TicketResponseDTO (
  Long id;
  int tableId;
  ServerDTO server;
  String status;
  List<LineItemDTO> lineItems;
  double subTotal;
) {}
