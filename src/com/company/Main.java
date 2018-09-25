package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int array1[] = {5,7,3,77,27,0,-1,1,99,77,0,17,88,56,77,77,17,2,2277,27,-1,0,0,1};

        int m = array1.length;

        System.out.println(array1.getClass().isArray());

        Int_Arrary_List A = new Int_Arrary_List();

        System.out.println("--------------------------------");
        A.Display_Int_Array("数组 array1 = ",array1,"\n");

        System.out.println("取数组的第一个值 = "+A.Get_First_Data(array1));

        System.out.println("取数组的最后一个值 = "+A.Get_Last_Data(array1));

        System.out.println("取数组的第五个值 = "+A.Get_Data(array1,5));

        System.out.println("取数组最大值 = "+A.Find_Max(array1));

        System.out.println("取数组最小值 = "+A.Find_Min(array1));

        System.out.println("--------------------------------");
        A.Display_Int_Array("数组 array1 = ",array1);
        System.out.print("删除最大值 "+A.Find_Max(array1)+" 后为：");
        A.Display_Int_Array(A.Delete_Max_Data(array1),"\r");
        

        System.out.println("--------------------------------");
        int[] array2 = {1,9,9,9,9,0,0,-1,-1,9,1,2,0,0};
        A.Display_Int_Array("数组 array2 = ",array2,"\r");
        System.out.print("删除最大值 "+A.Find_Max(array2)+" 后为：");
        A.Display_Int_Array(A.Delete_Max_Data(array2),"\r");

        System.out.println("--------------------------------");
        A.Display_Int_Array("数组 array1 = ",array1,"\r");
        System.out.print("删除最小值 "+A.Find_Min(array1)+" 后为：");
        A.Display_Int_Array(A.Delete_Min_Data(array1),"\r");

        System.out.println("--------------------------------");
        A.Display_Int_Array(array2);
        System.out.print("删除最小值 "+A.Find_Min(array2)+" 后为：");
        A.Display_Int_Array(A.Delete_Min_Data(array2),"\r");

        System.out.println("--------------------------------");
        A.Display_Int_Array("数组 array1 = ",array1,"\n");
        System.out.println("数组中有多少个大于50的数据元素："+A.How_Many_Max_X(array1,50)+"\n");
        A.Display_Int_Array("删除数组中大于50的数组元素: ",A.Delete_If_Max_X(array1,50),"\n");

        A.Display_Int_Array("查找数组中小于50的数据元素：",A.Find_If_Min_X(array1,50),"\n");

        System.out.println("数组中有多少个小于50的数据元素："+A.How_Many_Min_X(array1,50)+"\n");
        A.Display_Int_Array("删除数组中小于50的数组元素: ",A.Delete_If_Min_X(array1,50),"\n");

        A.Display_Int_Array("查找数组中大于50的数据元素：",A.Find_If_Max_X(array1,50),"\r");

        System.out.println("--------------------------------");
        A.Display_Int_Array("数组 array1 = ",array1,"\n");
        A.Display_Int_Array("查找数组array1中重复的数组元素：",A.Find_Duplication(array1));
        System.out.println();
        A.Display_Int_Array("数组 array2 = ",array2,"\n");
        A.Display_Int_Array("查找数组array2中重复的数组元素：",A.Find_Duplication(array2),"\r");

        System.out.println("--------------------------------");
        A.Display_Int_Array("数组 array1 = ",array1,"\n");
        A.Display_Int_Array("删除数组中重复的数据元素：",A.Delete_Duplication(array1));

        System.out.println("--------------------------------");
        A.Display_Int_Array("数组 array2 = ",array2,"\n");
        A.Display_Int_Array("删除数组中重复的数据元素：",A.Delete_Duplication(array2));

        System.out.println("--------------------------------");
        A.Display_Int_Array("数组 array1 = ",array1,"\n");
        A.Display_Int_Array("删除数组中的第五个数据元素：",A.Delete_Data(array1,5));

        System.out.println("--------------------------------");
        A.Display_Int_Array("数组 array1 = ",array1,"\n");
        A.Display_Int_Array("删除数组中的第四个数据元素：",A.Delete_Data(array1,4));

        System.out.println("--------------------------------");
        System.out.println("            下面看空数组          ");
        System.out.println("--------------------------------");
        array1 = A.Empty_List(array1);

        //System.out.println("数组长度为 ："+array2.length);
        System.out.println("此数组长度为 ："+A.List_Length(array1));
        System.out.println("此数组是否为空 ："+A.Is_List_Empty(array1));

        System.out.println("--------------------------------");
        System.out.println("取数组的第一个值 = "+A.Get_First_Data(array1));
        System.out.println("取数组的最后一个值 = "+A.Get_Last_Data(array1));

        System.out.println("--------------------------------");
        System.out.println("取数组的第一个值 = "+A.Get_Data(array1,1));
        System.out.println("取数组的第二个值 = "+A.Get_Data(array1,2));
        //System.out.println("取数组的第一个值 = "+array2[0]); //空数组array2，取任意数据元素报错，超出边界
        //System.out.println("取数组的第一个值 = "+array2[1]);

        System.out.println("--------------------------------");
        System.out.println("取数组最大值 = "+A.Find_Max(array1));
        System.out.println("取数组最小值 = "+A.Find_Min(array1));

        System.out.println("--------------------------------");
        A.Display_Int_Array(array2);
        System.out.print("在第7个数据元素之前是有存在数据元素-1？");
        System.out.println(A.Exist_X_Before_Y(array2,-1,7));
        System.out.print("在第8个数据元素之前是有存在数据元素-1？");
        System.out.println(A.Exist_X_Before_Y(array2,-1,8));
        System.out.print("在第9个数据元素之前是有存在数据元素-1？");
        System.out.println(A.Exist_X_Before_Y(array2,-1,9));

        System.out.println("--------------------------------");
        int array3[] = {5,7,3,77,27,0,-1,1,99,77,0,17,88,56,77,77,17,2,2277,27,-1,0,0,1};
        A.Display_Int_Array("数组 array3 = ",array3);
        A.Display_Int_Array("sort 数组 array3 后 = ",A.Sort_Max_To_Min(array3));

        int[] array4 = {1,9,9,9,9,0,0,-1,-1,9,1,2,0,0};
        A.Display_Int_Array("数组 array4 = ",array4,"\r");
        A.Display_Int_Array("sort 数组 array4 后 = ",A.Sort_Max_To_Min(array4));
    }
}
