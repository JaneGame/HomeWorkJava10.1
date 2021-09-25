package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioOldTest {


    Radio rad = new Radio();


    @Test
    void radioTestNextMax() {


        rad.setChoiceStation(10);

        rad.stationNext();

        int expected = 0;
        int actual = rad.getRadioStation();
        assertEquals(expected, actual);
    }

}