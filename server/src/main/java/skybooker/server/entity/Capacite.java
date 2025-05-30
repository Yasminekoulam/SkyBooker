package skybooker.server.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import skybooker.server.DTO.CapaciteDTO;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "capacites")
public class Capacite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int capacite;
    private int borneInf;
    private int borneSup;

    @JsonIgnore
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "avion_id", nullable = false)
    private Avion avion;

    @OneToOne(cascade = CascadeType.ALL)
    private Classe classe;

    public Capacite(CapaciteDTO capaciteDTO) {
        setCapacite(capaciteDTO.getCapacite());
        setBorneInf(capaciteDTO.getBorneInf());
        setBorneSup(capaciteDTO.getBorneSup());
    }
}
