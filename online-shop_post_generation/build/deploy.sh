#!/usr/bin/env bash
cd "../mariadb" && kubectl apply -f mariadb-deployment.yaml
cd "../mongo" && kubectl apply -f mongo-deployment.yaml
cd "../eureka" && kubectl apply -f eureka-deployment.yaml
cd "../itemservice" && kubectl apply -f itemservice-deployment.yaml
cd "../zuul" && kubectl apply -f zuul-deployment.yaml
cd "../customerservice" && kubectl apply -f customerservice-deployment.yaml
cd "../orderservice" && kubectl apply -f orderservice-deployment.yaml