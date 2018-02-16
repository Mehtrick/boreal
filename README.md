# boreal

A Java-Spring Client to interact with Taiga.io's REST-Api

## Why?
I like taiga.io. It is an easy way to manage your products by using scrum-tools and a ticket system.
Rumor has it that programms have bugs. Log files are great for getting the details of the problem but I always struggeld with the notification of it. It would be great if an error would instantly create a ticket, so that I get notified and maybe also see some details about a Problem

## How?
Taiga.io offers a [REST-Api](https://taigaio.github.io/taiga-doc/dist/api.html) which can create Tickets amongst other things.

## What?
I am a Java-Guy. More so I love the Spring-Framework. So I decided to build a REST-Client with Spring which I can integrate into my projects. The first focus should be the Authentications against taiga and creation of new Tickets. Also the Framework should be configurable enough so i can use it in many different projects.

## Implemented APIs
- Normal Authentication
- Get Projects by Slug
- Create Issue
