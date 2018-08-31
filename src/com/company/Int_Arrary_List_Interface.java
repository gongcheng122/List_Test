package com.company;

public interface Int_Arrary_List_Interface {
    int Find_Max(int[] ary);//查询最大的数据元素
    int[] Delete_Max_Data(int[] ary);//删除最大的数据元素
    int How_Many_Max_Data(int[] ary,int x);//求数组中大于x的数据元素有多少个
    int[] Delete_If_Max_Data(int[] ary , int x);//删除大于x的数据元素
    int[] delete_if_min_data(int[] ary,int x);//查询⼤
    int Find_Min(int[] ary);//查询最⼩小的数据元素
    int[] Delete_Min_Data(int[] ary);//删除最小的数据元素
    //void delete_if_min_data(int x);//删除小于x的数据元素
    //int[] Find_min_array(int x);//查询小于x的数据元素
    int[] sort_max_to_min(int[] ary);//从大到小排序
    int[] sort_min_to_max(int[] ary);//从小到大排序

    void Display_Int_Array(int[] ary);
    int[] Empty_List(int[] ary);
}
