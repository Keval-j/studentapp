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

    @NamedStoredProcedureQuery(name = "Enrollments.getAllEnrollments", 
    procedureName ="GetAllEnrollments",
    resultClasses = Enrollments.class ),

    @NamedStoredProcedureQuery(name = "Enrollments.getEnrollmentById", 
    procedureName ="GetEnrollmentById",
    resultClasses = Enrollments.class ),

    @NamedStoredProcedureQuery(name = "Enrollments.insertEnrollment", 
    procedureName ="InsertEnrollment",
    parameters = {
        @StoredProcedureParameter(mode=ParameterMode.IN, name = "sId", type = Integer.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "cId", type = Integer.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "eDate", type = Date.class)
    }
    ),
    @NamedStoredProcedureQuery(name = "Enrollments.updateEnrollment", 
    procedureName ="UpdateEnrollment",
    parameters = {
        @StoredProcedureParameter(mode=ParameterMode.IN, name = "eId", type = Integer.class),
        @StoredProcedureParameter(mode=ParameterMode.IN, name = "sId", type = Integer.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "cId", type = Integer.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "eDate", type = Date.class)
    }
    ),
    @NamedStoredProcedureQuery(name="Enrollments.deleteByeId",
    procedureName = "DeleteByeId",
    parameters = {
        @StoredProcedureParameter(mode=ParameterMode.IN, name = "eId", type = Integer.class)
    }
    )

})

public class Enrollments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String studentid;
    @Column
    private String courseid;
    @Column
    private Date enrollmentdate;
  

}
