package com.college.College_Batch.RestController;

import com.college.College_Batch.Entity.Student_Batch;
import com.college.College_Batch.Service.College_Batch_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class College_Batch_RestController {

    private College_Batch_Service collegeService;

    @Autowired

    public College_Batch_RestController(College_Batch_Service theCollegeService) {
        this.collegeService = theCollegeService;
    }

    @GetMapping("/students")
    public List<Student_Batch> findAll(){
        return collegeService.findAll();
    }

    @GetMapping("/students/{Roll_no}")
    public Student_Batch getStudents (@PathVariable int Roll_no){

        Student_Batch theStudents = collegeService.findById(Roll_no);

        if(theStudents == null){
            throw new RuntimeException("Roll_no not found: "+Roll_no+" ");
        }

        return theStudents;
    }

    @PostMapping("/students")
    public Student_Batch addStudents(@RequestBody Student_Batch thestudents){

        thestudents.setRoll_no(0);

        Student_Batch addStudent = collegeService.save(thestudents);

        return addStudent;
    }

    @PutMapping("/students")
    public Student_Batch updateStudents (@RequestBody Student_Batch thestudents){

        Student_Batch upStudent = collegeService.save(thestudents);

        return upStudent;
    }

    @DeleteMapping("/students/{Roll_no}")
    public String deleteStudents (@PathVariable int Roll_no){

        Student_Batch dStudents = collegeService.findById(Roll_no);

        if(dStudents == null){
            throw new RuntimeException("Roll_no not found"+Roll_no);
        }

        collegeService.deleteById(Roll_no);

        return "Deleted Student Id :"+Roll_no;
    }
}
