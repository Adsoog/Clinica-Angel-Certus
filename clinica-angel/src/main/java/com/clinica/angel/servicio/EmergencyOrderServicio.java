package com.clinica.angel.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinica.angel.modelo.EmergencyOrder;
import com.clinica.angel.repositorio.EmergencyOrderRepositorio;

@Service
public class EmergencyOrderServicio {
	
    private EmergencyOrderRepositorio emergencyOrderRepository;

    @Autowired
    public EmergencyOrderServicio(EmergencyOrderRepositorio emergencyOrderRepository) {
        this.emergencyOrderRepository = emergencyOrderRepository;
    }

    public List<EmergencyOrder> getAllEmergencyOrders() {
        return emergencyOrderRepository.findAll();
    }

    public EmergencyOrder getEmergencyOrderById(int id) {
        return emergencyOrderRepository.findById(id).orElse(null);
    }

    public EmergencyOrder createEmergencyOrder(EmergencyOrder emergencyOrder) {
        return emergencyOrderRepository.save(emergencyOrder);
    }

    public EmergencyOrder updateEmergencyOrder(int id, EmergencyOrder emergencyOrderDetails) {
        EmergencyOrder emergencyOrder = emergencyOrderRepository.findById(id).orElse(null);
        if (emergencyOrder != null) {
            // Actualizar los campos necesarios de la orden de emergencia
            emergencyOrder.setPatientName(emergencyOrderDetails.getPatientName());
            emergencyOrder.setDoctorName(emergencyOrderDetails.getDoctorName());
            // Actualizar los demás campos según corresponda
            
            return emergencyOrderRepository.save(emergencyOrder);
        }
        return null;
    }

    public void deleteEmergencyOrder(int id) {
        emergencyOrderRepository.deleteById(id);
    }

}
