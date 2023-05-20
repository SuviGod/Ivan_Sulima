# Sulima Ivan WebAPI bascis
## Prerequisites 
- Apache Maven (4.0.0-alpha-4)
- Java 18
- Allure

## Running tests
- Paste your own DropboxAPI access token into src/test/resources/application.properties. About how to get it: https://developers.dropbox.com/oauth-guide
- Execute following command in the terminal opened in the project folder: `mvn test`
## Open allure reports 
- Execute following command in the terminal opened in the project folder: `allure serve allure-results`