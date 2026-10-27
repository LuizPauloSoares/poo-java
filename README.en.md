# Java OOP

[🇧🇷 Português](README.md) | [🇺🇸 English](README.en.md)

Repository with practical Object-Oriented Programming exercises in Java, developed during the technical course at SENAC-SP. Each folder represents an OOP pillar applied in a different scenario.

## Project status

🚧 In development — new exercises are added as I progress through the course.

## Technologies

- Java (JDK 8+)
- NetBeans IDE

## Repository structure

```
poo-java/
├── Abstracao/
│   ├── Forma.java        # abstract class
│   ├── Circulo.java
│   ├── Quadrado.java
│   ├── Retangulo.java
│   └── Main.java
├── Heranca/
│   ├── Funcionario.java  # superclass
│   ├── Estagiario.java
│   ├── Gerente.java
│   └── Loja.java         # class with main
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
    └── SomAnimal.java    # class with main
```

## How each pillar works

- **Abstraction**: `Forma` defines abstract methods (`calcularArea`, `calcularPerimetro`) that each geometric shape (`Circulo`, `Quadrado`, `Retangulo`) implements in its own way.
- **Inheritance**: `Funcionario` holds the common attributes and behaviors; `Estagiario` and `Gerente` extend the class and override `exibirinfo()`.
- **Interface**: `Veiculo` defines a contract (`acelerar`, `frear`, `exibirInfo`) implemented by `Carro`, `Moto` and `Bicicleta`, allowing them to be handled uniformly.
- **Polymorphism**: an `Animal` array holds `Cachorro`, `Gato` and `Vaca`; when calling `fazersom()` on each one, the subclass-specific behavior is executed.

## Prerequisites

- JDK 8 or higher installed
- (Optional) NetBeans IDE to open the projects directly

## How to clone and run

```bash
git clone https://github.com/LuizPauloSoares/poo-java.git
cd poo-java
```

Compile and run an exercise (example with Inheritance):

```bash
cd Heranca
javac *.java
java Loja
```

Repeat the process, changing the folder and the class with `main` (`Main` or `Loja`/`SomAnimal`, depending on the folder).

## Usage example

Expected output when running `Loja.java`:

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

## Roadmap / next steps

- [ ] Add Encapsulation exercises
- [ ] Add Abstract Classes vs. Interfaces exercises (comparison)
- [ ] Add simple unit tests

## Author

**Luiz Paulo Soares**
Information Technology student — SENAC-SP

- 📧 Email: luizdayspring@gmail.com
- 💼 LinkedIn: [linkedin.com/in/luiz-paulo-soares](https://linkedin.com/in/luiz-paulo-soares/)
- 📷 Instagram: [@lu1z_st](https://instagram.com/lu1z_st)
- 🐙 GitHub: [github.com/LuizPauloSoares](https://github.com/LuizPauloSoares)

## License

This project is licensed under the MIT license — feel free to use it as a study reference.
