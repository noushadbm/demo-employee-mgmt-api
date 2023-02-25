# Demo Employee Management

The whole application consistance of two components, front-end (uses ReactJs) and back-end(uses Java/Spring-boot) and code is mainitaned in two git repos, namely "demo-employee-mgmt-api" and "react-employee-mgmnt".

## Setting up locally

Steps to start/build completet application.

Step 1) Clone repo 'react-employee-mgmnt' and execute command 'npm run build' to build the UI.

Step 2) Clone repo 'demo-employee-mgmt-api' and navigate to folder 'src\main\resources\static'.

Step 3) From UI repo copy content of the folder 'build' to folder mentioned in step 2.

Step 4) Open and edit file 'application.properties' in folder demo-employee-mgmt-api\src\main\resources and update the attribute 'spring.datasource.url' as per local file path (This indicate db file used by H2 in-memory DB).

Step 5) In root folder of 'demo-employee-mgmt-api' open commandline prompt and execute 'mvn spring-boot:run'. This will start the application locally.

Step 6) Now in browser open the link http://localhost:8080/

Step 7) There are two users created, one with username 'admin' and another one 'user' (password for both are 'password')