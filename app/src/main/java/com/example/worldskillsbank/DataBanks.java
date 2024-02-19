package com.example.worldskillsbank;

public class DataBanks {
    private int adresID;
    private int sostID;
    private int raspID;

    public DataBanks (int _adresID, int _sostID, int _raspID){
        adresID = _adresID;
        sostID = _sostID;
        raspID = _raspID;
    }

    public int getAdresID(){
        return adresID;
    }

    public int getSostID(){
        return sostID;
    }

    public int getRaspID() {
        return raspID;
    }
}
