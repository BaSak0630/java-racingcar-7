package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumber {
    private static final int PICK_NUMBER_IN_RANGE_MIN = 0;
    private static final int PICK_NUMBER_IN_RANGE_MAX = 9;
    private static final int FORWARD_STANDARD = 4;

    public boolean isAdvance() {
        int random = Randoms.pickNumberInRange(PICK_NUMBER_IN_RANGE_MIN, PICK_NUMBER_IN_RANGE_MAX);
        return random >= FORWARD_STANDARD;
    }
}
