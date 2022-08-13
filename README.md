# Storing Bearer Token in Spring

Learn how you can retrieve and store a bearer token before passing through the REST endpoint.

Store the token so that you can use it later, if you want to call another secured service.

Blog: https://www.czetsuyatech.com/2021/04/spring-rest-bearer-token.html

##  Installation and Deployment

For this exercise, we won't be needing an authentication/authorization server like Keycloak. We will just use a 
random string as the bearer token.

Run the application

```
mvn spring-boot:run
```

## Testing

1. Download and install Postman.
2. Create a new GET request with URL http://localhost:8080/books.
3. Under the Authorization tab, set the Token value. It could be any string for this demo.
4. Under the Headers tab, you should be able to see an entry with Key=Authorization and Value=Bearer xxx.
5. Send the request and you should be able to see a log, token=xxx. 
