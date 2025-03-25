# Projeto-1-Api-Rest
 Publicando minha API REST na Nuvem Usando Spring Boot 3, Java 17 e Railway

## Diagrama de classes

```mermaid
classDiagram
    direction LR
    
    class Veiculo {
        -idVeiculo: Long
        -placa: String
        -modelo: String
        -marca: String
        -categoria: String
        -cor: String
        -KmRodados:Long
        -ano: Integer
        -disponivel: boolean
        -valorDiaria: Double
    }

    class Cliente {
        -idCliente: Long
        -nome: String
        -cpf: String
        -email: String
        -telefone: String
        -estado: String
        -cep: String
        -cidade: String
        -endereco: String
        -complemento: String
    }
    
    class Pagamento {
        -idPagamento: Long
        -idCartao: Long
        -idAluguel: Long
        -dataEfetuado: LocalDate
        -valor: BigDecimal(10,2)
    }

    class infoCard {
        -idCartao: Long
        -numero: Integer
        -cvv: Integer
        -bandeira: String
        -titular: String
        -numeroParcelas: Integer
        -valor: BigDecimal(10,2)
    }

    class Aluguel {
        -idAluguel: Long
        -idVeiculo: Long
        -idCliente: Long
        -dataInicio: LocalDate
        -dataFim: LocalDate
        -valorTotal: BigDecimal(10,2)
    }

    class VeiculoController {
        +listarTodos(disponivel: boolean): List~Veiculo~
        +criarVeiculo(veiculoDTO: VeiculoDTO): ResponseEntity~Veiculo~
    }

    class ClienteController {
        +criarCliente(clienteDTO: ClienteDTO): ResponseEntity~Cliente~
    }

    class AluguelController {
        +criarAluguel(aluguelDTO: AluguelDTO): ResponseEntity~Aluguel~
        +buscarAluguel(id: Long): ResponseEntity~Aluguel~
    }

    class VeiculoService {
        -veiculoRepository: VeiculoRepository
        +listarVeiculos(disponivel: boolean): List~Veiculo~
        +salvarVeiculo(veiculo: Veiculo): Veiculo
    }

    class AluguelService {
        -aluguelRepository: AluguelRepository
        -veiculoRepository: VeiculoRepository
        +criarAluguel(aluguelDTO: AluguelDTO): Aluguel
    }

    class VeiculoRepository {
        <<Interface>>
        +findByDisponivel(boolean): List~Veiculo~
    }

    class AluguelRepository {
        <<Interface>>
        +save(Aluguel): Aluguel
    }
    
    VeiculoController --> VeiculoService
    ClienteController --> ClienteService
    AluguelController --> AluguelService
    VeiculoService --> VeiculoRepository
    AluguelService --> AluguelRepository
    AluguelService --> VeiculoRepository
    infoCard "0..1" --> "0..1" Pagamento
    Pagamento "0..1" --> "1..1" Aluguel
    Aluguel "0..1" <-- "1..1" Veiculo
    Aluguel "0..1" <-- "1..1" Cliente
```
