** POC on Pact jvm **

1. Create Pact contracts between Consumer and Producer.
2. Create Consumer side Pact tests.
3. Run the tests using `mvn test`, this will create the pact files in the directory defined in the pom.xml.
4. Provide the pact files to the provider, for provider side pact tests execution.
5. To publish pacts to the Pact Broker - 
    a. Update the Pact Broker URL in the POM file.
    b. `mvn pact:publish`