# Spring boot unauthorized response with XMLHttpRequest

This is a simple demonstration of issue with XMLHttpRequest header. Details are [here](https://stackoverflow.com/questions/48262900/spring-boot-unauthorized-response-with-xmlhttprequest)

Try to run this project and access to endpoint _http://localhost:8090/currency?id=KRB_ with wrong password. 
 
 You will receive an error message:

```json
{
    "timestamp": 1516089712057,
    "status": 401,
    "error": "Unauthorized",
    "message": "A granted authority textual representation is required",
    "path": "/currency"
}
```


But if you add the header XMLHttpRequest to request, you will not receive any response body messages:


