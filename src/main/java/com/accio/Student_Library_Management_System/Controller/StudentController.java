package com.accio.Student_Library_Management_System.Controller;

import com.accio.Student_Library_Management_System.DTOs.StudentUpdateMobRequestDto;
import com.accio.Student_Library_Management_System.Models.Student;
import com.accio.Student_Library_Management_System.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String createStudent(@RequestBody Student student){

       try{
           return studentService.createStudent(student);
       }catch (Exception e){
           return "exception found";
       }
    }


    @GetMapping("/get_user")
    public String getNameByEmail(@RequestParam("email")String email){

       try{
           return studentService.findNameByEmail(email);
       }
       catch (Exception e){
           return "exception found";
       }
    }


    @PutMapping("/update_mob")
    public String updateMob(@RequestBody StudentUpdateMobRequestDto studentReqDto){
       try{
           return studentService.updateMobNo(studentReqDto);
       }
       catch (Exception e){
           return "exception found";
       }
    }

}
