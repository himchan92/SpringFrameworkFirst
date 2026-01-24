package com.example.webapp.service;

import com.example.webapp.entity.ToDo;

import java.util.List;

public interface ToDoService {

    List<ToDo> findAllToDo(); //모든 할일 조회

    ToDo findByIdToDo(Integer id); //id 할일 조회

    void insertToDo(ToDo toDo); //할일 등록

    void updateToDo(ToDo toDo); //할일 갱신

    void deleteToDo(Integer id); //특정 ID의 할일 삭제
}
