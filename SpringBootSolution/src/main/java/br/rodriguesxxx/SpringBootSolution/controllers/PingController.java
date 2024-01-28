package br.rodriguesxxx.SpringBootSolution.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/ping")
public class PingController {
    
    @GetMapping    
    public ResponseEntity<String> index() {
        return ResponseEntity.status(HttpStatus.OK).body("Teste");
    }
}
