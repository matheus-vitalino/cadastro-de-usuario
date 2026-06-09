# Controle de Acesso

Projeto desenvolvido em Java utilizando os padrões **MVC** e **DAO**, com o objetivo de criar um sistema simples de cadastro, autenticação e autorização de usuários.

Este projeto foi desenvolvido como uma **prova proposta pelo professor Alexandre**.

## Sobre o Projeto

O **Controle de Acesso** é um sistema que permite cadastrar usuários e controlar o acesso de acordo com a permissão de cada um.

O sistema possui autenticação, onde o usuário precisa informar suas credenciais corretamente para acessar o sistema. Após o login, ele é direcionado para uma área específica conforme sua permissão.

## Funcionalidades

* Cadastro de usuários
* Validação dos dados informados
* Login com usuário e senha
* Autenticação de credenciais
* Autorização baseada em permissão
* Redirecionamento para área de administrador ou área comum
* Organização utilizando MVC e DAO

## Estrutura MVC

O projeto utiliza o padrão **MVC**, separando as responsabilidades da aplicação.

### Model

Responsável por representar os dados principais do sistema.

A classe principal do projeto é a classe `Usuario`, que possui os seguintes atributos encapsulados:

```java
private String nome;
private String usuario;
private String senha;
private String permissao;
```

A classe é construída por meio de um construtor, mantendo os atributos protegidos por encapsulamento.

### View

Responsável pelas telas do sistema.

As principais telas do projeto são:

```txt
CadastroUsuarioForm
LoginForm
AreaAdminForm
AreaComumForm
```

### Controller

Responsável por controlar as ações entre as telas, as regras do sistema e a comunicação com o DAO.

### DAO

Responsável pela comunicação com o banco de dados, realizando operações como cadastro e busca de usuários.

## Regras do Sistema

O sistema possui três partes principais:

### Cadastro de Usuário

Permite cadastrar um novo usuário no sistema, informando:

* Nome
* Usuário
* Senha
* Permissão

### Autenticação

Verifica se as credenciais informadas no login são válidas.

O usuário só consegue acessar o sistema se o usuário e a senha estiverem corretos.

### Autorização

Após o login, o sistema verifica a permissão do usuário.

Se a permissão for de administrador, o usuário é direcionado para a área administrativa.

Se a permissão for comum, o usuário é direcionado para a área comum.

## Tecnologias Utilizadas

* Java
* Java Swing
* JTable
* JDBC
* MySQL
* MVC
* DAO
* Programação Orientada a Objetos

## Banco de Dados

Caso o projeto esteja utilizando MySQL, é necessário criar um banco de dados antes de executar o sistema.

Exemplo de script SQL:

```sql
CREATE DATABASE IF NOT EXISTS controle_acesso;
USE controle_acesso;

CREATE TABLE IF NOT EXISTS usuarios (
    id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    usuario VARCHAR(50) NOT NULL UNIQUE,
    senha VARCHAR(100) NOT NULL,
    permissao VARCHAR(50) NOT NULL,
    PRIMARY KEY (id)
);
```

## Configuração da Conexão

Verifique se o MySQL está ligado antes de executar o projeto.

Caso esteja usando XAMPP, inicie o módulo **MySQL**.

Exemplo de conexão:

```java
private static final String URL = "jdbc:mysql://localhost:3306/controle_acesso";
private static final String USER = "root";
private static final String PASSWORD = "";
```

Se o usuário, senha ou nome do banco forem diferentes, altere no arquivo responsável pela conexão.

## Como Executar o Projeto

1. Clone ou baixe este repositório.

```bash
git clone https://github.com/seu-usuario/nome-do-repositorio.git
```

2. Abra o projeto em uma IDE Java, como NetBeans, Eclipse ou IntelliJ IDEA.

3. Ligue o MySQL pelo XAMPP ou outro servidor MySQL.

4. Crie o banco de dados usando o script SQL informado acima.

5. Verifique se o driver JDBC do MySQL está adicionado ao projeto.

6. Execute a classe principal do sistema.

## Estrutura do Projeto

Exemplo de organização do projeto:

```txt
src/
├── controllers/
│   └── UsuarioController.java
│
├── dao/
│   ├── Conexao.java
│   └── UsuarioDAO.java
│
├── main/
│   └── Main.java
│
├── models/
│   └── Usuario.java
│
└── views/
    ├── CadastroUsuarioForm.java
    ├── LoginForm.java
    ├── AreaAdminForm.java
    └── AreaComumForm.java
```

## Exemplo de Uso

1. O usuário abre o sistema.
2. Realiza o cadastro informando nome, usuário, senha e permissão.
3. Depois acessa a tela de login.
4. Informa usuário e senha.
5. O sistema verifica se as credenciais são válidas.
6. Se estiver correto, o sistema verifica a permissão.
7. O usuário é direcionado para a área correspondente.

## Objetivo da Prova

O objetivo deste projeto foi praticar os seguintes conceitos:

* Programação orientada a objetos
* Encapsulamento
* Criação de classes Model
* Criação de telas com Java Swing
* Uso do padrão MVC
* Uso do padrão DAO
* Cadastro de dados
* Autenticação de usuários
* Autorização por permissão
* Integração com banco de dados

## Autor

Desenvolvido por **Matheus Henrique**.

## Observação

Projeto desenvolvido para fins acadêmicos, como parte de uma prova proposta pelo professor Alexandre.
