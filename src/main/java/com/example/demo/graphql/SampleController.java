package com.example.demo.graphql;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class SampleController {

    @QueryMapping
    public String greeting(@Argument String name) {
        return "Hello " + name + "!";
    }

    @QueryMapping
    public Project project(@Argument String slug) {
        return new Project(slug, "asdf", "sadf", ProjectStatus.ACTIVE);
    }
}
