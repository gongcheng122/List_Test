package com.company;

public abstract class Array_List {
    public boolean Is_List_Empty(int[] ary){
        if(ary.length == 0){
            System.out.print("此数组为空！");
            return true;
        }
        return false;
    }

    //线性表⻓长度
    public int List_Length(int[] arrayA){return arrayA.length;}

    //查询线性表第⼀一个数据元素
    public int Get_First_Data(int[] ary){return 0;}

    //查询线性表最后⼀一个数据元素
    public int Get_Last_Data(int[] ary){return 0;}

    //查询线性表中的某个数据元素
    public int Get_Data(int[] ary , int x){return 0;}

    //查询表中重复的数据元素
    public int[] Find_Duplication(int[] ary){return null;}

    //删除表中重复元素
    public void Delete_Duplication(){}

    //清空线性表
    public void Empty_List(){}

    public boolean Insert_Data(int[] arrayA , int x , int y){return false;}

    public int[] Delete_Data(int[] arrayA , int x){return arrayA;}

    public boolean Sort_Max_To_Min(int[] arrayA){return false;}

    public boolean Sort_Min_To_Max(int[] arrayA){return false;}
}
