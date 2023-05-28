package pl.regula.ksb2restdomowe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.regula.ksb2restdomowe.dao.WeatherRepo;
import pl.regula.ksb2restdomowe.entity.WeatherEntity;
import pl.regula.ksb2restdomowe.model.Weather;

@Service
public class WeatherServiceImpl implements WeatherService {

    private WeatherRepo repo;

    @Autowired
    public WeatherServiceImpl(WeatherRepo repo) {
        this.repo = repo;
    }

    @Override
    public void persistWeather(Weather weather) {
        WeatherEntity weatherEntity = mapToEntity(weather);
        repo.save(weatherEntity);
    }

    private WeatherEntity mapToEntity(Weather weather) {
        WeatherEntity result = new WeatherEntity();
        result.setWind(weather.getCurrent().getWindKph());
        result.setHumidity(weather.getCurrent().getHumidity());
        result.setPressure(weather.getCurrent().getPressureIn());
        result.setTemperature(weather.getCurrent().getTempC());
        return result;
    }
}
