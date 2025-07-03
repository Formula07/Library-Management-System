package org.kk.library_management.service;

import org.kk.library_management.model.Student;
import org.kk.library_management.model.StudentType;
import org.kk.library_management.repository.StudentDao;
import org.kk.library_management.request.CreateStudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentDao studentDao;

    public Student createStudent(CreateStudentRequest request){

        String id = request.getStudentId();
        String type = request.getStudentType().toString();
        String name = request.getName();
        String email = request.getEmail();
        String phone = request.getPhoneNo();

        Student student = Student.builder().studentId(Integer.parseInt(id)).studentType(StudentType.valueOf(type))
                .email(email).name(name).phoneNo(phone).build();

        int result=studentDao.createStudentInDatabase(student);
        if(result>0){
            System.out.println("Data has been Inserted Successfully");
            return student;
        }
        return null;
    }
}
