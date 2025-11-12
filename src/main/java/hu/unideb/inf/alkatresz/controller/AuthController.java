package hu.unideb.inf.alkatresz.controller;

import hu.unideb.inf.alkatresz.service.AuthService;
import hu.unideb.inf.alkatresz.service.dto.BejelentkezesDto;
import hu.unideb.inf.alkatresz.service.dto.RegisztracioDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth")
@Validated
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/regisztracio")
    public void regisztracio(@RequestBody @Valid RegisztracioDto dto) {
        authService.regisztracio(dto);
    }

    @PostMapping("/bejelentkezes")
    public String bejelentkezes(@RequestBody BejelentkezesDto dto) {
        return authService.bejelentkezes(dto);
    }

    @RequestMapping(value = "/**", method = RequestMethod.OPTIONS)
    public ResponseEntity<Void> options(){
        return ResponseEntity.ok().build();
    }
}
