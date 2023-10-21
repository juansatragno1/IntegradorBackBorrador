package com.example.demo.controller;

import com.example.demo.model.ReservationDto;
import com.example.demo.model.Reservation;
import com.example.demo.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {
    private final ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @PostMapping
    public void addReservation(@RequestBody ReservationDto reservationDTO) {
        // Lógica para agregar una nueva reserva
    }

    @PutMapping("/{id}")
    public void updateReservation(@PathVariable Long id, @RequestBody ReservationDto reservationDTO) {
        // Lógica para actualizar la reserva con el ID proporcionado
    }

    @DeleteMapping("/{id}")
    public void deleteReservation(@PathVariable Long id) {
        // Lógica para eliminar la reserva con el ID proporcionado
    }
}

