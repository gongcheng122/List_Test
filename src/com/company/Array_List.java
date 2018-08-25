package com.company;

public abstract class Array_List {
    //线性表⻓长度
    public int List_Length(int[] arrayA){return arrayA.length;}
    //查询线性表第⼀一个数据元素
    public int Get_First_Data(){return 0;}
    //查询线性表最后⼀一个数据元素
    public int Get_Last_Data(){return 0;}
    //查询线性表中的某个数据元素
    public int Get_Data(int x){return 0;}
    //查询表中重复的数据元素
    public int[] Find_Duplication(){return null;}
    //删除表中重复元素
    public void Delete_Duplication(){}
    //清空线性表
    public void Empty_List(){}

    public boolean Insert_Data(int[] arrayA , int x , int y){return false;}
    public boolean Delete_Data(int[] arrayA , int x , int y){return false;}
    public boolean Sort_Max_To_Min(int[] arrayA){return false;}
    public boolean Sort_Min_To_Max(int[] arrayA){return false;}
}
