package com.example.funcionarios.funcionarios_api.Repository;

import com.example.funcionarios.funcionarios_api.Entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
