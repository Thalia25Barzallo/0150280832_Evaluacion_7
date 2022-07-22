/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example._Evaluacion_7.service;

import com.example._Evaluacion_7.model.Medicamento;
import java.util.List;

/**
 *
 * @author thalia
 */
public interface MedicamentoService {
    
    public Medicamento create(Medicamento m);
    public Medicamento findById(Integer id);
    public List<Medicamento> findByAll();
    public void delete(Integer id);
}

