package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String getInputNumber(){
        String money = Console.readLine();
        ValidationView.isDivided(money);
        return money;
    }
}
