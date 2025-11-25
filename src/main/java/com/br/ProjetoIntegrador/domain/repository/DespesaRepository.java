package com.br.ProjetoIntegrador.domain.repository;

<<<<<<< HEAD
import com.br.ProjetoIntegrador.domain.entity.Carro;
import java.util.Date;
import java.util.Optional;

public interface DespesaRepository {


    public interface PessoaRepository extends JpaRepository<Carro, Long> {
        Optional<Carro> findByTipoDespesa(String tipoDespesa);

        Optional<Carro> findByDataAlteracaoDespesa(Date dataAlteracaoDespesa);

        Optional<Carro> findByStatuysDocumentacao (String statusDocumentacao);

        Optional<Carro> findByStatusManutencao (String statusManutencao);

        boolean existsPlaca(String placa);

        boolean existsByAlteracaoDespesa(Date dataAlteracaoDespesa);;

        boolean existsByStatuysDocumentacao (String statusDocumentacao);

        boolean existsByStatusManutencao (String statusManutencao);
    }
=======
public interface DespesaRepository {
}
>>>>>>> ffe3fcaa6d3ac4df9c0b23da6dfe499fb8b5e90d
