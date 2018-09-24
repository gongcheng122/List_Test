package com.company;

public class Int_Arrary_List extends Array_List implements Int_Arrary_List_Interface {

    //查看数组的长度
    @Override
    public int List_Length(int[] arrayA) {
        return arrayA.length;
    }

    @Override
    public boolean Insert_Data(int[] arrayA, int x, int y) {
        if (x - 1 <= arrayA.length) {

        }
        return false;
    }

    //查看数组的第一个数据元素
    @Override
    public int Get_First_Data(int[] ary) {
        if (Is_List_Empty(ary)) {
            return 0;
        } else {
            return ary[0];
        }

    }

    //查看数组的最后一个数据元素
    @Override
    public int Get_Last_Data(int[] ary) {
        if (Is_List_Empty(ary)) {
            return 0;
        }
        int x = ary.length;
        return ary[x - 1];
    }

    //取数组中第x个数据元素
    @Override
    public int Get_Data(int[] ary, int x) {
        if (Is_List_Empty(ary)) {
            return 0;//如果数组为空，取任意数据元素结果返回 0
        } else {
            if (x == 0) {
                return ary[0];
            } else if (x < ary.length) {
                return ary[x - 1];
            } else {
                return 0;
            }
        }
    }

    //将数组中重复的数据元素重新组成一个新的数组
    @Override
    public int[] Find_Duplication(int[] ary) {

        int ary_length = ary.length;
        //算出一个和ary等长的而且包含ary中重复元素的新数组
        int dup1[] = new int[ary_length];
        int y = 0;
        for(int x = 0;x<ary_length;x++) {
            //如果数组ary中的ary[x]的个数大于1 且 数组dup中不含有ary[x] ，则将数据元素ary[x]赋予记录重复数据元素的数组dup1中
            //下面的for循环，如果ary[x] == 0，则!Exist_X(dup1,ary[x]始终为false，不会执行
            if(How_Many_X(ary,ary[x])>1 & !Exist_X(dup1,ary[x])){
                //System.out.println(ary[x]);
                dup1[y] = ary[x];
                y++;
            }
        }

//        System.out.println("y = "+y);
//        System.out.print("dup1 = ");
//        Display_Int_Array(dup1);

        //算出重复数组的长度
        if(How_Many_X(ary,0)>1){
            y = y+1;
        }
        int newLength = y;
//        System.out.println(newLength);

        //给重复数组赋值
        int[] Dup_array = new int[newLength];
        for(int x = 0;x<newLength;x++){
            Dup_array[x] =dup1[x];
        }
        return Dup_array;
    }

    //需要传入一个Object数组，然后返回去重后的数组
    @Override
    public  int[] Delete_Duplication(int[] arr){
        //用来记录去除重复之后的数组长度和给临时数组作为下标索引
        int t = 0;
        //临时数组
        int[] tempArr = new int[arr.length];
        //遍历原数组
        for(int i = 0; i < arr.length; i++){
            //声明一个标记，并每次重置
            boolean isTrue = true;
            //内层循环将原数组的元素逐个对比
            for(int j=i+1;j<arr.length;j++){
                //如果发现有重复元素，改变标记状态并结束当次内层循环
                if(arr[i]==arr[j]){
                    isTrue = false;
                    break;
                }
            }
            //判断标记是否被改变，如果没被改变就是没有重复元素
            if(isTrue){
                //没有元素就将原数组的元素赋给临时数组
                tempArr[t] = arr[i];
                //走到这里证明当前元素没有重复，那么记录自增
                t++;
            }
        }
        //Display_Int_Array(tempArr);
        //声明需要返回的数组，这个才是去重后的数组
        int[]  newArr = new int[t];
        //用arraycopy方法将刚才去重的数组拷贝到新数组并返回
        System.arraycopy(tempArr,0,newArr,0,t);
        return newArr;
    }

    //判断数组在第y个元素之前（包含第y个数据元素）是否含有等于
    @Override
    public boolean Exist_X_Before_Y(int[] ary,int x,int y){
        if(y == 0){
            return false;
        }
        if(!Is_List_Empty(ary)){
            for(int m =0;m<y;m++){
                if(ary[m] == x){
                    return true;
                }
            }
        }
        return false;
    }

    //数组中是否含有等于x的数据元素
    @Override
    public boolean Exist_X(int[] ary,int x){
        boolean f = false;
        if(!Is_List_Empty(ary)){
            for(int y = 0;y<ary.length;y++){
                if(ary[y] == x){
                    f = true;
                }
            }
        }
        return f;
    }

    //数组中含有等于x的数据元素有多少个
    @Override
    public int How_Many_X(int[] ary,int x){
        int count = 0;
        for(int y = 0;y<ary.length;y++){
            if(ary[y] == x){
                count++;
            }
        }
        return count;
    }

    //清空数组
    @Override
    public int[] Empty_List(int[] ary) {
        return new int[]{};
    }

    //删去数组中的第x个数据元素
    @Override
    public int[] Delete_Data(int[] ary, int x) {
        int m = ary.length;
        if (Is_List_Empty(ary)) {
            return new int[]{};
        }
        if ((x - 1 > m) & x < 0) {
            return ary;
        }
        int new_ary[] = new int[m - 1];
        int c = 0;
        for (int y = 0; y < m; y++) {
            if (y != x - 1) {
                //System.out.println(ary[y]);
                new_ary[c] = ary[y];
                //System.out.print(max_ary[c]);
                //System.out.print(' ');
                c++;
            }
        }
        return new_ary;
    }

