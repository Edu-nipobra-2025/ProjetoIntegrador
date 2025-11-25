package com.br.ProjetoIntegrador.exception;
<<<<<<< HEAD
=======
import com.br.ProjetoIntegrador.domain.entity.Pessoa;

import java.util.Date;
>>>>>>> ffe3fcaa6d3ac4df9c0b23da6dfe499fb8b5e90d

public class PessoaException extends RuntimeException {
    public PessoaException(String message) {
        super(message);
    }
    public static class DataNascimentoInvalidaException extends RuntimeException {

        public DataNascimentoInvalidaException(String mensagem) {
            super(mensagem);
        }

        public DataNascimentoInvalidaException(String mensagem, Throwable causa) {
            super(mensagem, causa);
        }
    }
    }



