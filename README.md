### Documentação dos Métodos

Este arquivo README documenta os métodos implementados na classe `UsersController`.

**Classe:** UsersController

**Pacote:** com.user.crud.controller

**Objetivo:** Gerenciar operações CRUD para usuários.

### Métodos:

**1. GetAllUsers:**

- **Descrição:** Recupera todos os usuários do repositório.
- **Requisição:** GET /Users
- **Retorno:** Lista de objetos `Users`.

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
