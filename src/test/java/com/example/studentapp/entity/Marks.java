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

    @NamedStoredProcedureQuery(name = "marks.getAllMarks", 
    procedureName ="GetAllMarks",
    resultClasses = Marks.class ),

    @NamedStoredProcedureQuery(name = "marks.getMarksById", 
    procedureName ="GetMarksById",
    resultClasses = Marks.class ),

    @NamedStoredProcedureQuery(name = "marks.insertmarks", 
    procedureName ="Insertmarks",
    parameters = {
        @StoredProcedureParameter(mode=ParameterMode.IN, name = "sId", type = Integer.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "cId", type = Integer.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "mobtained", type = Integer.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "maxmarks", type = Integer.class)
    }
    ),

    @NamedStoredProcedureQuery(name = "marks.updateMarks", 
    procedureName ="UpdateMarks",
    parameters = {
        @StoredProcedureParameter(mode=ParameterMode.IN, name = "mId", type = Integer.class),
        @StoredProcedureParameter(mode=ParameterMode.IN, name = "sId", type = Integer.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "cId", type = Integer.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "mobtained", type = Integer.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "maxmarks", type = Integer.class)
    }
    ),
    @NamedStoredProcedureQuery(name="marks.deleteBymId",
    procedureName = "DeleteBymId",
    parameters = {
        @StoredProcedureParameter(mode=ParameterMode.IN, name= "mId", type = Integer.class)
    }
    )

})

public class Marks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int marksid;
    @Column
    private int studentid;
    @Column
    private int courseid;
    @Column
    private int marksobtained;
    @Column
    private int maxmarks;
    

}
