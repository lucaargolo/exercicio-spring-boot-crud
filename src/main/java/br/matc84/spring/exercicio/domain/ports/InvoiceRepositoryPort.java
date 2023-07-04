package br.matc84.spring.exercicio.domain.ports;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import br.matc84.spring.exercicio.domain.models.InvoiceModel;

public interface InvoiceRepositoryPort {

    List<InvoiceModel> getAll();

    Optional<InvoiceModel> findById(String uuid);

    InvoiceModel create(BigDecimal totalValue, LocalDate dueDate);

}
