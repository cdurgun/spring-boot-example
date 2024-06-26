package com.amigoscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/")
    public GreetResponse greet() {

        return new GreetResponse(
                "Hello Record",
                List.of("Java", "Golang", "Javascript"),
                new Person("Alex", 28, 30_000)
                );
    }

    record Person(String name, int age, double savings) {}

    record GreetResponse(String greet,
                         List<String> favProgrammingLanguages,
                         Person person) {}
}

//class GreetResponse2 {
//
//    private final String greet;
//
//    GreetResponse2(String greet) {
//        this.greet = greet;
//    }
//
//    public String getGreet() {
//        return greet;
//    }
//
//    @Override
//    public String toString() {
//        return "GreetResponse2{" +
//                "greet='" + greet + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        GreetResponse2 that = (GreetResponse2) o;
//        return Objects.equals(greet, that.greet);
//    }
//
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(greet);
//    }
//}
