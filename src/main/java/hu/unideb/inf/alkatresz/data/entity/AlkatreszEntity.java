package hu.unideb.inf.alkatresz.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "part")
public class AlkatreszEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String nev;
    @Column(name = "description")
    private String leiras;
    @Column(name = "type")
    private String tipus;
    @Column(name = "size")
    private String meret;
    @Column(name = "brand")
    private String gyarto;
    @Column(name = "weight")
    private Double suly;
    @Column(name = "memory")
    private Integer memoria;

}