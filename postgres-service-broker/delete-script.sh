#!/usr/bin/env bash
cf login -a api.local.pcfdev.io -u admin -p admin -o system -s system --skip-ssl-validation
cf disable-service-access PostgreSQL
cf delete-service-broker PostgreSQL -f
cf delete postgresql-cf-service-broker -f
cf purge-service-offering PostgreSQL
cf logout
