package hu.unideb.inf.alkatresz.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class FelhasznaloEntity implements UserDetails {

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

    @OneToMany(mappedBy = "felhasznalo")
    private List<MentesEntity> mentesek;

    @ManyToMany
    private List<JogosultsagEntity> jogosultsagok;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return jogosultsagok;
    }

    @Override
    public String getPassword() {
        return jelszo;
    }

    @Override
    public String getUsername() {
        return felhasznalonev;
    }
}
