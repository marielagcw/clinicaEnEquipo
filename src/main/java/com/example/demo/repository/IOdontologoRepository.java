package com.example.demo.repository;

import com.example.demo.entity.Odontologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOdontologoRepository extends JpaRepository<Odontologo, Integer> {
    // Podría agregar un método que no sea estándar (que no esté incluido en el JpaRepository)
}
