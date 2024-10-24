package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RacingCarsTest {
    @Test
    @DisplayName("최대 크기 예외 테스트")
    public void validationListSizeTest() {
        //given
        String testString = "a,b,c,d,e,f,g,h,i,j,k";
        //expect
        assertThrows(IllegalArgumentException.class, () -> new RacingCars(testString));
    }

    @Test
    @DisplayName("상테 가져오기 테스트")
    public void getStatesTest() {
        //given
        String testString = "a,b,c";
        RacingCars racingCars = new RacingCars(testString);
        //when
        String states = racingCars.getStates();

        String expected = "a : \n" + "b : \n" + "c : \n";
        //then
        assertEquals(expected, states);
    }

    @Test
    @DisplayName("최종 우승자 테스트")
    public void getWinners() {
        //given
        String testString = "a,b,c";
        RacingCars racingCars = new RacingCars(testString);
        //when
        String winners = racingCars.getWinners();
        //then
        assertEquals("a,b,c", winners);
    }
}