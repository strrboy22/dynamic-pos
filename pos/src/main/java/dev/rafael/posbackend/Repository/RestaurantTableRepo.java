package dev.rafael.posbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.rafael.posbackend.Model.RestaurantTable;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantTableRepo extends JpaRepository<RestaurantTable, Long> {
  Optional<RestaurantTable> findByTable(String table);
}
