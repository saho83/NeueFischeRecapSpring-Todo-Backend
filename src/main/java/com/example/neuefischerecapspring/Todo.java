package com.example.neuefischerecapspring;


import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
public class Todo{

    String id;
    String description;
    String status;

}
