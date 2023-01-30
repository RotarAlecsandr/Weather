package ru.rotar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.rotar.model.WeatherData;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface WeatherDataRepository extends JpaRepository<WeatherData, Long> {
    //Optional<WeatherData> findFirstByCityOrderByDateDesc(String city);

    WeatherData findFirstByCityAndDateBeforeOrderByDateDesc(String city, LocalDateTime date);
}
