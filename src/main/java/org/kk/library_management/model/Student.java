package org.kk.library_management.model;

import lombok.Builder;
import lombok.Data;

import java.util.*;

@Data
@Builder
public class Student {
    private int id;
    private int studentId;
    private String name;
    private String email;
    private String phoneNo;
    private List<Book> books;
    private StudentType studentType;
    Date createdOn;
    Date updatedOn;
}
