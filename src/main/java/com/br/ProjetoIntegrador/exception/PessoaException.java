package com.br.ProjetoIntegrador.exception;
import com.br.ProjetoIntegrador.domain.entity.Pessoa;

import java.util.Date;

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



