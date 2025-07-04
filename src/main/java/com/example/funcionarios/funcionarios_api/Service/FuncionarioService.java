package com.example.funcionarios.funcionarios_api.Service;

import com.example.funcionarios.funcionarios_api.Entity.Funcionario;
import com.example.funcionarios.funcionarios_api.Exception.EntityNotFoundException;
import com.example.funcionarios.funcionarios_api.Repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FuncionarioService {
   @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<Funcionario> listAllFuncionarios() {
        return funcionarioRepository.findAll();
    }
    public Funcionario listById(Long id) {
        return funcionarioRepository.findById(id).
                orElseThrow(() -> new EntityNotFoundException("Funcionario não encontrado com ID: " + id));
    }

    public Funcionario saveFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public void deleteFuncionario(Long id) {
        Funcionario f = funcionarioRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Funcionario não encontrado com ID: " + id));
                funcionarioRepository.delete(f);
    }

    public Funcionario updateFuncionario(Long id, Funcionario novoFuncionario) {
        return funcionarioRepository.findById(id).map(
                f -> {
                    f.setNome(novoFuncionario.getNome());
                    f.setEmail(novoFuncionario.getEmail());
                    f.setCpf(novoFuncionario.getCpf());
                    f.setTelefone(novoFuncionario.getTelefone());
                    f.setEndereco(novoFuncionario.getEndereco());
                    f.setDataNascimento(novoFuncionario.getDataNascimento());
                    f.setCidade(novoFuncionario.getCidade());

                    return funcionarioRepository.save(f);
                })
                .orElseThrow(() -> new EntityNotFoundException("Funcionario não encontrado com ID: " + id));
    }





}
