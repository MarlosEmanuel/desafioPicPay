# Desafio PicPay em Java

## urls para test

- / : Retorna todos os usuarios da API.
- /{id}: retorna o usuario correspondente ao ID informado.
- POST no /: cria um novo usuario de acordo com o exemplo abaixo:

{
  "username": "johndoe",
  "cpf": "123.456.789-00",
  "email": "johndoe@example.com",
  "password": "securePassword123",
  "shopkeeper": true,
  "balance": 1500.75
}

- PUT no /{id}: edita o usuario correspondente a aquele id, se houver um usuario com o id informado.
- DELETE no /{id}: deleta o usuario correspondente ao id informado.
- Transferir dinheiro /transfer metodo POST de acordo com o exemplo abaixo:

{
  "senderId": 123456,
  "recipientId": 654321,
  "value": 250.75
}
