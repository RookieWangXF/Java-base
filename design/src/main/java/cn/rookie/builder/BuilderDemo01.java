package cn.rookie.builder;

/**
 * Created by Rookie on 2016/4/13.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
//场景类，三个参数：地图音乐和天气
class GameScene{
    private String map;
    private String music;
    private String weather;
    public String getMap() {
        return map;
    }
    public void setMap(String map) {
        this.map = map;
    }
    public String getMusic() {
        return music;
    }
    public void setMusic(String music) {
        this.music = music;
    }
    public String getWeather() {
        return weather;
    }
    public void setWeather(String weather) {
        this.weather = weather;
    }
}

abstract class Builder01{
    protected GameScene gameScene=new GameScene();
    public abstract void buildMap(String map);
    public abstract void buildMusic(String music);
    public abstract void buildWeather(String weather);
}

class concreteBuilder extends Builder01{

    @Override
    public void buildMap(String map) {
        gameScene.setMap(map);
    }
    @Override
    public void buildMusic(String music) {
        gameScene.setMusic(music);
    }
    @Override
    public void buildWeather(String weather) {
        gameScene.setWeather(weather);
    }
    @Override
    public String toString() {
        StringBuilder sbBuilder = new StringBuilder();
        sbBuilder.append("场景是：");
        sbBuilder.append(gameScene.getMap());
        sbBuilder.append("  音乐是：");
        sbBuilder.append(gameScene.getMusic());
        sbBuilder.append("  天气是：");
        sbBuilder.append(gameScene.getWeather());
        return sbBuilder.toString();
    }
}

class Director01{
    private Builder01 builder;
    public Director01(Builder01 builder){
        this.builder=builder;
    }
    public void setBuilder(Builder01 builder){
        this.builder=builder;
    }
    public void construct(String map, String music, String weather){
        builder.buildMap(map);
        builder.buildMusic(music);
        builder.buildWeather(weather);
        System.out.print(builder.toString());
    }

}

public class BuilderDemo01 {
    public static void main(String[] args) {
        Builder01 builder= new concreteBuilder();
        Director01 director = new Director01(builder);
        director.construct("傍晚","Music","暴风雪");
    }
}
