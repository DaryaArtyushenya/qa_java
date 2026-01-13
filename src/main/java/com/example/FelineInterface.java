package com.example;

import java.util.List;

public interface FelineInterface {
    int getKittens();
    int getKittens(int kittensCount);
    List<String> getFood(String type) throws Exception;
}
