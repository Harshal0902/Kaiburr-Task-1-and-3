# Kaiburr Task 1: Java REST API example.

## Task: Java REST API example.

Implement an application in java which provides a REST API with endpoints for searching, creating and deleting "server" objects:
- GET servers. Should return all the servers if no parameters are passed. When server id is passed as a parameter - return a single server or 404 if there’s no such a server.
- PUT a server. The server object is passed as a json-encoded message body. Here’s an example:
```json
{
    "name": "my centos",
    "id": "123",
    "language":"java",
    "framework":"django"
}
```
- DELETE a server. The parameter is a server ID.
- GET (find) servers by name. The parameter is a string. Must check if a server name contains this string and return one or more servers found. Return 404 if nothing is found.

"Server" objects should be stored in MongoDB database. Be sure that you can show how your application responds to requests using postman, curl or any other HTTP client.

## Solution Task 1:

I have created the project using Spring Framework and for the backend MongoDB is used. The endpoints for the project are

- `/tasks` (To get all the tasks) 

The Restfull API's which are beign called were tested using postman. And these are:

- POST method: `http://localhost:8080/tasks` (To create a new task)
![image](https://user-images.githubusercontent.com/64153988/235243700-39ea249d-5f42-4b71-a297-8bdbe4fb4ce3.png)
- DELETE method: `http://localhost:8080/tasks/{id}` (To delete a task)
![image](https://user-images.githubusercontent.com/64153988/235244209-f45eb0d8-e1ba-4e30-8761-92e69c0a03a3.png)