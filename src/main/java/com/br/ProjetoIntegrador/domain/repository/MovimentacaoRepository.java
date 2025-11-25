package com.br.ProjetoIntegrador.domain.repository;

<<<<<<< HEAD
import com.br.ProjetoIntegrador.domain.entity.Pessoa;

import java.util.Optional;

public interface MovimentacaoRepository {

    public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
        Optional<Pessoa> findByStatusFinanceiro(String statusFinanceiro);

        boolean existsByStatusFinanceiro (String statusFinanceiro);
    }

=======
public interface MovimentacaoRepository {
>>>>>>> ffe3fcaa6d3ac4df9c0b23da6dfe499fb8b5e90d
}
