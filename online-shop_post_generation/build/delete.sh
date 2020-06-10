#!/usr/bin/env bash
cd "../mariadb" && kubectl delete -f mariadb-deployment.yaml
cd "../mongo" && kubectl delete -f mongo-deployment.yaml
cd "../eureka" && kubectl delete -f eureka-deployment.yaml
cd "../itemservice" && kubectl delete -f itemservice-deployment.yaml
cd "../zuul" && kubectl delete -f zuul-deployment.yaml
cd "../customerservice" && kubectl delete -f customerservice-deployment.yaml
cd "../orderservice" && kubectl delete -f orderservice-deployment.yaml