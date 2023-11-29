package com.example.neuefischerecapspring;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public interface TodoService {

    List<Todo> getAllTodos();


    Todo getTodosById(String id);

    void addTodo(Todo todo);



    void updateTodo(Todo updatedTodo);

    void deleteTodo(String id);



}
