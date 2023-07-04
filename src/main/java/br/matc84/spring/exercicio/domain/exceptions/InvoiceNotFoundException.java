package br.matc84.spring.exercicio.domain.exceptions;

import java.io.Serial;

public class InvoiceNotFoundException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public InvoiceNotFoundException(String id) {
        super("Invoice not found -> " + id);
    }

}