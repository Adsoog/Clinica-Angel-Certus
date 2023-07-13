package com.clinica.angel.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "emergency_order")
@Data
public class EmergencyOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "patient_name")
    private String patientName;

    @Column(name = "doctor_name")
    private String doctorName;

    @Column(name = "order_date")
    private String orderDate;

    @Column(name = "chief_complaint")
    private String chiefComplaint;

    @Column(name = "emergency_concept")
    private String emergencyConcept;

    @Column(name = "emergency_cost")
    private double emergencyCost;

    @Column(name = "emergency_details")
    private String emergencyDetails;

    @Column(name = "notes")
    private String notes;
}
