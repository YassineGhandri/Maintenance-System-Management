package com.cmms.CMMS.maintenance.model.persistent;

import com.cmms.CMMS.common.persistent.GenericEntity;
import com.cmms.CMMS.hr.model.persistent.Employee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity
@Table(name = "vouchers")
@SequenceGenerator(name = "SEQ", sequenceName = "vouchers_seq", allocationSize = 1)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Where(clause = "is_active = true")
@SQLDelete(sql = "UPDATE employees SET is_active = false WHERE id = ? AND version = ?")
public class Voucher extends GenericEntity {
    @Column(name="reference")
    private String reference;
    @Column(name="satus")
    private String satus;

    @Column(name="priority")
    private String priority;

    @Column(name="description")
    private String description;

    @Column(name="date")
    private String Date;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "work_request", nullable = false)
    private WorkRequest workRequest;
}
