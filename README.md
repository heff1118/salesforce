# salesforce
This application was generated using JHipster 4.14.4, you can find documentation and help at [http://www.jhipster.tech/documentation-archive/v4.14.4](http://www.jhipster.tech/documentation-archive/v4.14.4).

This is a "microservice" application intended to be part of a microservice architecture, please refer to the [Doing microservices with JHipster][] page of the documentation for more information.

This application is configured for Service Discovery and Configuration with . On launch, it will refuse to start if it is not able to connect to .

## Development

To start your application in the dev profile, simply run:

    ./mvnw


For further instructions on how to develop with JHipster, have a look at [Using JHipster in development][].



## Building for production

To optimize the salesforce application for production, run:

    ./mvnw -Pprod clean package

To ensure everything worked, run:

    java -jar target/*.war


Refer to [Using JHipster in production][] for more details.

## Testing

To launch your application's tests, run:

    ./mvnw clean test


Swagger Docs [Swagger UI]

[Swagger UI]: http://localhost:8082/swagger-ui.html
[Setting up Continuous Integration]: http://www.jhipster.tech/documentation-archive/v4.14.4/setting-up-ci/


