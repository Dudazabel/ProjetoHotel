# 🏨 Sistema de Gestão de Hotel — Prova Prática

**Prova Prática de Técnicas de Programação**  
**Data: 15/08/2025**

Este projeto é um **sistema de gestão para um hotel**, desenvolvido em Java, permitindo o cadastro e gerenciamento de **hóspedes, quartos, reservas e serviços** oferecidos pelo hotel.  

O sistema aplica conceitos de **Programação Orientada a Objetos**, boas práticas de programação e tratamento de erros para entradas inválidas.

---

## 🎯 Objetivo
Desenvolver um sistema Java que permita:  
- Cadastrar hóspedes, quartos e reservas  
- Listar e pesquisar informações  
- Editar dados de hóspedes e cancelar reservas  
- Gerenciar serviços agregados às reservas  

---

## ⚙️ Funcionalidades do Menu Principal
| Opção | Descrição |
|-------|-----------|
| 1 | Cadastrar hóspede |
| 2 | Cadastrar quarto |
| 3 | Cadastrar reserva |
| 4 | Listar todos os hóspedes |
| 5 | Listar todos os quartos |
| 6 | Listar todas as reservas |
| 7 | Pesquisar hóspede por nome |
| 8 | Pesquisar quarto por tipo |
| 9 | Pesquisar reserva por nome do hóspede |
| 10 | Editar dados de um hóspede |
| 11 | Cancelar uma reserva |
| 0 | Sair do sistema |

---

## 🗂️ Estrutura de Pacotes
- **model** → Classes de domínio (`Hospede`, `Quarto`, `Reserva`, `Servico`, `Pessoa`)  
- **view** → Menus e interação com o usuário  
- **service** → Lógica de negócio e manipulação das listas  

---

## 🏗️ Conceitos Abordados
| Conceito | Descrição |
|----------|-----------|
| Classes e Objetos | Criação de classes e instâncias |
| Atributos e Métodos | Variáveis e comportamentos das classes |
| Encapsulamento | Uso de `private` + getters/setters |
| Construtores | Com e sem parâmetros |
| List | Armazenamento e manipulação de coleções genéricas |
| `toString()` | Sobrescrita para exibição formatada |
| Herança | Reaproveitamento de atributos e métodos (`Pessoa` → `Hospede`) |
| Polimorfismo | Uso de referências genéricas para diferentes tipos de objetos |
| `instanceof` | Verificação do tipo real em tempo de execução |
| Tratamento de Erros | Uso de `try/catch` para entradas inválidas |
| Submenus | Menus secundários para funcionalidades específicas |
| Classe Abstrata | `Pessoa` como base não instanciável |
| Agregação | `Reserva` contém objetos de `Servico` |

---

## 📌 Diferenciais do Sistema
- Menu interativo via terminal  
- Controle completo de hóspedes, quartos e reservas  
- Validação de entradas para evitar inconsistências  
- Implementação de **herança** e **agregação** para praticar conceitos avançados  
- Estrutura de código organizada por pacotes  

---

## 📝 Observações
- Utilize listas separadas para cada entidade (`hospedes`, `quartos`, `reservas`)  
- Siga boas práticas de programação (clean code, comentários e nomes claros)  
- Submenus podem ser usados para funcionalidades específicas  
- Projeto desenvolvido para **prova prática**, refletindo situação real de controle de hotel
