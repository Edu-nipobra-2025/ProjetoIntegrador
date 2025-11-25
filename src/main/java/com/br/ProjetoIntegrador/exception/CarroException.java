package com.br.ProjetoIntegrador.exception;

import com.br.ProjetoIntegrador.domain.entity.Carro;

public class CarroException extends RuntimeException {
    public CarroException(String message) {
        super(message);
    }

    public class CarroInvalidoException extends RuntimeException{
        public CarroInvalidoException (String mensagem){
            super (mensagem);
        }
        public CarroInvalidoException(String mensagem, Throwable causa){
            super(mensagem, causa);
        }
    }
}
