# SistemaGerenciamentoBanco

Este projeto é um sistema simples de gerenciamento escolar em Java, com funcionalidades para criar turmas, adicionar alunos e listar alunos de cada turma.

## Estrutura

- **Pacote principal:** `SistemaGerenciamentoBanco`
- **Executor:** `executor/Main.java`
- **Domínio:** `dominio/Escola.java`, `dominio/Turma.java`, `dominio/Aluno.java`

## Como funciona

O programa inicia pela classe `Main`, que executa o seguinte fluxo:

1. Cria uma instância de `Escola`.
2. Chama o método `escolhas()`, que apresenta um menu interativo no terminal para:
   - Criar turmas
   - Adicionar alunos a turmas
   - Listar alunos de uma turma
   - Sair do sistema

## Como executar

1. Compile todos os arquivos Java:
   ```sh
   javac SistemaGerenciamentoBanco/dominio/*.java SistemaGerenciamentoBanco/executor/Main.java
