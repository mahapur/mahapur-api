#Mahapur-Api

## Backend for http://mahapur.in <br/>

### <a name="howto"></a>Local Setup

*Step 1. Build project locally

```./gradlew clean build```

*Step 2. DB setup*

```xml 
    Install postgres
    psql -h localhost -U postgres -c "CREATE DATABASE spenddb;" postgres
```

*Step 3. Run Application on terminal*
```xml
    java -Dspring.profiles.active=local -jar build/libs/Mahapur-*-SNAPSHOT.jar
```

*Step 4. Run Application on IDE*
```xml
    Add jvm parameter as -Dspring.profiles.active=local
    Run Main method
```

## Contributing

If have any doubts or found bug create issue on github repo.
* [Write an issue.](https://github.com/mahapur/mahapur-api/issues/new)
You can contribute by creating pull request.
* Create a pull request. (See [Understanding the GitHub Flow](https://guides.github.com/introduction/flow/index.html)
