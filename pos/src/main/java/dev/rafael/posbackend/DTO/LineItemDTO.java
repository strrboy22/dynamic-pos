package dev.rafael.posbackend.DTO;

import java.util.List;

public record LineItemDTO (
  String menuItemId;
  String name;
  int quantity;
  double unitPrice;
  List<String> modifiers;
) {}
