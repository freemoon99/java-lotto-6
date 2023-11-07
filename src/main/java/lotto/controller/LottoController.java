package lotto.controller;

import java.util.List;
import lotto.domain.Lotto;
import lotto.domain.LottoCalculate;
import lotto.domain.LottoGenerate;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoController {
    public void run() {
        try{
            start();
        } catch (IllegalArgumentException e){
            System.out.println("[ERROR] "+e.getMessage());
        }
    }
    public void start(){
        int amount = getAmount();
        List<Lotto> lottoNumList = generateLottoNumbers(amount);

    }

    public int getAmount(){
        OutputView.requestMoney();
        String money = InputView.getInputNumber();
        System.out.println();
        return LottoCalculate.calcAmount(Integer.parseInt(money));
    }
    public List<Lotto> generateLottoNumbers(int amount){
        OutputView.printAmountLotto(amount);
        List<Lotto> lottoNumbersList = LottoGenerate.generateLottoNumbers(amount);
        OutputView.printLottoList(lottoNumbersList);
        return lottoNumbersList;
    }
}
