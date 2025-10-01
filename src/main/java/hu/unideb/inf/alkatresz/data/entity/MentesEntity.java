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
@Table(name = "saved_parts")
public class MentesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private FelhasznaloEntity felhasznalo;
    @ManyToOne
    @JoinColumn(name = "part_id")
    private AlkatreszEntity alkatresz;



}
