package com.cmms.CMMS.common.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Data
public class GenericDto implements Serializable {

    protected Integer id = 0;
    protected String createdBy;
    protected String modifiedBy;
    protected Date creationDate;
    protected Date modificationDate;
    protected Boolean active = true;
}
