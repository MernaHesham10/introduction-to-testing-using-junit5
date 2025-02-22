# Introduction to Testing Using JUnit5

Welcome to the **Introduction to Testing Using JUnit5** repository 🚀
This repository contains materials for a workshop focused on unit testing using JUnit5 in Java prgramming language.

## Repository Contents
- **Sample Code**: Includes examples of test cases, assertions, and mocking with Mockito
- **Best Practices Guide**: Tips for writing efficient and maintainable tests

## Setting Up the Project
1. Clone the repository:
   ```sh
   git clone https://github.com/MernaHesham10/introduction-to-testing-using-junit5.git
   ```
2. Open the project in IntelliJ IDEA or your preferred IDE.
3. Ensure JUnit5 dependencies are included in `pom.xml`:
    ```xml
   <dependencies>
       <!-- JUnit 5 -->
       <dependency>
           <groupId>org.junit.jupiter</groupId>
           <artifactId>junit-jupiter</artifactId>
           <version>5.9.2</version>
           <scope>test</scope>
       </dependency>

       <!-- JUnit Platform Suite (Required for Test Suites) -->
       <dependency>
           <groupId>org.junit.platform</groupId>
           <artifactId>junit-platform-suite</artifactId>
           <version>1.9.2</version>
           <scope>test</scope>
       </dependency>

       <!-- AssertJ -->
       <dependency>
           <groupId>org.assertj</groupId>
           <artifactId>assertj-core</artifactId>
           <version>3.24.2</version>
           <scope>test</scope>
       </dependency>

       <!-- Mockito -->
       <dependency>
           <groupId>org.mockito</groupId>
           <artifactId>mockito-core</artifactId>
           <version>5.2.0</version>
           <scope>test</scope>
       </dependency>

       <!-- WireMock -->
       <dependency>
           <groupId>com.github.tomakehurst</groupId>
           <artifactId>wiremock-jre8</artifactId>
           <version>2.35.0</version>
           <scope>test</scope>
       </dependency>

       <!-- Hamcrest -->
       <dependency>
           <groupId>org.hamcrest</groupId>
           <artifactId>hamcrest</artifactId>
           <version>2.2</version>
           <scope>test</scope>
       </dependency>
   </dependencies>
   ```
4. Run the tests:
   - Right-click on a test class → Select **Run**
   - Or execute from terminal: `mvn test`

## Key Topics Covered
- Writing and Running Unit Tests
- Assertions in JUnit5
- Annotations in JUnit5
- Parameterized Tests
- Exception Testing
- Dynamic Tests
- Test Suites
- Mocking with Mockito
- Best Practices for Unit Testing
- Introduction to Test-Driven Development (TDD)




<!--## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
-->

