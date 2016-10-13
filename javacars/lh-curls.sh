#!/usr/bin/env bash
curl -X POST -H "Content-Type: application/json" -d '{"name":"AUDI"}' http://localhost:8080/manufacturers
curl -X POST -H "Content-Type: application/json" -d '{"name":"BMW"}' http://localhost:8080/manufacturers
curl -X POST -H "Content-Type: application/json" -d '{"name":"MERCEDES"}' http://localhost:8080/manufacturers
curl -X GET http://localhost:8080/manufacturers
#curl -X DELETE http://localhost:8080/manufacturers/1
#curl -X DELETE http://localhost:8080/manufacturers/2
#curl -X DELETE http://localhost:8080/manufacturers/3
