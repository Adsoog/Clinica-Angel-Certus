package com.clinica.angel.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinica.angel.modelo.EmergencyOrder;
import com.clinica.angel.servicio.EmergencyOrderServicio;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/emergencia")
public class EmergencyOrderControlador {
	
    private EmergencyOrderServicio emergencyOrderService;

    @Autowired
    public EmergencyOrderControlador(EmergencyOrderServicio emergencyOrderService) {
        this.emergencyOrderService = emergencyOrderService;
    }

    @GetMapping
    public ResponseEntity<List<EmergencyOrder>> getAllEmergencyOrders() {
        List<EmergencyOrder> emergencyOrders = emergencyOrderService.getAllEmergencyOrders();
        return new ResponseEntity<>(emergencyOrders, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmergencyOrder> getEmergencyOrderById(@PathVariable int id) {
        EmergencyOrder emergencyOrder = emergencyOrderService.getEmergencyOrderById(id);
        if (emergencyOrder != null) {
            return new ResponseEntity<>(emergencyOrder, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<EmergencyOrder> createEmergencyOrder(@RequestBody EmergencyOrder emergencyOrder) {
        EmergencyOrder createdEmergencyOrder = emergencyOrderService.createEmergencyOrder(emergencyOrder);
        return new ResponseEntity<>(createdEmergencyOrder, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmergencyOrder> updateEmergencyOrder(@PathVariable int id, @RequestBody EmergencyOrder emergencyOrder) {
        EmergencyOrder updatedEmergencyOrder = emergencyOrderService.updateEmergencyOrder(id, emergencyOrder);
        if (updatedEmergencyOrder != null) {
            return new ResponseEntity<>(updatedEmergencyOrder, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmergencyOrder(@PathVariable int id) {
        emergencyOrderService.deleteEmergencyOrder(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
