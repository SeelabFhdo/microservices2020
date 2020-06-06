#!/usr/bin/env bash
cd "../eureka" && sh build.sh
cd "../itemservice" && sh build.sh
cd "../zuul" && sh build.sh
cd "../customerservice" && sh build.sh
cd "../orderservice" && sh build.sh
