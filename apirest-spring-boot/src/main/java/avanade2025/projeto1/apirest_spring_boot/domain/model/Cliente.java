package avanade2025.projeto1.apirest_spring_boot.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PK_id")
    private long idCliente;
    @Column(name="nome", nullable = false)
    private String nome;
    @Column(name="cpf", length = 20,nullable = false)
    private String cpf;
    @Column(name="email", nullable = false)
    private String email;
    @Column(name="telefone", length = 20,nullable = false)
    private String telefone;
    @Column(name="estado", nullable = false)
    private String estado;
    @Column(name="cep", length = 20, nullable = false)
    private String cep;
    @Column(name="cidade", nullable = false)
    private String cidade;
    @Column(name="endereco", nullable = false)
    private String endereco;
    @Column(name="complemento", nullable = false)
    private String complemento;

    public long getIdCliente() {return idCliente;}
    public void setIdCliente(long idCliente) {this.idCliente = idCliente;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getCpf() {return cpf;}
    public void setCpf(String cpf) {this.cpf = cpf;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getTelefone() {return telefone;}
    public void setTelefone(String telefone) {this.telefone = telefone;}

    public String getEstado() {return estado;}
    public void setEstado(String estado) {this.estado = estado;}

    public String getCep() {return cep;}
    public void setCep(String cep) {this.cep = cep;}

    public String getCidade() {return cidade;}
    public void setCidade(String cidade) {this.cidade = cidade;}

    public String getEndereco() {return endereco;}

    public void setEndereco(String endereco) {this.endereco = endereco;}

    public String getComplemento() {return complemento;}
    public void setComplemento(String complemento) {this.complemento = complemento;}
}
