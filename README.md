# Employee System em Java ☕

Sistema de gerenciamento de funcionários desenvolvido em **Java**, aplicando conceitos de **Programação Orientada a Objetos (POO)**, validações robustas e boas práticas de organização de código.

---

## Funcionalidades

#### Cadastro de funcionários com diferentes tipos:
- Funcionário comum
- Funcionário terceirizado (com adicional)

#### Validação de dados do usuário:
- Horas trabalhadas sempre numéricas e positivas
- Valor por hora sempre numérico e positivo
- Adicional sempre numérico e positivo
- Tratamento de erros sem encerrar a aplicação

#### Cálculo automático de pagamentos:
- Funcionário comum recebe `horas x valor por hora`
- Funcionário terceirizado recebe pagamento normal + 110% do adicional

---

## Conceitos Aplicados

- **Herança** — classe especializada (`OutsourceEmployee`)
- **Polimorfismo** — comportamento específico em `payment()`
- **Encapsulamento** — atributos privados e métodos públicos
- **Validação de dados** — tratamento de erros e inputs inválidos
- **Separação de responsabilidades** — uso de camada `services`

---

## Estrutura do Projeto

```text
employee-system-java/
 ├── src/
 │   ├── application/
 │   │   └── Program.java
 │   ├── entities/
 │   │   ├── Employee.java
 │   │   └── OutsourceEmployee.java
 │   └── services/
 │       └── EmployeeService.java
 ├── .gitignore
 └── README.md
```

---

## ▶️ Como Executar

### 1. Compile o projeto

```bash
javac -d bin src/application/Program.java src/entities/*.java src/services/*.java
```

### 2. Execute

```bash
java -cp bin application.Program
```

---

## Exemplo de Uso

```text
--- Employee Registration ---
Number of employees: 2

Employee #1
Outsourced (y/n)? n
Name: Alex
Hours worked: 40
Value per hour: 25

Employee #2
Outsourced (y/n)? y
Name: Maria
Hours worked: 50
Value per hour: 30
Additional charge: 200

--- Payments ---
Alex - $1000.00
Maria - $1720.00
```

---

## Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos **(POO)**
- Coleções (`ArrayList`)
- Validações e tratamento de exceções

---

## Autor

**Matheus Pereira** <br>
- Estudante de Engenharia de Software Faculdade de Nova Serrana <br>
- Apaixonado por desenvolvimento desktop<br>
- GitHub: https://github.com/MatheusPereiira

---