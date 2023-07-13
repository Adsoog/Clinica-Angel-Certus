package com.clinica.angel.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinica.angel.modelo.ConsultOrder;
import com.clinica.angel.repositorio.ConsultOrderRepositorio;

@Service
public class ConsultOrderServicio {
	
	private ConsultOrderRepositorio consultOrderRepository;

    @Autowired
    public ConsultOrderServicio(ConsultOrderRepositorio consultOrderRepository) {
        this.consultOrderRepository = consultOrderRepository;
    }

    public List<ConsultOrder> getAllConsultOrders() {
        return consultOrderRepository.findAll();
    }

    public ConsultOrder getConsultOrderById(int id) {
        return consultOrderRepository.findById(id).orElse(null);
    }

    public ConsultOrder createConsultOrder(ConsultOrder consultOrder) {
        return consultOrderRepository.save(consultOrder);
    }

    public ConsultOrder updateConsultOrder(int id, ConsultOrder consultOrderDetails) {
    	ConsultOrder consultOrder = consultOrderRepository.findById(id).orElse(null);
        if (consultOrder != null) {
            // Actualizar los campos necesarios de la orden de emergencia
        	consultOrder.setPatientName(consultOrderDetails.getPatientName());
        	consultOrder.setDoctorName(consultOrderDetails.getDoctorName());
            // Actualizar los demás campos según corresponda
            
            return consultOrderRepository.save(consultOrder);
        }
        return null;
    }

    public void deleteConsultOrder(int id) {
    	consultOrderRepository.deleteById(id);
    }

}
