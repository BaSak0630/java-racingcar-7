package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String readLine() {
        String readLine = Console.readLine();
        if(readLine.isEmpty()){
            throw new IllegalArgumentException("[ERROR] 경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        }
        return readLine;
    }
}