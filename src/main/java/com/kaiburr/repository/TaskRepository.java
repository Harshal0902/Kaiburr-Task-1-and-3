package com.kaiburr.repository;

import com.kaiburr.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface TaskRepository extends MongoRepository<Task,String> {

    @Query("{ assignee: ?0 }")
    List<Task> getTasksByAssignee(String assignee);

    @Query("{ name: ?0 }")
    List<Task> getTasksByName(String name);

    @Query("{ language: ?0 }")
    List<Task> getTasksByLanguage(String language);

    @Query("{ framework: ?0 }")
    List<Task> getTasksByFramework(String framework);
}
