package com.example;

import java.util.ArrayList;
import java.util.List;

public class LionAlex extends Lion {

    public LionAlex(FelineInterface felineInterface) throws Exception {
        super("Самец", felineInterface);
    }


    public List<String> getFriends(){
        List<String> alexFriendsName = new ArrayList<>();
        alexFriendsName.add("Марти");
        alexFriendsName.add("Глория");
        alexFriendsName.add("Мелман");
            return alexFriendsName;
    }

    public String getPlaceOfLiving(){
        return "Нью-Йоркский зоопарк";
    }
    @Override
    public int getKittens() {
        return 0;
    }
}
