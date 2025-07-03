package org.kk.library_management.request;

import lombok.Builder;
import lombok.Data;
import org.kk.library_management.model.StudentType;

@Data
@Builder
public class CreateStudentRequest {
    String studentId;
    String name;
    String email;
    String phoneNo;
    StudentType studentType;
}
