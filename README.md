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
- [Normal login](https://taigaio.github.io/taiga-doc/dist/api.html#auth-normal-login)
- [Get Projects by Slug](https://taigaio.github.io/taiga-doc/dist/api.html#projects-get-by-slug)
- [Create Issue](https://taigaio.github.io/taiga-doc/dist/api.html#issues-create)

## Build

```
gradlew clean build
```

## Import in Eclipse

```
gradlew cleanEclipse eclipse
```
## Configuration
The following attributes can be configured over your application.yml. Before every attribute you have to set the prefix `taiga`

|Name|Description|Default|Required|
|----|-----------|-------|--------|
|host | URL to your taiga.io Instance | https://api.taiga.io | false |
|basepath| Path of the restendpoints | /api/v1 | false |
|username| Name of the API-User|null| true |
|password| Password of the API-User|null| true |
|projectid| ID of your Project|null| false (if a projectslug is set) |
|projectslug| Name of the API-User|null| false (if a projectid is set. If both are set the projectslug will be ignored) |

###  Example 

```
taiga:
  username: test
  password: test
  projectid: 1
  projectslug: bla
  host: https://test.com
```

### Enable more logging

Set your log lvl `logging.level.de.mehtrick.boreal.endpoints` to `debug` to see the request and response objects