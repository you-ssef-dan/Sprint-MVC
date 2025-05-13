package net.danoun.hospitalapp;

import net.danoun.hospitalapp.entities.Patient;
import net.danoun.hospitalapp.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class HospitalAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalAppApplication.class, args);
    }

    @Bean
    public CommandLineRunner start(PatientRepository patientRepository) {
        return args -> {

            Patient p1 = new Patient();
            p1.setNom("danoun");
            p1.setPrenom("youssef");
            p1.setMalade(false);
            p1.setScore(7);
            p1.setDateNaissance(new Date());

            Patient p2 = new Patient(null,"chidoub","reda",new Date(),10,false);

            Patient p3 = Patient.builder()
                    .nom("Ait ben")
                    .prenom("adam")
                    .malade(true)
                    .build();

            patientRepository.save(p1);
            patientRepository.save(p2);
            patientRepository.save(p3);

            List<Patient> patients = patientRepository.findAll();

            patients.forEach(p ->
                    System.out.println(p.toString()));


        };
    }
}