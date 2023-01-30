package ru.rotar.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.rotar.model.City;
import ru.rotar.model.WeatherData;
import ru.rotar.service.WeatherDataService;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
@Log
public class WeatherController {

    private final WeatherDataService weatherDataService;

    @GetMapping("/{city}")
    public WeatherData getWeather(@PathVariable City city,
                                  @RequestParam(required = false)
                                  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
                                  LocalDateTime date) {
        return weatherDataService.findWeatherByCityAndDate(city, date);
    }
}
