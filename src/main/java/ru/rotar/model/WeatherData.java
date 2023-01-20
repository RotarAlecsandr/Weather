package ru.rotar.model;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDateTime;

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

}



