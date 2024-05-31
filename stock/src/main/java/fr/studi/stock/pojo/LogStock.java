package fr.studi.stock.pojo;

import fr.studi.stock.pojo.state.Action;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Table(name="log")
public class LogStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private LocalDateTime date;

    @Enumerated(EnumType.STRING)
    private Action action;// sinon AJOUT sera egal à zéro(ordinal) puisque ce sera la première action du tableau enum de Action

    private Long produit_id;

    private Long quantite;


}
