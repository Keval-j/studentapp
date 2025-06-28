package com.example.studentapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQueries;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureParameter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@NamedStoredProcedureQueries({

    @NamedStoredProcedureQuery(name = "course.getAllCourses", 
    procedureName ="GetAllCourses",
    resultClasses = Course.class ),

    @NamedStoredProcedureQuery(name = "course.getCourseById", 
    procedureName ="GetCourseById",
    resultClasses = Course.class ),

    @NamedStoredProcedureQuery(name = "course.insertCourse", 
    procedureName ="InsertCourse",
    parameters = {
        @StoredProcedureParameter(mode=ParameterMode.IN, name = "cName", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "cCredits", type = Integer.class)
    }
    ),

    @NamedStoredProcedureQuery(name = "course.updateCourse", 
    procedureName ="UpdateCourse",
    parameters = {
        @StoredProcedureParameter(mode=ParameterMode.IN, name = "cId", type = Integer.class),
        @StoredProcedureParameter(mode=ParameterMode.IN, name = "cName", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "cCredits", type = Integer.class)
    }
    ),
    @NamedStoredProcedureQuery(name="course.deleteByCId",
    procedureName = "DeleteByCId",
    parameters = {
        @StoredProcedureParameter(mode=ParameterMode.IN, name= "cId", type = Integer.class)
    }
    )




})


public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int courseid;
    @Column
    private String coursename;
    @Column
    private int credits;




}
