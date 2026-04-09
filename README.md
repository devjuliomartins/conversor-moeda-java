# Conversor de Moeda em Java

Este projeto é um exercício da aula 3 da disciplina de Arquitetura e Projeto de Software do curso de Engenharia de Software. O objetivo é aplicar conceitos de lógica, regras de negócio e testes automatizados em um pequeno sistema de conversão de moedas.

## Sobre o projeto

A aplicação implementa um conversor de moedas em Java com regras específicas de conversão entre diferentes moedas. As taxas de câmbio são fixas e definidas diretamente no código apenas para fins didáticos.

A lógica principal está na classe `ConversorDeMoeda.java` e os testes unitários estão na classe `ConversorDeMoedaTest.java`.

## Funcionalidades

. Conversão entre as moedas USD, BRL, EUR e JPY  
. Retorno do mesmo valor quando a moeda de origem e destino são iguais  
. Regras específicas para conversão entre moedas estrangeiras  
. Desconto aplicado para clientes VIP  
. Ajuste aplicado para valores convertidos maiores que 10.000  
. Validação de valores inválidos  
. Tratamento de moedas não suportadas

## Tecnologias utilizadas

. Java  
. JUnit para testes unitários

## Requisitos

. JDK instalado  
. IDE Java ou ferramenta de build compatível

## Como executar
```
1. Clone o repositório
2. Abra o projeto na sua IDE
3. Execute a classe de testes ou utilize a classe principal para testar o método de conversão
