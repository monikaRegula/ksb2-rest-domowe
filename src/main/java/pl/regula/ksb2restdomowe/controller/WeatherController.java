package pl.regula.ksb2restdomowe.controller;

import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;
import pl.regula.ksb2restdomowe.model.Weather;
import pl.regula.ksb2restdomowe.service.WeatherServiceImpl;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class WeatherController {

    private static final Logger logger = Logger.getLogger(WeatherController.class.getName());
    private static final String WEATHER_API = "http://api.weatherapi.com/v1/current.json?key=c2875f2439a944258a7154557231205&q=";
    private static final String CITY = "Szprotawa";

    private WeatherServiceImpl service;
    private RestTemplate restTemplate;

    @Autowired
    public WeatherController(WeatherServiceImpl service) {
        this.service = service;
        this.restTemplate = new RestTemplate();
    }

    @Scheduled(cron = "${cron}")
    public void getCurrentWeatherByCity() {
        logger.log(Level.INFO, "Getting actual weather data ...");

        String fullRequest = Strings.concat(WEATHER_API, CITY);
        Weather restTemplateForObject = restTemplate.getForObject(fullRequest, Weather.class);
        service.persistWeather(restTemplateForObject);

        logger.log(Level.INFO, "Data saved successfully in database");
    }


}
