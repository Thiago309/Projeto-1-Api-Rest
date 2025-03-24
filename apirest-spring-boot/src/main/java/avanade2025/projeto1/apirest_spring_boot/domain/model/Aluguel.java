package avanade2025.projeto1.apirest_spring_boot.domain.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity(name = "tb_registro")
public class Aluguel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PK_id", nullable = false)
    private long idAluguel;
    @Column(name="FK_idVeiculo", nullable = false)
    private long idVeiculoAlu;
    @Column(name="FK_idCliente", nullable = false)
    private long idCliente;
    @Column(name="Inicio", nullable = false)
    private Date dataInicio;
    @Column(name="Fim", nullable = false)
    private Date dataFim;
    @Column(name="Total", nullable = false, precision = 10, scale = 2)
    private BigDecimal valor;

    public long getIdAluguel() {return idAluguel;}
    public void setIdAluguel(long idAluguel) {this.idAluguel = idAluguel;}

    public long getIdVeiculoAlu() {return idVeiculoAlu;}
    public void setIdVeiculoAlu(long idVeiculoAlu) {this.idVeiculoAlu = idVeiculoAlu;}

    public long getIdCliente() {return idCliente;}
    public void setIdCliente(long idCliente) {this.idCliente = idCliente;}

    public Date getDataInicio() {return dataInicio;}
    public void setDataInicio(Date dataInicio) {this.dataInicio = dataInicio;}

    public Date getDataFim() {return dataFim;}
    public void setDataFim(Date dataFim) {this.dataFim = dataFim;}

    public BigDecimal getValor() {return valor;}
    public void setValor(BigDecimal valor) {this.valor = valor;}
}