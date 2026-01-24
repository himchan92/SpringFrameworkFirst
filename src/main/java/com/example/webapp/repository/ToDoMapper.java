package com.example.webapp.repository;

import com.example.webapp.entity.ToDo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper //해당 인터페이스 마이바티스 매퍼로 명시
public interface ToDoMapper {

    List<ToDo> selectAll(); //모든 할일 가져오기

    ToDo selectById(@Param("id") Integer id); //ID 해당 할일 가져오기

    void insert(ToDo toDo); //할일 등록

    void update(ToDo toDo); //할일 갱신

    void delete(@Param("id") Integer id); //지정된 ID의 할일 삭제
}
