package hu.unideb.inf.alkatresz.service.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisztracioDto {
    @NotBlank(message = "Ne legyen üres")
    @Size(min = 10,
            max = 200,
            message = "Legalább 10 legyen, max 200")
    private String nev;
    private String felhasznalonev;
    @NotBlank(message = "Ne legyen üres")
    @Size(min = 8, max = 200)
    private String jelszo;
    @Email
    private String email;
}
