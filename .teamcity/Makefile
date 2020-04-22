default: tools

tools:
	mvn -U dependency:sources

test: validate
	mvn test

validate:
	mvn teamcity-configs:generate
