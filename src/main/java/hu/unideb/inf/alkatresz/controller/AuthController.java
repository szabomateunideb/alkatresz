package hu.unideb.inf.alkatresz.controller;

import hu.unideb.inf.alkatresz.service.AuthService;
import hu.unideb.inf.alkatresz.service.dto.RegisztracioDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
