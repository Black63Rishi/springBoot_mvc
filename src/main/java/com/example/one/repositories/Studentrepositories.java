package com.example.one.repositories;

import com.example.one.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Studentrepositories extends JpaRepository<Student,Integer> {

}
