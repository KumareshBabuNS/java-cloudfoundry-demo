#!/usr/bin/env bash
curl -X POST -H "Content-Type: application/json" -d '{"name":"AUDI"}' http://javacars.local.pcfdev.io/manufacturers
curl -X POST -H "Content-Type: application/json" -d '{"name":"BMW"}' http://javacars.local.pcfdev.io/manufacturers
curl -X POST -H "Content-Type: application/json" -d '{"name":"MERCEDES"}' http://javacars.local.pcfdev.io/manufacturers
curl -X GET http://javacars.local.pcfdev.io/manufacturers
curl -X DELETE http://javacars.local.pcfdev.io/manufacturers/1
curl -X DELETE http://javacars.local.pcfdev.io/manufacturers/2
curl -X DELETE http://javacars.local.pcfdev.io/manufacturers/3