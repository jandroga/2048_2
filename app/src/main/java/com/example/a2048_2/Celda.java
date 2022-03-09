package com.example.a2048_2;

public class Celda {
    private int x;
    private int y;
    private int num;

    public Celda(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setValue(int valor){
        this.num = valor;
    }

    public int getNum(){
        return num;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }
}
