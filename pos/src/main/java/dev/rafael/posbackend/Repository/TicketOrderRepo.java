package dev.rafael.posbackend.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import dev.rafael.posbackend.Model.TicketOrder;

public interface TicketOrderRepo extends JpaRepository<TicketOrder, Long> {

}
