package Presentors;

import java.util.ArrayList;

import Model.TurnOrderData;

public class TurnOrderPresenter implements TurnOrderPresenterInterface {

    TurnOrderData data = TurnOrderData.instance();

    @Override
    public int getPlayerCount() {
        return 0;
    }

    @Override
    public void setPlayerCount(int count) {

    }

    @Override
    public void setPlayers(ArrayList<String> players) {

    }

    @Override
    public void randomizePlayers() {

    }

    @Override
    public ArrayList<String> getReorderedPlayers() {
        return null;
    }
}
