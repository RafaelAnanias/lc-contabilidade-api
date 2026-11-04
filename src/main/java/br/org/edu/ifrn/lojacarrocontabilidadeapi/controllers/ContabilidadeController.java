package br.org.edu.ifrn.lojacarrocontabilidadeapi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contabilidade")
@CrossOrigin(origins = "*")
public class ContabilidadeController {

    // A contabilidade consome o banco de Vendas para gerar relatórios
    @GetMapping("/resumo")
    public ResponseEntity<String> gerarResumo() {
        // Lógica simplificada. Em produção, buscaria do repositório de vendas as transações do mês
        return ResponseEntity.ok("Resumo Contábil: Sistema operando normalmente. Acesse o banco para ver o total de vendas.");
    }
}