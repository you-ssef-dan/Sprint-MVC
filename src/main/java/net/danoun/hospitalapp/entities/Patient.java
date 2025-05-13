package net.danoun.hospitalapp.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@NoArgsConstructor @AllArgsConstructor @ToString @Getter
@Setter @Builder
@Entity
@Table(name = "PATIENTS")
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private int score;
    private boolean malade;

}
