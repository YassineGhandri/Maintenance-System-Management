package com.cmms.CMMS.maintenance.model.persistent;

import com.cmms.CMMS.common.persistent.GenericEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "assets")
@SequenceGenerator(name = "SEQ", sequenceName = "assets_seq", allocationSize = 1)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Where(clause = "is_active = true")
@SQLDelete(sql = "UPDATE employees SET is_active = false WHERE id = ? AND version = ?")
public class Asset extends GenericEntity {

    @Column(name="reference")
    private String reference;
    @Column(name="name")
    private String name;

    @Column(name="criticity")
    private String criticity;

    @Column(name="model")
    private String model;

}
