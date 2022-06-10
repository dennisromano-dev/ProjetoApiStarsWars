# ProjetoApiStarsWars

Projeto:

Utilizando a API Star Wars (https://swapi.dev/), 
•	Ao subir a aplicação, deverá ser carregado em memória a lista de filmes;
•	Criar um endpoint onde é possível alterar a descrição de um filme em memória;
•	Criar um endpoint onde é possível listar os filmes da saga;
•	Criar um endpoint onde é possível exibir detalhes de um filme;
•	Criar um endpoint onde é possível detalhar um filme especifico;
•	Criar um mecanismo de controle de alteração onde toda vez que uma descrição é alterada, o campo versão do filme deve ser alterado de forma incremental;
•	A versão do filme deve retornar junto com a lista do filme;


Pré Requisitos

Gradle 2.7.0
Java 11
Spring boot

====================================================

Dependencias: 

Spring boot dev tools
Lombok
Spring Web
OpenFeign

====================================================

Porta para startar Api

Port 8081 - definida em application.yml

====================================================

HTTP: 

Acessando a api

http://localhost:8081/api/movies = tras todos os filmes da saga 
http://localhost:8081/api/movies/title/nome do filme = busca por nome do filme e tras todas as informações relevantes como descrição, data,
data da criação, nome do autor, produtor, id dentre outros. 




