package com.br.ProjetoIntegrador.domain.repository;

<<<<<<< HEAD
import com.br.ProjetoIntegrador.domain.entity.Pessoa;

import java.util.Optional;

public interface PessoaRepository {

    public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
        Optional<Pessoa> findByNomeCompleto(String nomeCompleto);

        Optional<Pessoa> findByCpfCnpj(String cpfCnpj);

        boolean existsByCpfCnpj(String cpfCnpj);

        boolean existsByNomeCompleto(String nomeCompleto);
    }

=======
public interface PessoaRepository {
>>>>>>> ffe3fcaa6d3ac4df9c0b23da6dfe499fb8b5e90d
}
