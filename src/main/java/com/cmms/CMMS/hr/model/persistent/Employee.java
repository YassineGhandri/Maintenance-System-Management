package com.cmms.CMMS.hr.model.persistent;

import com.cmms.CMMS.common.persistent.GenericEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "employees")
@SequenceGenerator(name = "SEQ", sequenceName = "employees_seq", allocationSize = 1)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Where(clause = "is_active = true")
@SQLDelete(sql = "UPDATE employees SET is_active = false WHERE id = ? AND version = ?")
public class Employee extends GenericEntity {

    @Column(name = "employee_number", nullable = false)
    private String employeeNumber; //matricule de l'employé

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "post")
    private String post;

    @Column(name = "email")
    private String email;

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
}
