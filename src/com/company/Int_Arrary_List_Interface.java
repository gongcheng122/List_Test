package com.company;

public interface Int_Arrary_List_Interface {
    int Find_Max(int[] ary);//查询最大的数据元素
    int[] Delete_Max_Data(int[] ary);//删除最大的数据元素
    void Delete_If_Max_Data(int x);//删除大于x的数据元素
    int[] Find_Max_array(int x);//查询⼤
    int Find_Min(int[] ary);//查询最⼩小的数据元素
    void delete_min_data();//删除最小的数据元素
    void delete_if_min_data(int x);//删除小于x的数据元素
    int[] Find_min_array(int x);//查询小于x的数据元素
    void sort_max_to_min();//从大到小排序
    void sort_min_to_max();//从小到大排序
}
