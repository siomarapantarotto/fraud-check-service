# fraud-check-service

## First Microservice - Customer

Handles customer registration.

![customer-module](https://user-images.githubusercontent.com/5893219/173223771-c24ca9c2-fc85-46d0-bbd8-b27fc9be72a2.png)

br.com.siomara.customer:

1. Customer
2. CustomerApplication
3. CustomerController
4. CustomerRegistrationRequest
5. CustomerRepository
6. CustomerService

**Creating table 'customer' with Hibernate:**

    create table customer (
       id int4 not null,
        email varchar(255),
        first_name varchar(255),
        last_name varchar(255),
        primary key (id)
    )
Hibernate: create sequence customer_id_sequence start 1 increment 50

**Adding new customer with Postman:**

localhost:8080/api/vi/customers

post - body - raw - json

{
"firstName": "Siomara",
"lastName": "Pantarotto",
"email": "siomarapantarotto@gmail.com"
}

status: 200 OK

**Checking customer insertion on Postgres:**

select * from customer

Successfully run. Total query runtime: 236 msec.
1 rows affected.

## Second Microservice

Verifies if customer has a fraud record.