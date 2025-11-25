package com.br.ProjetoIntegrador.domain.repository;

import java.util.Date;
import com.br.ProjetoIntegrador.domain.entity.Carro;
import com.br.ProjetoIntegrador.domain.entity.Pessoa;

import java.util.Optional;

public interface CarroRepository {

    public interface PessoaRepository extends JpaRepository<Carro, Long> {
        Optional<Carro> findByPlaca(String placa);

        Optional<Carro> findByDataRegistro(Date dataRegistro);

        Optional<Carro> findByProprietario (Pessoa proprietario);

        Optional<Carro> findByStatusAtivo (boolean statusAtivo);

        boolean existsPlaca(String placa);

        boolean existsByDataRegistro(Date dataRegistro);

        boolean existsByProprietario (Pessoa proprietario);

        boolean existsByStatusAtivo (boolean statusAtivo);
    }

}
