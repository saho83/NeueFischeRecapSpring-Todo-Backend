package com.example.neuefischerecapspring;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Data
@Service
public class TodoServiceImpl implements TodoService {

    private List<Todo> todoList = new ArrayList<>();


    @Override
    public List<Todo> getAllTodos() {
        return todoList;
    }

    @Override
    public Todo getTodosById(String id) {

        for (Todo todo : todoList) {
            if (todo.getId().equals(id)) {

                return todo;
            }
        }
        return null;
    }

    @Override
    public void addTodo(Todo todo) {
        todo.setId(UUID.randomUUID().toString());
        todoList.add(todo);
    }


    @Override
    public void updateTodo(Todo updatedTodo) {
        for (Todo todo : todoList) {
            if (todo.getId().equals(updatedTodo.getId())) {
                todo.setDescription(updatedTodo.getDescription());
                todo.setStatus(updatedTodo.getStatus());
                return;
            }
        }

    }

    @Override
    public void deleteTodo(String id) {
        todoList.removeIf(todo -> todo.getId().equals(id));
    }
}
