# Projeto Base para Automação de Testes de API

Este é um projeto template que pode ser usado como ponto de partida para automações de testes de API. Ele utiliza Java 17 como linguagem principal e integra bibliotecas como Lombok, TestNG, Maven e Extent Report.

## Pré-requisitos

- **Java 17:** Certifique-se de ter o JDK 17 instalado.
- **Maven:** Utilizamos o Maven para gerenciar as dependências e construir o projeto.

## Configuração

1. **Clonar o repositório:** Clone este repositório em sua máquina local.

    ```bash
    git clone https://github.com/rafaelmatosqa/restassured-template.git
    ```

2. **Importar o projeto:** Importe o projeto em sua IDE preferida como um projeto Maven existente.

3. **Configuração das Dependências:** As dependências estão configuradas no arquivo `pom.xml`. Certifique-se de que o Maven está instalado e execute:

    ```bash
    mvn clean install
    ```

## Estrutura do Projeto

- `src/main/java`: Contém os códigos-fonte do projeto.
- `src/test/java`: Armazena os testes automatizados.
- `src/main/resources`: Recursos adicionais.
- `extent-report`: Relatórios gerados pelo Extent Report.

## Executando os Testes

Os testes podem ser executados através da sua IDE, executando as classes de teste ou via Maven:

```bash
mvn test