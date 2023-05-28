package pl.regula.ksb2restdomowe.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.regula.ksb2restdomowe.entity.WeatherEntity;

@Repository
public interface WeatherRepo extends CrudRepository<WeatherEntity, Long> {
}
