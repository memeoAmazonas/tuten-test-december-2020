package com.tuten.test.controller;

import com.tuten.test.dto.TimezoneDTO;
import com.tuten.test.service.TimezoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 Created by Jose Ortiz
 Date December 2020
 */

@RestController
@RequestMapping("/")
public class TimezoneCTRL {
    @Autowired
    private TimezoneService timezoneService;

    @CrossOrigin
    @PostMapping(value="/timezone")
    public ResponseEntity timezone(@RequestBody TimezoneDTO timezoneDTO) {
        try {
            String response = timezoneService.getTimezone(timezoneDTO);
            return new ResponseEntity(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
