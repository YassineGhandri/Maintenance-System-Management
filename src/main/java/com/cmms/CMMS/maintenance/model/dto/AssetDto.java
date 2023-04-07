package com.cmms.CMMS.maintenance.model.dto;

import com.cmms.CMMS.common.dto.GenericDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AssetDto extends GenericDto {

    /*
     protected Integer id = 0;
    protected String createdBy;
    protected String modifiedBy;
    protected Date creationDate;
    protected Date modificationDate;
    protected Boolean active = true;
    */
    private String reference;
    private String name;
    private String criticity;
    private String model;




}
