#!/usr/bin/env bash
cf login -a api.local.pcfdev.io -u admin -p admin -o system -s system --skip-ssl-validation
cf push
cf create-service-broker PostgreSQL user password http://postgresql-cf-service-broker.local.pcfdev.io
cf enable-service-access PostgreSQL -p "Basic PostgreSQL Plan"
cf logout
cf login -a api.local.pcfdev.io -u user -p pass --skip-ssl-validation
cf create-service PostgreSQL "Basic PostgreSQL Plan" postgres
cf bind-service javacars postgres