    //删去数组中等于x的数据元素
    @Override
    public int[] Delete_The_X(int[] ary,int x){
        int a;
        int b = 0;
        //计算数组中含有多少个X
        for (int y = 0; y < ary.length; y++) {
            if (ary[y] == x) {
                b++;
            }
        }
        //System.out.println("数组中含有 "+b+" 个X : "+x);
        //System.out.println("新数组长度为 ： "+(ary.length-b));
        int max_ary[] = new int[ary.length - b];
        int c = 0;
        //将数组中非X的数据元素赋予新的数组
        for (int y = 0; y < ary.length; y++) {
            if (ary[y] != x) {
                //System.out.println(ary[y]);
                max_ary[c] = ary[y];
                //System.out.print(max_ary[c]);
                //System.out.print(' ');
                c++;
            }
        }
        return max_ary;
    }

    /*//数组中的数据元素从大到小排序
    @Override
    public boolean Sort_Max_To_Min(int[] arrayA) {
        return super.Sort_Max_To_Min(arrayA);
    }

    //数组中的数据元素从小到大排序
    @Override
    public boolean Sort_Min_To_Max(int[] arrayA) {
        return super.Sort_Min_To_Max(arrayA);
    }*/

    //取数组中的最大值
    @Override
    public int Find_Max(int[] ary) {
        if (Is_List_Empty(ary)) {
            return 0;//如果数组为空，查找最大数据元素结果返回 0
        } else {
            int x = ary.length;
            int max = 0;
            for (int m = 0; m < x; m++) {
                if (ary[m] > max) {
                    max = ary[m];
                }
            }
            return max;
        }
    }

    //删除数组最大的值
    @Override
    public int[] Delete_Max_Data(int[] ary) {
        int x = Find_Max(ary);
        //System.out.println(x);
        if (x == 0) {
            System.out.print("此数组为空！");
            return new int[]{};
        } else {
            return Delete_The_X(ary,x);
        }
    }

    //删除数组中最小的数据
    @Override
    public int[] Delete_Min_Data(int ary[]) {
        int x = Find_Min(ary);
        if (x == 0) {
            return new int[]{};
        } else {
            return Delete_The_X(ary,x);
        }

    }

    //求数组中大于x的数据元素有多少个
    @Override
    public int How_Many_Max_X(int[] ary, int x) {
        int length = ary.length;
        //System.out.println(x);
        if (length == 0) {
            System.out.print("此数组为空！WWW");
            return 0;
        } else {
            int a = 0;
            //计算数组中含有多少个大于x的数据元素
            for (int y = 0; y < length; y++) {
                if (ary[y] > x) {
                    a++;
                }
            }
            return a;
        }
    }

    @Override
    public int How_Many_Min_X(int[] ary, int x) {
        int length = ary.length;
        //System.out.println(x);
        if (length == 0) {
            System.out.print("此数组为空！WWW");
            return 0;
        } else {
            int a = 0;
            //计算数组中含有多少个大于x的数据元素
            for (int y = 0; y < length; y++) {
                if (ary[y] < x) {
                    a++;
                }
            }
            return a;
        }
    }

    //找出数组中大于x的数据元素
    @Override
    public int[] Delete_If_Min_X(int[] ary ,int x) {
        int m = How_Many_Max_X(ary,x);
        int[] new_ary = new int[m];
        int c=0;
        for(int y = 0;y<ary.length;y++){
            if(ary[y]>x){
                new_ary[c] = ary[y];
                c++;
            }
        }
        return new_ary;
    }

    //删除数组中大于x的数据元素
    @Override
    public int[] Delete_If_Max_X(int[] ary, int x) {
        int m = How_Many_Max_X(ary,x);
        int new_length = ary.length-m;
        int[] new_ary = new int[new_length];
        int c=0;
        for(int y = 0;y<ary.length;y++){
            if(ary[y]<x){
                new_ary[c] = ary[y];
                c++;
            }
        }
        return new_ary;
    }

    //查询数组中最小的数据元素
    @Override
    public int Find_Min(int[] ary) {
        if (Is_List_Empty(ary)) {
            return 0;//如果数组为空，查找最小数据元素结果返回 0
        } else {
            int x = ary.length;
            int min = ary[0];
            for (int m = 0; m < x; m++) {
                if (ary[m] < min) {
                    min = ary[m];
                }
            }
            return min;
        }
    }

    @Override
    public int[] Find_If_Min_X(int[] ary, int x) {
        return Delete_If_Max_X(ary,x);
    }

    @Override
    public int[] Find_If_Max_X(int[] ary, int x) {
        return Delete_If_Min_X(ary,x);
    }

    //数组中的数据元素从大到小排序
    @Override
    public int[] sort_max_to_min(int[] ary) {
        return new int[] {};
    }

    //数组中的数据元素从小到大排序
    @Override
    public int[] sort_min_to_max(int[] ary) {
        return new int[] {};
    }

    //显示数组中的各个数据元素
    @Override
    public void Display_Int_Array(int[] ary) {
        if (Is_List_Empty(ary)) {
            System.out.println("数组为空！");
        } else {
            //System.out.println("数组数据元素如下：");
            for (int x = 0; x < ary.length; x++) {
                System.out.print(ary[x]);
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public void Display_Int_Array(int[] ary,String str) {
        Display_Int_Array(ary);
        System.out.print(str);
    }

    public void Display_Int_Array(String str, int[] ary) {
        //System.out.print("debug");
        System.out.print(str);
        Display_Int_Array(ary);
    }

    public void Display_Int_Array(String str1, int[] ary, String str2) {
        System.out.print(str1);
        Display_Int_Array(ary,str2);
    }
}