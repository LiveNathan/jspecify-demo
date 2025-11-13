# Project Overview

This is a Spring Boot project that demonstrates how to use JSpecify with Error Prone and NullAway to perform
compile-time null-safety checking.

The project is configured to use JSpecify's `@NullMarked` annotation at the package level, which means that all types
within the `dev.nathanlively.jspecify_demo` package are considered non-null by default. This helps to prevent
`NullPointerException`s by enforcing null-safety at compile time.

## Building and Running

The project uses the Maven wrapper (`mvnw`) for building and running.

**To build the project:**

```bash
./mvnw clean install
```

This command will compile the code, run the tests, and package the application into a JAR file. The build process is
configured to use the Error Prone compiler with the NullAway plugin to enforce null-safety.

**To run the application:**

```bash
./mvnw spring-boot:run
```

## Development Conventions

### Null-Safety

The project enforces null-safety using JSpecify, Error Prone, and NullAway.

* The `@NullMarked` annotation on the `dev.nathanlively.jspecify_demo` package sets the default to non-null for all
  types in the package.
* Any type that can be null must be explicitly annotated with `@Nullable`.
* The build will fail if there are any violations of the null-safety rules.

### Testing

The project uses JUnit 5 for testing. Tests are located in the `src/test/java` directory.
