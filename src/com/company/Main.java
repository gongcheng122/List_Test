package com.company;

import static com.company.Print.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int array1[] = {5,7,3,77,27,0,-1,1,99,77,0,17,88,56,77,77,17,2,2277,27,-1,0,0,1};

        Pln_Str_Boolean("array1是否为数组 ： ",array1.getClass().isArray());

        Int_Arrary_List A = new Int_Arrary_List();

        Pln_String("--------------------------------");
        A.Display_Int_Array("数组 array1 = ",array1,"\n");

        Pln_Str_Int("取数组的第一个值 = ",A.Get_First_Data(array1));

        Pln_Str_Int("取数组的最后一个值 = ",A.Get_Last_Data(array1));

        Pln_Str_Int("取数组的第五个值 = ",A.Get_Data(array1,5));

        Pln_Str_Int("取数组最大值 = ",A.Find_Max(array1));

        Pln_Str_Int("取数组最小值 = ",A.Find_Min(array1));

        Pln_String("--------------------------------");
        A.Display_Int_Array("数组 array1 = ",array1);
        P_Str_Int_Str("删除最大值 ",A.Find_Max(array1)," 后为：");
        A.Display_Int_Array(A.Delete_Max_Data(array1),"\r");


        Pln_String("--------------------------------");
        int[] array2 = {1,9,9,9,9,0,0,-1,-1,9,1,2,0,0};
        A.Display_Int_Array("数组 array2 = ",array2,"\r");
        P_Str_Int_Str("删除最大值 ",A.Find_Max(array2)," 后为：");
        A.Display_Int_Array(A.Delete_Max_Data(array2),"\r");

        Pln_String("--------------------------------");
        A.Display_Int_Array("数组 array1 = ",array1,"\r");
        P_Str_Int_Str("删除最小值 ",A.Find_Min(array1)," 后为：");
        A.Display_Int_Array(A.Delete_Min_Data(array1),"\r");

        Pln_String("--------------------------------");
        A.Display_Int_Array(array2);
        P_Str_Int_Str("删除最小值 ",A.Find_Min(array2)," 后为：");
        A.Display_Int_Array(A.Delete_Min_Data(array2),"\r");

        Pln_String("--------------------------------");
        A.Display_Int_Array("数组 array1 = ",array1,"\n");
        P_Str_Int_Str("数组中有多少个大于50的数据元素：",A.How_Many_Max_X(array1,50),"\n\n");
        A.Display_Int_Array("删除数组中大于50的数组元素: ",A.Delete_If_Max_X(array1,50),"\n");

        A.Display_Int_Array("查找数组中小于50的数据元素：",A.Find_If_Min_X(array1,50),"\n");

        P_Str_Int_Str("数组中有多少个小于50的数据元素：",A.How_Many_Min_X(array1,50),"\n\n");
        A.Display_Int_Array("删除数组中小于50的数组元素: ",A.Delete_If_Min_X(array1,50),"\n");

        A.Display_Int_Array("查找数组中大于50的数据元素：",A.Find_If_Max_X(array1,50),"\r");

        Pln_String("--------------------------------");
        A.Display_Int_Array("数组 array1 = ",array1,"\n");
        A.Display_Int_Array("查找数组array1中重复的数组元素：",A.Find_Duplication(array1),"\n");

        A.Display_Int_Array("数组 array2 = ",array2,"\n");
        A.Display_Int_Array("查找数组array2中重复的数组元素：",A.Find_Duplication(array2),"\r");

        Pln_String("--------------------------------");
        A.Display_Int_Array("数组 array1 = ",array1,"\n");
        A.Display_Int_Array("删除数组中重复的数据元素：",A.Delete_Duplication(array1));

        Pln_String("--------------------------------");
        A.Display_Int_Array("数组 array2 = ",array2,"\n");
        A.Display_Int_Array("删除数组中重复的数据元素：",A.Delete_Duplication(array2));

        Pln_String("--------------------------------");
        A.Display_Int_Array("数组 array1 = ",array1,"\n");
        A.Display_Int_Array("删除数组中的第五个数据元素：",A.Delete_Data(array1,5));

        Pln_String("--------------------------------");
        A.Display_Int_Array("数组 array1 = ",array1,"\n");
        A.Display_Int_Array("删除数组中的第四个数据元素：",A.Delete_Data(array1,4));

        Pln_String("--------------------------------");
        Pln_String("            下面看空数组          ");
        Pln_String("--------------------------------");
        array1 = A.Empty_List(array1);

        //System.out.println("数组长度为 ："+array2.length);
        Pln_Str_Int("此数组长度为 ：",A.List_Length(array1));
        Pln_Str_Boolean("此数组是否为空 ：",A.Is_List_Empty(array1));

        Pln_String("--------------------------------");
        Pln_Str_Int("取数组的第一个值 = ",A.Get_First_Data(array1));
        Pln_Str_Int("取数组的最后一个值 = ",A.Get_Last_Data(array1));

        Pln_String("--------------------------------");
        Pln_Str_Int("取数组的第一个值 = ",A.Get_Data(array1,1));
        Pln_Str_Int("取数组的第二个值 = ",A.Get_Data(array1,2));
        //System.out.println("取数组的第一个值 = "+array2[0]); //空数组array2，取任意数据元素报错，超出边界
        //System.out.println("取数组的第一个值 = "+array2[1]);

        Pln_String("--------------------------------");
        Pln_Str_Int("取数组最大值 = ",A.Find_Max(array1));
        Pln_Str_Int("取数组最小值 = ",A.Find_Min(array1));

        Pln_String("--------------------------------");
        A.Display_Int_Array(array2);
        P_String("在第7个数据元素之前是有存在数据元素-1？");
        Pln_Boolean(A.Exist_X_Before_Y(array2,-1,7));

        P_String("在第8个数据元素之前是有存在数据元素-1？");
        Pln_Boolean(A.Exist_X_Before_Y(array2,-1,8));

        P_String("在第9个数据元素之前是有存在数据元素-1？");
        Pln_Boolean(A.Exist_X_Before_Y(array2,-1,9));

        Pln_String("--------------------------------");
        int array3[] = {5,7,3,77,27,0,-1,1,99,77,0,17,88,56,77,77,17,2,2277,27,-1,0,0,1};
        A.Display_Int_Array("数组 array3 = ",array3);
        A.Display_Int_Array("sort 数组 array3 后 = ",A.Sort_Max_To_Min(array3));

        int[] array4 = {1,9,9,9,9,0,0,-1,-1,9,1,2,0,0};
        A.Display_Int_Array("数组 array4 = ",array4,"\r");
        A.Display_Int_Array("sort 数组 array4 后 = ",A.Sort_Max_To_Min(array4));
    }
}
