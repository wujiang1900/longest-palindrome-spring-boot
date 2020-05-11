# longest-palindromic-substring-spring-boot
Spring boot app for computing the longest palindromic substring in a string.

The endpoint is  GET: /palin/{inputstring}

### Getting Started
build the JAR file
```shell
$ ./mvnw clean package
```

### Getting Started
build the JAR file
```shell
$ ./mvnw clean package
```

then run the JAR file, as follows:
```shell
java -jar target/longest-palindrome-0.0.1-SNAPSHOT.jar 
```

### Running tests

```shell
$ ./mvnw test
```
You can also manually test the endpoint using an API test client, as shown in /postman-test-run.png.

### Design/Implementation notes:

1. Input string is passed as path parameter in API endpoint because it is a required parameter.
2. Use interface of PalindromeService so that we can easily swap implementation in the future (STRATEGY design pattern).
3. Comprehensive junit/mockito tests have been developed to ensure code quality and facilitate future enhancement/maintenance.

### Assumptions:
1. If input string is null or empty, return empty string.


  