# Api para um crud simples de usuarios

Essa api esta sendo feita para estudos dos métodos https e também para estudar a interface de documentação do swagger-ui.

## Tecnologias utilizadas
- Java
- Spring-boot
- Banco de dados em memória(H2-database)
- Swagger-ui
- JPA

## Métodos da API:

- **GetAllUsers**
- **GetById**
- **PostUser**

### **1. GetAllUsers:**

- **Descrição:** Recupera todos os usuários do repositório.
- **Requisição:** GET
- **Rota da requisição:** /Users
- **Retorno:** Retorna todos os usuários cadastrados na api como objeto(Users).

### Exemplo de retorno do método "GetAllUsers"
- Url da requisição: localhost:8080/Users
```json
[
  {
    "id": 1,
    "cpf": "123.456.789-10",
    "name": "Eric Souza",
    "email": "teste@gmail.com",
    "birthDate": "20-03-2007"
    
  },

  {
    "id": 2,
    "cpf": "123.456.789-10",
    "name": "other user",
    "email": "teste@gmail.com",
    "birthDate": "12-34-5678"

  }
]
```
---

### **2. GetById:**

- **Descrição:** Recupera um usuário especifico através do identificador dele(id).
- **Requisição:** GET
- **Rota da requisição:** /Users/id
- **Retorno:** Retorna um usuário especifico cadastrados na api.

### Exemplo de retorno do método "GetById"
- Url de requisição: localhost:8080/Users/1
```json
[
    {
    "id": 1,
    "cpf": "123.456.789-10",
    "name": "Eric Souza",
    "email": "teste@gmail.com",
    "birthDate": "20-03-2007"
    }
]
```
---
### **3. PostUsers:**

- **Descrição:** Faz o cadastro dos usuários no banco em memória.
- **Requisição:** Post
- **Rota da requisição:** /Users
- **Retorno:** Retorna com o Usuário cadastrado com sucesso.

### Exemplo de retorno do método "PostUser"

- Url de requisição: localhost:8080/Users

```json
[
  {
    "id": 3,
    "cpf": "123.456.789-10",
    "name": "new user",
    "email": "newUser@gmail.com",
    "birthDate": "20-03-2007"
  }
]
```
---

### **4. UpdateUser:**

- **Descrição:** Faz a atualização dos usuários no banco em memória.
- **Requisição:** Put
- **Rota de requisição:** /Users
- **Retorno:** caso encontre o id do usuário, retorna um status 200 com ok usuário atualizado com sucesso.

### Exemplo de requisição do body com json

- Url de requisição: localhost:8080/Users

```json
[
  {
    "id": 2, 
    "cpf": "123.456.789-10",
    "name": "new user",
    "email": "newUser@gmail.com",
    "birthDate": "10-04-2007"
  }
]
```
1 - você insere no corpo do json um id já existente.

2- depois atualiza os dados abaixo do id.

---

### **5. DeleteById:**

- **Descrição:** Deleta um usuário do banco em memória.
- **Requisição:** Delete
- **Rota de requisição:** /Users
- **Retorno:** caso encontre o id do usuário, retorna um status 200 com o usuário deletado.

## Como instalar e executar o  projeto em sua máquina

### Passo 1: Clonar o repositório em sua máquina

```
git clone https://github.com/EricSouzaDosSantos/API-CRUD-Users.git
```
### Passo 2: Abrir o projeto com alguma IDE da sua preferência
 
Para esse projeto eu recomendo que utilize o visual studio code ou o intelliJ IDEA

##### Exemplo com intelliJ

- Depois de executar o comando git clone, esse comando vai criar uma pasta no local em que você estava no terminal.
- O projeto se encontra em uma pasta chamada "Rest-API" gerada pelo git clone.
- Abra o projeto pelo IntelliJ. 
- Execute a classe CrudApplication.
- acesse no seu navegador a url da api com a porta correspondente.
- Pronto sua API já está em funcionamento.

#### Testando os métodos HTTP's com a interface do swagger-ui

- em sua api acesse o Url dela na porta correspondente.
- caso sua api esteja na porta 8080 acesse: localhost:8080/swagger-ui.html.
- isso abrirá a interface do swagger-ui e você poderá executar os métodos por lá tranquilamente.

---

## Contribuição

Este é um projeto de código aberto, então sinta-se à vontade para contribuir com sugestões, correções de bugs ou até mesmo novas funcionalidades. Todas as contribuições são bem-vindas!

## Licença

Este projeto está licenciado sob a Licença MIT. Para mais detalhes, consulte o arquivo [LICENSE](LICENSE).

---