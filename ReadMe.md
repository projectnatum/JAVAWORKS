Pre-requisite
---

### Download and Install mysql

**Download:**    
www.mysql.com > downloads > windows > MySQl Installer > MySQL Server > go to extreme bottom > download the one with less size (228.9M for ex)

**Installation:**  

**step 1**    Generate temp password. Go to bin directory and execute following command.  
  ``mysqld --initialize --console`` 

**step 2** start mysql console (on another cmd window). On same bin directory, execute following command.  

  ``mysqld --console``

**step 3** login to root user ``mysql -u root -p``  
``password:`` enter temporary password, generated on previous step 1.

**step 4** change password

``ALTER USER 'root'@'localhost' IDENTIFIED BY 'qot';``

**step 5** create table  
 ``create user 'qotLocal'@'localhost' identified by 'Qot2017';``

**step 6** grant previlages  
``GRANT ALL PRIVILEGES ON *.* TO 'qotLocal'@'localhost' identified by 'Qot2017';``

##### Basic commands: https://gist.github.com/hofmannsven/9164408
##### To run mysql:  
- Run ``mysqld --console`` in one command line (be on bin folder)
- Run ``mysql -u <username> -p`` in another command line (be on bin folder)

### Adding beadConfig class.

- You need to add beanConfig file in order to make Hibernate's Session Factory work.
- Refer to the below link for more info.  
http://www.devglan.com/spring-boot/spring-boot-hibernate-5-example

### Sample request body

    curl -X POST \
      http://localhost:8080/natum/customers/create \
      -H 'Accept: */*' \
      -H 'Cache-Control: no-cache' \
      -H 'Connection: keep-alive' \
      -H 'Content-Type: application/json' \
      -H 'Host: localhost:8080' \
      -H 'Postman-Token: 04e7b175-e401-4a94-b5d5-ba5b17d90c13,9084d962-5e4d-47f7-bdc7-e0256edfd1be' \
      -H 'User-Agent: PostmanRuntime/7.11.0' \
      -H 'accept-encoding: gzip, deflate' \
      -H 'cache-control: no-cache' \
      -H 'content-length: 276' \
      -d '{
      "custId": 123,
      "custFirstName": "naga",
      "custLastName": "vadlapudi",
      "custSSN": "430493",
      "custEmail": "naga@gmail.com",
      "custDOB": "1990-03-09",
      "custZip": "32232",
      "passwords": {
        "custPassword": "something",
        "custConfirmPassword": "something"
      }
    }'
