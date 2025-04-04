10 minute tutorial - https://cucumber.io/docs/guides/10-minute-tutorial

Feature->Step Definition -> AUT

mvn clean test

Specific feature file
Specific tag name

mvn clean test -Dcucumber.features="src/test/resources/login.feature"
			   -Dcucumber.filter.tags="@sanity"


hooks -> https://cucumber.io/docs/cucumber/api/#hooks
