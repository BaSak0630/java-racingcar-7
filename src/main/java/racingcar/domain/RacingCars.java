package racingcar.domain;

import racingcar.dto.CarDTO;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {
    private static final int CAR_LIST_MAX_SIZE = 10;

    private final List<Car> carList;
    public RacingCars(String readLine) {
        List<Car> tmpList = new ArrayList<>();
        String[] nameArray = readLine.split(",");
        for (String name : nameArray) {
            Car car = new Car(name);
            tmpList.add(car);
        }
        validationListSize(tmpList);
        this.carList = tmpList;
    }

    private void validationListSize(List<Car> tmpList) {
        if (tmpList.size() > CAR_LIST_MAX_SIZE) {
            throw new IllegalArgumentException("[ERROR] 경주할 자동차의 수는 " + CAR_LIST_MAX_SIZE +"이하만 가능합니다.");
        }
    }

    public void move() {
        for(Car car : carList) {
            if(RandomNumber.isAdvance()){
                car.advance();
            }
        }
    }

    public String getStates() {
        StringBuilder stringBuilder = new StringBuilder();
        for(Car car : carList) {
            CarDTO carDTO = car.getCarDTO();
            stringBuilder.append(carDTO.getState());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public String getWinners() {
        StringBuilder stringBuilder = new StringBuilder();
        List<String> winnerList = getWinnerList();
        for (String winner : winnerList) {
            stringBuilder.append(winner);
        }
        return stringBuilder.toString();
    }

    private List<String> getWinnerList() {
        List<String> winnerList = new ArrayList<>();
        int maxPosition = getMaxPosition();
        for(Car car : carList) {
            CarDTO carDTO = car.getCarDTO();
            if(carDTO.getPosition() == maxPosition) {
                winnerList.add(carDTO.getCarName());
            }
        }
        return winnerList;
    }

    private int getMaxPosition() {
        int max = -1;
        for(Car car : carList) {
            CarDTO carDTO = car.getCarDTO();
            int postion = carDTO.getPosition();
            if(postion > max){
                max = postion;
            }
        }
        return max;
    }
}
