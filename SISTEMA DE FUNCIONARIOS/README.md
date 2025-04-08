# 👥 Sistema de Funcionários

**Daniel Silva Guedes - 202208699804**

## 🚀 Sobre o Sistema

Sistema que demonstra o uso de herança e polimorfismo em Java, implementando diferentes tipos de funcionários (Tempo Integral, Meio Período e Contratado) que herdam características de uma classe base abstrata (Funcionário).

## 📋 Estrutura do Sistema

### Classes Implementadas:

- **📑 Funcionario (Classe Abstrata)**
  - Classe base com atributos comuns
  - Método abstrato `calcularSalario()`

- **💼 FuncionarioTempoIntegral**
  - Funcionários com benefícios adicionais
  - Salário calculado: base + benefícios

- **⏲️ FuncionarioMeioPeriodo**
  - Funcionários com carga horária reduzida
  - Salário proporcional às horas trabalhadas

- **📝 FuncionarioContratado**
  - Funcionários temporários
  - Salário inclui taxa de serviço

## 🔧 Funcionalidades

- Cálculo de salário específico para cada tipo de funcionário
- Gerenciamento de dados pessoais
- Demonstração de polimorfismo no tratamento dos funcionários

## 💻 Como Executar

1. Compile todos os arquivos:
```bash
javac *.java
```

2. Execute a classe principal:
```bash
java Main
```

## 🎯 Conceitos Demonstrados

- Herança
- Polimorfismo
- Classes Abstratas
- Encapsulamento
- Sobrescrita de Métodos

---

<div align="center">
  <sub>Daniel Silva Guedes - 202208699804</sub>
</div> 