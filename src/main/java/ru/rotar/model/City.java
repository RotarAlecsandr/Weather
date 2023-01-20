package ru.rotar.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum City {

    BREST("?lat=52.1&lon=23.7&"),
    BEREZA("?lat=53.5183&lon=50.1397&"),
    MINSK("?lat=53.9&lon=27.5667&"),
    PRUZHANY("?lat=52.5567&lon=24.4644&"),
    GOMEL("?lat=52.4345&lon=30.9754&");

    private final String uri;

}
