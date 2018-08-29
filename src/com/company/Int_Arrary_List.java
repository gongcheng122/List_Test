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
    public int Get_First_Data(int[] ary) {
        if(Is_List_Empty(ary)){
            return 0;
        }else{
            return ary[0];
        }

    }

    @Override
    public int Get_Last_Data(int[] ary) {
        if(Is_List_Empty(ary)){
            return 0;
        }
        int x = ary.length;
        return ary[x-1];
    }

    @Override
    public int Get_Data(int[] ary , int x) {
        if(Is_List_Empty(ary)){
            return 0;//如果数组为空，取任意数据元素结果返回 0
        }else {
            if (x == 0) {
                return ary[0];
            } else if (x < ary.length) {
                return ary[x - 1];
            } else {
                return 0;
            }
        }
    }

    @Override
    public int[] Find_Duplication(int[] ary)
    {
        int x= 0;
        int y = ary.length;
        int duplication[];
        return ary;
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
    public int Find_Max(int[] ary) {
        if(Is_List_Empty(ary)){
            return 0;//如果数组为空，查找最大数据元素结果返回 0
            }else {
            int x = ary.length;
            int max = 0;
            for(int m = 0; m < x; m++){
                if(ary[m]>max){
                    max = ary[m];
                }
            }
            return max;
        }
    }

    @Override
    public int[] Delete_Max_Data(int[] ary) {
        int x = Find_Max(ary);
        return ary;
    }

    @Override
    public void Delete_If_Max_Data(int x) {

    }

    @Override
    public int[] Find_Max_array(int x) {
        return new int[0];
    }

    @Override
    public int Find_Min(int[] ary) {
        if(Is_List_Empty(ary)){
            return 0;//如果数组为空，查找最小数据元素结果返回 0
        }else {
            int x = ary.length;
            int min = 0;
            for(int m = 0; m < x; m++){
                if(ary[m]<min){
                    min = ary[m];
                }
            }
            return min;
        }
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
