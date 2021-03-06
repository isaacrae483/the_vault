package Presentors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import Activities.CatanBoardActivity;
import Model.CatanBoardData;
import Model.HexCoordinate;
import Model.Resources;

public class CatanBoardPresentor {

    private CatanBoardData data = CatanBoardData.instance();
    private CatanBoardActivity activity;

    public CatanBoardPresentor(CatanBoardActivity activity){
        this.activity = activity;
    }

    public void createBoards(){
        //calculate the catan boards
        creatBaseBoard();
        createExpansionBoard();
        activity.loadBoards();
    }

    private void creatBaseBoard(){
        ArrayList<Enum<Resources>> resources = data.getBaseResources();
        HashMap<HexCoordinate, Enum<Resources>> hexes = data.getBaseHexes();
        Random random = new Random();
        int rand;

        for(HexCoordinate x : hexes.keySet()){
            rand = random.nextInt(resources.size());
            hexes.put(x, resources.get(rand));
            resources.remove(rand);
        }

        data.setBaseHexes(hexes);
    }

    private void createExpansionBoard(){
        ArrayList<Enum<Resources>> resources = data.getExpansionResources();
        HashMap<HexCoordinate, Enum<Resources>> hexes = data.getExpansionHexes();
        Random random = new Random();
        int rand;

        for(HexCoordinate x : hexes.keySet()){
            rand = random.nextInt(resources.size());
            hexes.put(x, resources.get(rand));
            resources.remove(rand);
        }

        data.setExpansionHexes(hexes);
    }

    public HashMap<HexCoordinate, Enum<Resources>> getBaseHexes() {
        return data.getBaseHexes();
    }

    public HashMap<HexCoordinate, Enum<Resources>> getExpansionHexes() {
        return data.getExpansionHexes();
    }

}
