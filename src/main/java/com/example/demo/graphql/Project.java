package com.example.demo.graphql;

public record Project(String slug, String name, String repositoryUrl, ProjectStatus status) {
}
