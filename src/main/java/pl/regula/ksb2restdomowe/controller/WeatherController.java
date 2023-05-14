package pl.regula.ksb2restdomowe.controller;

import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import pl.regula.ksb2restdomowe.model.Weather;

@Controller
public class WeatherController {

    private static final String WEATHER_API = "http://api.weatherapi.com/v1/current.json?key=c2875f2439a944258a7154557231205&q=";

    public Weather getCurrentWeatherByCity(String city) {
        String fullRequest = Strings.concat(WEATHER_API, city);
        RestTemplate restTemplate = new RestTemplate();
        Weather weather = restTemplate.getForObject(fullRequest, Weather.class);
        return weather;
    }

    @GetMapping("/weather")
    public String get(Model model) {
        model.addAttribute("weather", new Weather());
        return "weatherView";
    }


    @PostMapping("/weather")
    public String getResult(@ModelAttribute Weather weather, Model model) {
        Weather currentWeatherByCity = getCurrentWeatherByCity(weather.getCity());
        currentWeatherByCity.setCity(weather.city);
        model.addAttribute("weather", currentWeatherByCity);
        return "resultView";
    }
}
