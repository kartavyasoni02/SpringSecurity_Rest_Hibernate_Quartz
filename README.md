# SpringSecurity_Rest_Hibernate_Quartz
INTRODUCTION
------------

•	This is a brief overview of the Spring Security, Quartz scheduler and Hibernate with Angular JS accelerator that is included with a complete architecture of accelerator. I have created login page using MVC pattern of Angular JS. I have used Spring Security for user authentication and authorization. In this application we can configure new dynaplan and view dynaplan graph.

INSTALLATION
------------
	SOFTWARE LIST.
 
		1) JDK 1.8
		2) Maven 3.0
		
CONFIGURATION
-------------
Open application.properties file and do below configuration.

	database properties:- Add database credentials and URL in this property.
	database script:- first ks.sql run in mysql cmd then run default_quartz.sql
     security properties:- Change database query and rest API path in this property.
     view resolver :- Add your views path in this property.
     response message :- You can configure all reponse messages in this property.


DEPLOYMENT
---------------

Change logging file path in log4j properties.
	<Property name="log-path">G:\application_log\sping_boot</Property>


REST SERVICES
-------------

http://localhost:8080/ks/checkLogin
http://localhost:8080/ks/accessDenied
http://localhost:8080/ks/admin
http://localhost:8080/ks/user
http://localhost:8080/ks/principal

## Run Command Line
-------------------
1 Go to Project folder and build project : mvn -e clean package install
2 Start server
3 Go to browser and hit URL : http://localhost:8080/KS
4 when you configure Dyna plan, Please first add plan.

To configure dyna plan visit:
http://localhost:8080/#/configuredynaplan

then for configuration of jobs visit:
http://localhost:8080/#/configure

MAINTAINERS
-----------
Kartavya Soni(kartavya.soni02@gmail.com)