package net.danoun.hospitalapp.repository;

import net.danoun.hospitalapp.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
