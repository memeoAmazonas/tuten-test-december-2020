package com.tuten.test.service;

import com.tuten.test.dto.TimezoneDTO;
import org.springframework.stereotype.Component;

import java.time.*;

@Component
public class TimezoneService {
    public String getTimezone(TimezoneDTO timezoneDTO) {
        LocalDateTime localDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.parse(timezoneDTO.getDato1()));
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of(timezoneDTO.getDato2())).withZoneSameInstant(ZoneId.of("UTC"));
        String time = zonedDateTime.getHour()+":"+zonedDateTime.getMinute()+":"+zonedDateTime.getSecond();
        return new TimezoneDTO(time,zonedDateTime.getZone().toString()).toString();
    }
}
