/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example._Evaluacion_7.service;

import com.example._Evaluacion_7.model.Medicamento;
import com.example._Evaluacion_7.repository.MedicamentoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author thalia
 */
@Service
public class MedicamentoServiceImp implements MedicamentoService {

     @Autowired
    MedicamentoRepository medicamentoRepository;
    
    @Override
    public Medicamento create(Medicamento m) {
        return medicamentoRepository.save(m);
    }

    @Override
    public Medicamento findById(Integer id) {
        return medicamentoRepository.findById(id).orElse(new Medicamento());
    }

    @Override
    public List<Medicamento> findByAll() {
        return medicamentoRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        medicamentoRepository.deleteById(id);
    }
    
}

