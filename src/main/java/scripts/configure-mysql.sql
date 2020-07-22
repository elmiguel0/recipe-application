## Use to run mysql db docker image, optional if you're not using a local mysqldb
# docker run --name mysqldb -p 3306:3306 -e MYSQL_ALLOW_EMPTY_PASSWORD=yes -d mysql

# connect to mysql and run as root user
#Create Databases
CREATE DATABASE mr_dev;
CREATE DATABASE mr_prod;

#Create database service accounts
CREATE USER 'mr_dev_user'@'localhost' IDENTIFIED BY 'migue';
CREATE USER 'mr_prod_user'@'localhost' IDENTIFIED BY 'migue';
CREATE USER 'mr_dev_user'@'%' IDENTIFIED BY 'migue';
CREATE USER 'mr_prod_user'@'%' IDENTIFIED BY 'migue';

#Database grants
GRANT SELECT ON mr_dev.* to 'mr_dev_user'@'localhost';
GRANT INSERT ON mr_dev.* to 'mr_dev_user'@'localhost';
GRANT DELETE ON mr_dev.* to 'mr_dev_user'@'localhost';
GRANT UPDATE ON mr_dev.* to 'mr_dev_user'@'localhost';
GRANT SELECT ON mr_prod.* to 'mr_prod_user'@'localhost';
GRANT INSERT ON mr_prod.* to 'mr_prod_user'@'localhost';
GRANT DELETE ON mr_prod.* to 'mr_prod_user'@'localhost';
GRANT UPDATE ON mr_prod.* to 'mr_prod_user'@'localhost';
GRANT SELECT ON mr_dev.* to 'mr_dev_user'@'%';
GRANT INSERT ON mr_dev.* to 'mr_dev_user'@'%';
GRANT DELETE ON mr_dev.* to 'mr_dev_user'@'%';
GRANT UPDATE ON mr_dev.* to 'mr_dev_user'@'%';
GRANT SELECT ON mr_prod.* to 'mr_prod_user'@'%';
GRANT INSERT ON mr_prod.* to 'mr_prod_user'@'%';
GRANT DELETE ON mr_prod.* to 'mr_prod_user'@'%';
GRANT UPDATE ON mr_prod.* to 'mr_prod_user'@'%';