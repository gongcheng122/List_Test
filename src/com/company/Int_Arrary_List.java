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
        //System.out.println(x);
        if(x == 0){
            System.out.print("此数组为空！");
            return new int[] {};
        }else{
            int a;
            int b = 0;
            //计算数组中含有多少个最大值
            for(int y = 0; y<ary.length;y++){
                if(ary[y] == x){
                    b++;
                }
            }
            //System.out.println("数组中含有 "+b+" 个最大值 : "+x);
            //System.out.println("新数组长度为 ： "+(ary.length-b));
            int max_ary[] = new int[ary.length-b];
            int c = 0;
            //将数组中非最大值的数据元素赋予新的数组
            for(int y = 0; y<ary.length;y++){
                if(ary[y] != x){
                    //System.out.println(ary[y]);
                    max_ary[c] = ary[y];
                    //System.out.print(max_ary[c]);
                    //System.out.print(' ');
                    c++;
                }
            }
            return max_ary;
        }
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

    @Override
    public void Display_Int_Array(int[] ary) {
        if(Is_List_Empty(ary)){
            System.out.println("数组为空！");
        }else {
            System.out.println("数组数据元素如下：");
            for(int x = 0;x<ary.length;x++){
                System.out.print(ary[x]);
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
