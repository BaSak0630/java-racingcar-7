package racingcar;

public class OutputView {
    private static final String READ_CAR_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";

    public void printReadCarNameMessage() {
        System.out.println(READ_CAR_NAME_MESSAGE);
    }
}