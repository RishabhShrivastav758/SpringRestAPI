package com.college.College_Batch.Service;

import com.college.College_Batch.Entity.Student_Batch;
import java.util.List;

public interface College_Batch_Service {

    List<Student_Batch> findAll();

    Student_Batch findById (int theId);

    Student_Batch save(Student_Batch theStudent);

    void deleteById(int theId);

}
