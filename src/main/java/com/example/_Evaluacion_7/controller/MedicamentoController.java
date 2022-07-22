/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example._Evaluacion_7.controller;

import com.example._Evaluacion_7.model.Medicamento;
import com.example._Evaluacion_7.service.MedicamentoService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author thalia
 */
@RestController
@RequestMapping("/api/medicamento")
public class MedicamentoController {
    
    @Autowired
    MedicamentoService medicamentoService;
    
    @GetMapping("/listar")
    public ResponseEntity<List<Medicamento>> listar(){
        return new ResponseEntity<>(medicamentoService.findByAll(), HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<Medicamento> crear(@RequestBody Medicamento m){
        return new ResponseEntity<>(medicamentoService.create(m),HttpStatus.CREATED);
    }
    
     @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Medicamento> eliminar(@PathVariable Integer id){
        medicamentoService.delete(id);
        return  new ResponseEntity<>(HttpStatus.OK);
    }
    
    @GetMapping("/buscar/{id}")
    public ResponseEntity<Medicamento> buscar(@PathVariable Integer id){
        
        return new ResponseEntity<>(medicamentoService.findById(id),HttpStatus.OK);
    }
    
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Medicamento> actualizarEstudiante(@PathVariable Integer id, @RequestBody Medicamento m) {
        Medicamento medicamento = medicamentoService.findById(id);
        if (medicamento == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                medicamento.setNombreMedicamento(m.getNombreMedicamento());
                medicamento.setTipoMedicamento(m.getTipoMedicamento());
                medicamento.setCantidad(m.getCantidad());
                medicamento.setDistribuidor(m.getDistribuidor());
                medicamento.setSucursal(m.getDistribuidor());
                return new ResponseEntity<>(medicamentoService.create(m), HttpStatus.OK);
            } catch (Exception ex) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        
    }
}
