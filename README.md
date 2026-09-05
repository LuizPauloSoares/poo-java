# POO Java

Repositório com exercícios práticos de Programação Orientada a Objetos em Java, desenvolvidos durante o curso técnico no SENAC-SP. Cada pasta representa um pilar de POO aplicado em um cenário diferente.

## Status do projeto

🚧 Em desenvolvimento — novos exercícios são adicionados conforme avanço no curso.

## Tecnologias utilizadas

- Java (JDK 8+)
- NetBeans IDE

## Estrutura do repositório

```
poo-java/
├── Abstracao/
│   ├── Forma.java        # classe abstrata
│   ├── Circulo.java
│   ├── Quadrado.java
│   ├── Retangulo.java
│   └── Main.java
├── Heranca/
│   ├── Funcionario.java  # superclasse
│   ├── Estagiario.java
│   ├── Gerente.java
│   └── Loja.java         # classe com main
├── Interface/
│   ├── Veiculo.java      # interface
│   ├── Carro.java
│   ├── Moto.java
│   ├── Bicicleta.java
│   └── Main.java
└── Polimorfismo/
    ├── Animal.java
    ├── Cachorro.java
    ├── Gato.java
    ├── Vaca.java
    └── SomAnimal.java    # classe com main
```

## Como cada pilar funciona

- **Abstração**: `Forma` define métodos abstratos (`calcularArea`, `calcularPerimetro`) que cada figura geométrica (`Circulo`, `Quadrado`, `Retangulo`) implementa à sua maneira.
- **Herança**: `Funcionario` concentra atributos e comportamentos comuns; `Estagiario` e `Gerente` estendem a classe e sobrescrevem `exibirinfo()`.
- **Interface**: `Veiculo` define um contrato (`acelerar`, `frear`, `exibirInfo`) implementado por `Carro`, `Moto` e `Bicicleta`, permitindo tratá-los de forma uniforme.
- **Polimorfismo**: um array de `Animal` guarda `Cachorro`, `Gato` e `Vaca`; ao chamar `fazersom()` em cada um, o comportamento específico da subclasse é executado.

## Pré-requisitos

- JDK 8 ou superior instalado
- (Opcional) NetBeans IDE para abrir os projetos diretamente

## Como clonar e rodar

```bash
git clone https://github.com/LuizPauloSoares/poo-java.git
cd poo-java
```

Compilar e executar um exercício (exemplo com Herança):

```bash
cd Heranca
javac *.java
java Loja
```

Repita o processo trocando a pasta e a classe com `main` (`Main` ou `Loja`/`SomAnimal`, dependendo da pasta).

## Exemplo de uso

Saída esperada ao rodar `Loja.java`:

```
Nome : Matheus
Salario : 1200.0
Horas trabalhadas : 1000
Nome : Felipe
Salario : 2000.0
Nome : Lucas
Salario : 10000.0
Bonus : 1000.0
```

## Roadmap / próximos passos

- [ ] Adicionar exercícios de Encapsulamento
- [ ] Adicionar exercícios de Classes Abstratas x Interfaces (comparativo)
- [ ] Adicionar testes unitários simples

## Autor

**Luiz Paulo Soares**
Estudante de Tecnologia da Informação — SENAC-SP

- 📧 Email: luizdayspring@gmail.com
- 💼 LinkedIn: [linkedin.com/in/luiz-paulo-soares](https://linkedin.com/in/luiz-paulo-soares/)
- 📷 Instagram: [@lu1z_st](https://instagram.com/lu1z_st)
- 🐙 GitHub: [github.com/LuizPauloSoares](https://github.com/LuizPauloSoares)

## Licença

Este projeto está sob a licença MIT — sinta-se livre para usar como referência de estudo.
