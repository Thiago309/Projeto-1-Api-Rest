package avanade2025.projeto1.apirest_spring_boot.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_veiculos")
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long idVeiculo;
    @Column(name="placa")
    private String placa;
    @Column(name="modelo")
    private String modelo;
    @Column(name="marca")
    private String marca;
    @Column(name="categoria")
    private String categoria;
    @Column(name="cor")
    private String cor;
    @Column(name="quilometros")
    private long kmRodados;
    @Column(name="ano")
    private String ano;
    @Column(name="status")
    private boolean disponivel;
    @Column(name="preço")
    private BigDecimal valorDiaria;

    public long getIdVeiculo() {return idVeiculo;}
    public void setIdVeiculo(long idVeiculo) {this.idVeiculo = idVeiculo;}

    public String getPlaca() {return placa;}
    public void setPlaca(String placa) {this.placa = placa;}

    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}

    public String getMarca() {return marca;}
    public void setMarca(String marca) {this.marca = marca;}

    public String getCategoria() {return categoria;}
    public void setCategoria(String categoria) {this.categoria = categoria;}

    public String getCor() {return cor;}
    public void setCor(String cor) {this.cor = cor;}

    public long getKmRodados() {return kmRodados;}
    public void setKmRodados(long kmRodados) {this.kmRodados = kmRodados;}

    public String getAno() {return ano;}
    public void setAno(String ano) {this.ano = ano;}

    public boolean isDisponivel() {return disponivel;}
    public void setDisponivel(boolean disponivel) {this.disponivel = disponivel;}

    public BigDecimal getValorDiaria() {return valorDiaria;}
    public void setValorDiaria(BigDecimal valorDiaria) {this.valorDiaria = valorDiaria;}
}