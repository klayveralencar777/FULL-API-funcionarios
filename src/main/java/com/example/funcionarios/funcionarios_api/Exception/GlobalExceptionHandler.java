package com.example.funcionarios.funcionarios_api.Exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<String> handleNotFound(EntityNotFoundException e) {
        return ResponseEntity.status(404).body(e.getMessage());
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<String> handleConflit(DataIntegrityViolationException e) {
        return ResponseEntity.status(400).body(e.getMessage());

    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleExceptionGeneric(Exception e) {
        return ResponseEntity.status(500).body("Erro interno no server, verifique os campos e tente novamente.");
    }
}
