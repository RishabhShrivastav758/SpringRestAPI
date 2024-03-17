package com.college.College_Batch.Service;

import com.college.College_Batch.DAO.College_Batch_DAO;
import com.college.College_Batch.Entity.Student_Batch;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class College_Batch_Service_Implementation implements College_Batch_Service {

    private College_Batch_DAO collegeDao;

    @Autowired
    public College_Batch_Service_Implementation(College_Batch_DAO collegeDao) {
        this.collegeDao = collegeDao;
    }

    @Override
    public List<Student_Batch> findAll() {
        return collegeDao.findAll();
    }

    @Transactional
    @Override
    public Student_Batch findById(int theId) {
        return collegeDao.findById(theId);
    }

    @Transactional
    @Override
    public Student_Batch save(Student_Batch theStudent) {
        return collegeDao.save(theStudent);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
        collegeDao.deleteById(theId);
    }
}
