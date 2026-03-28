# Sistema Acadêmico (Java - POO)

Projeto desenvolvido como atividade acadêmica para a disciplina de Programação Orientada a Objetos (POO).

O sistema simula o gerenciamento de alunos, professores e disciplinas, aplicando conceitos fundamentais da orientação a objetos em Java.

O projeto foi desenvolvido em duas versões: uma em arquivo único e outra organizada em múltiplos arquivos dentro da pasta SistemaAcademico. Ambas possuem o mesmo funcionamento.

---

## Funcionalidades

### Alunos
- Cadastro com nome, matrícula e nota
- Validação de dados no construtor
- Encapsulamento dos atributos
- Ajuste de nota com validação

Verificação de aprovação:
- Graduação: nota >= 7
- Pós-graduação: nota >= 6

---

### Professores
- Cadastro com nome, matrícula e salário
- Salário não pode ser negativo
- Aumento salarial controlado

Tipos:
- Professor Efetivo
- Professor Temporário
- Não recebe aumento após fim do contrato

---

### Disciplinas
- Possuem:
  - Nome
  - Professor responsável
  - Lista de alunos

Regras:
- Não permite aluno duplicado
- Lista protegida (encapsulamento)

---

## Estrutura

- Aluno (classe abstrata)
- AlunoGraduacao
- AlunoPosGraduacao
- Professor
- ProfessorEfetivo
- ProfessorTemporario
- Disciplina
- SistemaAcademicoUNIFSA (main)

---

## Conceitos Utilizados

- Encapsulamento
- Herança
- Polimorfismo
- Classes abstratas
- Reutilização de código
- Validação de dados
