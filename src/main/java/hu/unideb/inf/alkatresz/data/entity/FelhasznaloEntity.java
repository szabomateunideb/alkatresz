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
@Table(name = "users")
public class FelhasznaloEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name", nullable = false)
    private String nev;
    @Column(name = "username", nullable = false, unique = true)
    private String felhasznalonev;
    @Column(name = "password", nullable = false)
    private String jelszo;
    @Column(name = "email", nullable = false)
    private String email;
}
