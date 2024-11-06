package com.example.crud.repository;

import com.example.crud.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // คุณสามารถเพิ่มคำสั่ง query อื่น ๆ ได้ที่นี่หากต้องการ
}
