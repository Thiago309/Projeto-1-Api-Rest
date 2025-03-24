package avanade2025.projeto1.apirest_spring_boot.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity(name = "tb_pagamento")
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long idPagamento;
    @Column(name="FK_idCartao", nullable = false)
    private long idCartao;
    @Column(name="FK_idAluguel", nullable = false)
    private long idAluguel;
    @Column(name="data_efetuacao", nullable = false)
    private Date dataEfetuado;
    @Column(name="Valor", nullable = false, precision = 10, scale = 2)
    private BigDecimal valor;

    public long getIdPagamento() {return idPagamento;}
    public void setIdPagamento(long idPagamento) {this.idPagamento = idPagamento;}

    public long getIdCartao() {return idCartao;}
    public void setIdCartao(long idCartao) {this.idCartao = idCartao;}

    public long getIdAluguel() {return idAluguel;}
    public void setIdAluguel(long idAluguel) {this.idAluguel = idAluguel;}

    public Date getDataEfetuado() {return dataEfetuado;}
    public void setDataEfetuado(Date dataEfetuado) {this.dataEfetuado = dataEfetuado;}

    public BigDecimal getValor() {return valor;}
    public void setValor(BigDecimal valor) {this.valor = valor;}
}
