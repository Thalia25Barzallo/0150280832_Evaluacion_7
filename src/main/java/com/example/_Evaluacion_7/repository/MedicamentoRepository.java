/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example._Evaluacion_7.repository;

import com.example._Evaluacion_7.model.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author thalia
 */
public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer>{
    
}

