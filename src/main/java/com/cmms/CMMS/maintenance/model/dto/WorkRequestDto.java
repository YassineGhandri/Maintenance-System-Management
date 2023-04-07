package com.cmms.CMMS.maintenance.model.dto;

import com.cmms.CMMS.common.dto.GenericDto;
import com.cmms.CMMS.hr.model.persistent.Employee;
import com.cmms.CMMS.maintenance.model.persistent.Asset;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WorkRequestDto extends GenericDto {

    private String reference;

    private String satus;

    private String priority;

    private String description;

    private String Date;

    private Employee requestor;

    private Asset asset;
}
