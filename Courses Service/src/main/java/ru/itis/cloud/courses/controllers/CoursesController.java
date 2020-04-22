package ru.itis.cloud.courses.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.cloud.courses.dto.Course;

import java.util.Arrays;
import java.util.List;

@RestController
@Slf4j
public class CoursesController {
    @GetMapping("/courses")
    public List<Course> getCourses() {
        log.info("Get request");
        return Arrays.asList(
                Course.builder()
                        .id(1L)
                        .title("Java")
                        .type("COURSES")
                        .build(),
                Course.builder()
                        .id(2L)
                        .title("Python")
                        .type("COURSES")
                        .build(),
                Course.builder().
                        id(3L)
                        .title("PHP")
                        .type("COURSES")
                        .build());
    }
}
