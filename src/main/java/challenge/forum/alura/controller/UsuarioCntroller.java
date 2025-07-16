package challenge.forum.alura.controller;

import challenge.forum.alura.dto.UsuarioLoginDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class UsuarioCntroller {

    @Autowired
    private AuthenticationManager manager;

    @PostMapping
    public ResponseEntity efetuarLogin(@RequestBody @Valid UsuarioLoginDTO dados) {
    var token = new UsernamePasswordAuthenticationToken(dados.login(), dados.senha());
    var authenticaon =  manager.authenticate(token);

    return  ResponseEntity.ok().build();
    }
}
