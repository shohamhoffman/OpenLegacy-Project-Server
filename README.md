# OpenLegacy Project - Server

## h2 database

For accessing h2 database, navigate to- `http://localhost:8080/h2-console`.</br>
In case that- `JDBC URL:` is not- `jdbc:h2:mem:test`, just change it. 

## Swagger

For accessing swagger, navigate to- `http://localhost:8080/swagger-ui.html`.

## Running with Docker

SERVER-</br>
`docker pull shohamhoffmanhaik/openlegacy-project:openlegacy-server-docker`</br>
`docker run --rm -d -p 8080:8080 shohamhoffmanhaik/openlegacy-project:openlegacy-server-docker`</br>
Navigate to- `http://localhost:8080/`.

CLIENT-</br>
`docker pull shohamhoffmanhaik/openlegacy-project:openlegacy-client-docker`</br>
`docker run --rm -d -p 4200:4200 shohamhoffmanhaik/openlegacy-project:openlegacy-client-docker`</br>
Navigate to- `http://localhost:4200/`.

## IMPORTANT

If you are using Docker Toolbox, please follow the instruction on:</br>
`https://www.jhipster.tech/tips/020_tip_using_docker_containers_as_localhost_on_mac_and_windows.html`</br></br>
Or you can just download the code and run it locally.
