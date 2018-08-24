package com.company;

public class Arrary_List extends AList implements Arrary_List_Interface {

    @Override
    public int List_Length(int[] arrayA) {
        return arrayA.length;
    }

    @Override
    public boolean Insert_Data(int[] arrayA , int x ,int y) {
        if(x-1<=arrayA.length){

        }
        return false;
    }

    @Override
    public boolean Delete_data(int[] arrayA , int x , int y) {
        return false;
    }

    @Override
    public boolean Sort_Max_to_Down(int[] arrayA) {
        return false;
    }
}
