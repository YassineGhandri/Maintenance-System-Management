package com.cmms.CMMS.maintenance.controler;


import com.cmms.CMMS.maintenance.controler.mapper.AssetMapper;
import com.cmms.CMMS.maintenance.controler.mapper.WorkRequestMapper;
import com.cmms.CMMS.maintenance.model.dto.AssetDto;
import com.cmms.CMMS.maintenance.model.dto.WorkRequestDto;
import com.cmms.CMMS.maintenance.model.persistent.Asset;
import com.cmms.CMMS.maintenance.model.persistent.WorkRequest;
import com.cmms.CMMS.maintenance.service.AssestService;
import com.cmms.CMMS.maintenance.service.WorkRequestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/work_requests")
@Slf4j
public class WorkRequestController {
    private WorkRequestService workRequestService;
    private WorkRequestMapper workRequestMapper;

    @Autowired
    public WorkRequestController(WorkRequestService workRequestService, WorkRequestMapper workRequestMapper) {
        this.workRequestService = workRequestService;
        this.workRequestMapper = workRequestMapper;
    }

    public List<WorkRequestDto> getAll() {

        return  workRequestMapper.toDtoList(workRequestService.findAll());
    }

    @GetMapping("/{id}")
    public Optional<WorkRequestDto> find(@PathVariable("id") Integer id) {
        return Optional.ofNullable(workRequestMapper.toDto(workRequestService.findOne(id)));
    }

    @PostMapping
    public WorkRequestDto save(@RequestBody WorkRequestDto workRequestDto) {
        return workRequestMapper.toDto(Optional.ofNullable(workRequestService
                .save(workRequestMapper.toEntity(workRequestDto))));
    }

    @PutMapping("/{id}")
    public WorkRequestDto update(@PathVariable("id") Integer id, @RequestBody WorkRequestDto workRequestDto) {
        WorkRequest workRequest = workRequestMapper.toEntity(workRequestDto);
        workRequest.setId(id);
        return  workRequestMapper.toDto(Optional.ofNullable(workRequestService.save(workRequest)));
    }

    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable("id") Integer id) {
        workRequestService.delete(id);
        return  id;
    }

    @GetMapping("/findByIds")
    public WorkRequestDto findByIds(@RequestParam(value = "ids") Integer[] ids) {
        return (WorkRequestDto) workRequestService.findByIds(ids).stream().toList();

    }
}
