package com.college.College_Batch.DAO;

import com.college.College_Batch.Entity.Student_Batch;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class College_Batch_DAO_Impementation implements College_Batch_DAO{

    private EntityManager entityManager;

    @Autowired
    public College_Batch_DAO_Impementation(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Student_Batch> findAll() {

        TypedQuery<Student_Batch> theQuery = entityManager.createQuery("from Student_Batch", Student_Batch.class);

        List<Student_Batch>  students = theQuery.getResultList();

        return students;
    }

    @Override
    public Student_Batch findById(int theId) {

        Student_Batch theStudents = entityManager.find(Student_Batch.class, theId);

        return theStudents;
    }

    @Override
    public Student_Batch save(Student_Batch theStudent) {

        Student_Batch dbStudents = entityManager.merge(theStudent);

        return dbStudents;
    }

    @Override
    public void deleteById(int theId) {

        Student_Batch theStudents = entityManager.find(Student_Batch.class, theId);

        entityManager.remove(theStudents);
    }
}
