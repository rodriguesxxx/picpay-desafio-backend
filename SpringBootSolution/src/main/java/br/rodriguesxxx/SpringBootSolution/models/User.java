package br.rodriguesxxx.SpringBootSolution.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@NoArgsConstructor
public class User {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Getter private Long id;

    @Column(name = "fullName", nullable = false)
    @Getter @Setter private String name;

    @Column(name = "cpf", unique = true, nullable = false)
    @Getter @Setter private Long cpf;

    @Column(name = "email", unique = true, nullable = false)
    @Getter @Setter private String email;

    @Column(name = "password", nullable = false)
    @Getter @Setter private String password;

}
