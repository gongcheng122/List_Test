package com.company;

public interface Int_Arrary_List_Interface {
    //查询最大的数据元素
    int Find_Max(int[] ary);

    //删除最大的数据元素
    int[] Delete_Max_Data(int[] ary);

    //求数组中大于x的数据元素有多少个
    int How_Many_Max_X(int[] ary,int x);

    //求数组中小于x的数据元素有多少个
    int How_Many_Min_X(int[] ary,int x);

    //删除大于x的数据元素
    int[] Delete_If_Max_X(int[] ary , int x);

    //删除数组中小于x的数据元素
    int[] Delete_If_Min_X(int[] ary,int x);

    //查询最小的数据元素
    int Find_Min(int[] ary);

    //删除最小的数据元素
    int[] Delete_Min_Data(int[] ary);

    //查找数组ary中小于x的数据元素
    int[] Find_If_Min_X(int[] ary, int x);

    //查找数组ary中小于x的数据元素
    int[] Find_If_Max_X(int[] ary, int x);

    //从大到小排序
    int[] Sort_Max_To_Min(int[] ary);

    //从小到大排序
    int[] Sort_Min_To_Max(int[] ary);

    //显示数组元素
    void Display_Int_Array(int[] ary);

    //清空数组
    int[] Empty_List(int[] ary);

    //查找数组中重复的数据元素
    int[] Find_Duplication(int[] ary);

    //删除数组中重复的数据元素
    int[] Delete_Duplication(int[] arr);

    //判断数组在第y个元素之前（包含第y个数据元素）是否含有等于
    boolean Exist_X_Before_Y(int[] ary,int x,int y);

    //数组中是否含有等于x的数据元素
    boolean Exist_X(int[] ary,int x);

    //删去数组中等于x的数据元素
    int[] Delete_The_X(int[] ary,int x);

    //数组中含有等于x的数据元素有多少个
    int How_Many_X(int[] ary,int x);
}
