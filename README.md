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

# Kaiburr task 3: Kubernetes.

## Task: Kubernetes.

Use the application that you created in task #1 or task #2. Create dockerfiles and build docker images. Create kubernetes yaml manifests for the application (at least a deployment and a service). It’s ok to expose the application with a LoadBalancer or NodePort service or with an ingress. Spin up a single-node local Kubernetes cluster (Docker Desktop, Kind or Minikube) or use a managed cluster like EKS, AKS, GKE etc. Deploy MongoDB to the cluster (it’s ok to use a community helm chart for this, any other approach is fine as well). Then deploy the application to the cluster by applying your manifests. The following requirements should be fulfilled:
- you can bring your application up by applying your yaml manifests
- mongodb is running in a separate pod
- the application should take mongo connection details from the environment variables
- the app endpoints should be available from your host machine
- a persistent volume should be used to store the MongoDB data. I.e., when you delete the MongoDB pod the records in the db should not disappear.

## Solution Task 3:

Implemented the Dockerfile corresponding to java server setup:

Files:
 - Dockerfile
 - docker-compose.yml

Docker Output:
- Docker Build
![image](https://user-images.githubusercontent.com/64153988/235297013-8a8cb655-5f85-4860-b91f-0d5ff2c79601.png)

- Docker Images
![image](https://user-images.githubusercontent.com/64153988/235297178-587b74b7-b4bb-4c32-8a3e-5efc8b4e5857.png)

- Docker run
![image](https://user-images.githubusercontent.com/64153988/235297534-386b0aae-9054-4a9d-9b32-dbc2ff74b881.png)
