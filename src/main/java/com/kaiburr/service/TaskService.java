package com.kaiburr.service;

import com.kaiburr.model.Task;
import com.kaiburr.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    public Task addTask(Task task) {
        return repository.save(task);
    }

    public List<Task> findAllTasks() {
        return repository.findAll();
    }

    public Task getTaskById(String id){
        return repository.findById(id).get();
    }

    public Task updateTask(Task taskRequest){
        Task existingTask = repository.findById(taskRequest.getId()).get();
        existingTask.setName(taskRequest.getName());
        existingTask.setLanguage(taskRequest.getLanguage());
        existingTask.setFramework(taskRequest.getFramework());
        return repository.save(existingTask);
    }

    public String deleteTask(String taskId){
        repository.deleteById(taskId);
        return taskId+" task deleted from dashboard ";
    }
}
