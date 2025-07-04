package com.example.funcionarios.funcionarios_api.Controller;


import com.example.funcionarios.funcionarios_api.Entity.Funcionario;
import com.example.funcionarios.funcionarios_api.Service.FuncionarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/funcionarios")
public class FuncionarioController {
    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping
    public ResponseEntity<Funcionario> postFuncionario(@RequestBody @Valid Funcionario funcionario) {
           Funcionario funcionarioCriado = funcionarioService.saveFuncionario(funcionario);
           return ResponseEntity.status(201).body(funcionarioCriado);
    }

    @GetMapping
    public ResponseEntity<List<Funcionario>> getAllFuncionarios() {
        List<Funcionario> funcionarios = funcionarioService.listAllFuncionarios();
        return ResponseEntity.status(200).body(funcionarios);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Funcionario> getFuncionarioById(@PathVariable Long id) {
        Funcionario findFuncionario = funcionarioService.listById(id);
        return ResponseEntity.status(200).body(findFuncionario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Funcionario> putFuncionarioById(@PathVariable Long id, @Valid @RequestBody Funcionario novoFuncionario) {
        Funcionario f = funcionarioService.updateFuncionario(id, novoFuncionario);
        return ResponseEntity.status(200).body(f);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFuncionario(@PathVariable Long id) {
        funcionarioService.deleteFuncionario(id);
        return ResponseEntity.status(204).build();

    }














}
