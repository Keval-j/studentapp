package com.example.studentapp.entity;

import java.util.Date;

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
    @NamedStoredProcedureQuery(name = "Student.getAllStudent", 
    procedureName ="GetAllStudents",
    resultClasses = Student.class ),

    @NamedStoredProcedureQuery(name = "Student.getStudentById", 
    procedureName ="GetStudentById",
    resultClasses = Student.class ),

    @NamedStoredProcedureQuery(name = "Student.insertStudent", 
    procedureName ="InsertStudent",
    parameters = {
        @StoredProcedureParameter(mode=ParameterMode.IN, name = "sName", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "sDOB", type = Date.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "sGender", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "sEmail", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "sPhone", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "sAddress", type = String.class),

    }
    ),

    @NamedStoredProcedureQuery(name = "Student.updateStudent", 
    procedureName ="UpdateStudent",
    parameters = {
        @StoredProcedureParameter(mode=ParameterMode.IN, name = "sId", type = Integer.class),
        @StoredProcedureParameter(mode=ParameterMode.IN, name = "sName", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "sDOB", type = Date.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "sGender", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "sEmail", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "sPhone", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "sAddress", type = String.class)
    }
    ),
    @NamedStoredProcedureQuery(name="Student.deletebyId",
    procedureName = "DeleteById",
    parameters = {
        @StoredProcedureParameter(mode=ParameterMode.IN, name= "sId", type = Integer.class)
    }
    )

})
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column
    private String Name;
    @Column
    private Date DOB;
    @Column
    private String Gender;
    @Column
    private String Email;
    @Column
    private String Phone;
    @Column
    private String Address;

}
