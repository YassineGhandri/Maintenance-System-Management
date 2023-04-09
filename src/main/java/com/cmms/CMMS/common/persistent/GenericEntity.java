package com.cmms.CMMS.common.persistent;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static javax.persistence.GenerationType.SEQUENCE;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Getter
@Setter
public abstract class GenericEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "SEQ")
    protected Integer id = 0;

    @Column(name = "CREATED_BY")
    protected String createdBy;

    @Column(name = "MODIFIED_BY")
    protected String modifiedBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATION_DATE")
    protected Date creationDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "MODIFICATION_DATE")
    protected Date modificationDate;

    @Column(name = "is_active", columnDefinition = "boolean DEFAULT true")
    protected Boolean active = true;

    public GenericEntity() {
    }

    public GenericEntity(String createdBy, String modifiedBy) {
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
    }


}
