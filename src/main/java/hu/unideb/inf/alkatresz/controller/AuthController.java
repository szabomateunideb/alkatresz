package hu.unideb.inf.alkatresz.controller;

import hu.unideb.inf.alkatresz.service.AuthService;
import hu.unideb.inf.alkatresz.service.dto.BejelentkezesDto;
import hu.unideb.inf.alkatresz.service.dto.RegisztracioDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/regisztracio")
    public void regisztracio(@RequestBody RegisztracioDto dto) {
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
