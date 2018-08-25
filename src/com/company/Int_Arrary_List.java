package com.company;

public class Int_Arrary_List extends Array_List implements Int_Arrary_List_Interface {

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
    public int Get_First_Data() {
        return super.Get_First_Data();
    }

    @Override
    public int Get_Last_Data() {
        return super.Get_Last_Data();
    }

    @Override
    public int Get_Data(int x) {
        return super.Get_Data(x);
    }

    @Override
    public int[] Find_Duplication() {
        return super.Find_Duplication();
    }

    @Override
    public void Delete_Duplication() {
        super.Delete_Duplication();
    }

    @Override
    public void Empty_List() {
        super.Empty_List();
    }

    @Override
    public boolean Delete_Data(int[] arrayA, int x, int y) {
        return super.Delete_Data(arrayA, x, y);
    }

    @Override
    public boolean Sort_Max_To_Min(int[] arrayA) {
        return super.Sort_Max_To_Min(arrayA);
    }

    @Override
    public boolean Sort_Min_To_Max(int[] arrayA) {
        return super.Sort_Min_To_Max(arrayA);
    }

    @Override
    public int Find_Max() {
        return 0;
    }

    @Override
    public void Delete_Max_Data() {

    }

    @Override
    public void Delete_If_Max_Data(int x) {

    }

    @Override
    public int[] Find_Max_array(int x) {
        return new int[0];
    }

    @Override
    public int Find_Min() {
        return 0;
    }

    @Override
    public void delete_min_data() {

    }

    @Override
    public void delete_if_min_data(int x) {

    }

    @Override
    public int[] Find_min_array(int x) {
        return new int[0];
    }

    @Override
    public void sort_max_to_min() {

    }

    @Override
    public void sort_min_to_max() {

    }
}
