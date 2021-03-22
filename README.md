# Feature Toggles with Java, Spring Boot, and Unleash

This is an example project that through different practical use cases of feature toggling, and shows how to configure Unleash (a feature toggle service) with Java and Spring Boot.

[Read the complete guide (for free) at The Practical Developer's website](https://thepracticaldeveloper.com/practical-guide-feature-toggles-spring-boot/).

## Requirements

You need:

* JDK 16+
* A Unleash client's secret key ([request a trial](https://www.unleash-hosted.com/order/team/) or [use the demo instance](https://docs.getunleash.io/docs/user_guide/connect_sdk#demo-instance-secrets)).

Alternatively, you can use your own server instance of Unleash. Check the [documentation](https://docs.getunleash.io/) for the complete details.

## Running the app

The easiest option is via the command line and using the Maven wrapper included in the project:

```shell
$ ./mvnw spring-boot:run -Dspring-boot.run.arguments="--unleash.clientSecret=your-client-secret"
```

Check the [blog post](https://thepracticaldeveloper.com/practical-guide-feature-toggles-spring-boot/) for all the details.

## Questions?

Feel free to create an issue in this repository or add a comment to the [blog post](https://thepracticaldeveloper.com/practical-guide-feature-toggles-spring-boot/).
