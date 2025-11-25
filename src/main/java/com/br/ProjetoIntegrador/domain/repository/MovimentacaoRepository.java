package com.br.ProjetoIntegrador.domain.repository;

import com.br.ProjetoIntegrador.domain.entity.Pessoa;

import java.util.Optional;

public interface MovimentacaoRepository {

    public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
        Optional<Pessoa> findByStatusFinanceiro(String statusFinanceiro);

        boolean existsByStatusFinanceiro (String statusFinanceiro);
    }

}
