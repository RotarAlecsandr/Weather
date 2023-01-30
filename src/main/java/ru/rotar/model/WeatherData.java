package ru.rotar.model;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Weather")
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherData {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String city;
    private LocalDateTime date;
    private double temp; // температура
    private int pressure; // давление
    @Column(name = "wind_m_sek")
    private double speed; // ветер
    private String main; // влажность

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeatherData that = (WeatherData) o;
        return Double.compare(that.temp, temp) == 0 && pressure == that.pressure && Double.compare(that.speed, speed) == 0 && Objects.equals(id, that.id) && Objects.equals(city, that.city) && Objects.equals(date, that.date) && Objects.equals(main, that.main);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, city, date, temp, pressure, speed, main);
    }
}



