# Clinica-Angel-Certus
Formulario de consulta externa y servicio de emergencia App Web completa

Clínica Ángel es un proyecto completo de gestión de clínicas que utiliza MSSQL, Spring Boot y Angular. Proporciona una solución robusta y eficiente para administrar clínicas, desde la gestión de pacientes y médicos hasta el registro de emergencias y consultas externas. El proyecto utiliza una base de datos en MSSQL para almacenar los datos, un backend desarrollado en Spring Boot que maneja la lógica del negocio y una interfaz de usuario en Angular que ofrece una experiencia intuitiva y fácil de usar. Con Clínica Ángel, es posible mejorar la eficiencia en la gestión de clínicas y brindar una atención médica de calidad.

Ademas agrego el script para la base de datos:

create database clinicaAngel;
use clinicaAngel;

CREATE TABLE emergency_order (
  id INT AUTO_INCREMENT PRIMARY KEY,
  patient_name VARCHAR(255) NOT NULL,
  doctor_name VARCHAR(255) NOT NULL,
  order_date VARCHAR(255) NOT NULL,
  chief_complaint VARCHAR(255) NOT NULL,
  emergency_concept VARCHAR(255) NOT NULL,
  emergency_cost DOUBLE NOT NULL,
  emergency_details TEXT NOT NULL,
  notes VARCHAR(255) NOT NULL
);


CREATE TABLE external_consultation (
id INT PRIMARY KEY AUTO_INCREMENT,
patient_name VARCHAR(255),
doctor_name VARCHAR(255),
consultation_date DATE,
reason VARCHAR(255),
diagnosis VARCHAR(255),
treatment VARCHAR(255),
consultation_cost DECIMAL(10, 2),
consultation_details VARCHAR(255),
notes VARCHAR(255)
);



SELEcT * from emergency_order;
select * from external_consultation
