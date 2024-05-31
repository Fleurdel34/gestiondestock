package fr.studi.stock.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Entrepot {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long entrepotId; // en base : entrepot_id
    private String adresse;
    private String nom;


}
