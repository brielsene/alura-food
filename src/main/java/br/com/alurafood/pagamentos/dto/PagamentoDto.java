package br.com.alurafood.pagamentos.dto;

import br.com.alurafood.pagamentos.model.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PagamentoDto {
        private Long id;
        private BigDecimal valor;
        private String nome;
        private String numero;
        private String expiracao;
        private String codigo;
        private Status status;
        private Long formaDePagamentoId;
        private Long pedidoId;
}
