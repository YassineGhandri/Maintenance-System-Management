package com.cmms.CMMS.common.persistent;

import lombok.Getter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static javax.persistence.GenerationType.SEQUENCE;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Getter
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
