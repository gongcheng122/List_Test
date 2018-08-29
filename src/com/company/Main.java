package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int array1[] = {5,7,3,1,99,17,88,56,77,77,17,2,2277,27,-1};
        int array2[] = {};
        int m = array1.length;

        System.out.println(array1.getClass().isArray());

        Int_Arrary_List A = new Int_Arrary_List();

        System.out.println("--------------------------------");
        System.out.println(A.Is_List_Empty(array2));
        System.out.println("此数组长度为 ："+A.List_Length(array2));
        System.out.println("此数组是否为空 ："+A.Is_List_Empty(array2));

        System.out.println("--------------------------------");
        System.out.println("取数组的第一个值 = "+A.Get_First_Data(array2));
        System.out.println("取数组的最后一个值 = "+A.Get_Last_Data(array2));

        System.out.println("--------------------------------");
        System.out.println("取数组的第一个值 = "+A.Get_Data(array2,1));
        System.out.println("取数组的第二个值 = "+A.Get_Data(array2,2));
        //System.out.println("取数组的第一个值 = "+array2[0]); //空数组array2，取任意数据元素报错，超出边界
        //System.out.println("取数组的第一个值 = "+array2[1]);

        System.out.println("--------------------------------");
        System.out.println("取数组最大值 = "+A.Find_Max(array2));
        System.out.println("取数组最小值 = "+A.Find_Min(array2));


        System.out.println("--------------------------------");

        System.out.println("取数组的第一个值 = "+A.Get_First_Data(array1));

        System.out.println("取数组的最后一个值 = "+A.Get_Last_Data(array1));

        System.out.println("取数组的第五个值 = "+A.Get_Data(array1,5));

        System.out.println("取数组最大值 = "+A.Find_Max(array1));

        System.out.println("取数组最小值 = "+A.Find_Min(array1));

    }
}
