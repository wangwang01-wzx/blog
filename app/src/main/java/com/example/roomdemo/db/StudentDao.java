package com.example.roomdemo.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.roomdemo.entity.Student;

import java.util.List;


@Dao
public interface StudentDao {
    //增加
    @Insert
    void insertStudent(Student student);
    //删除
    @Delete
    void deleteStudent(Student student);
    //更新
    @Update
    void updateStudent(Student student);
    //查询
    @Query("SELECT * FROM student")
    List<Student> getStudentList();

    @Query("SELECT * FROM student WHERE id = :id")
    Student getStudentById(int id);
}
