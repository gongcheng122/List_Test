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
        int x = 0;
        int y = ary.length;
        int duplication[];
        return ary;
    }

    //删除数组中重复的数据元素（保留重复数据元素中的一个）
    @Override
    public void Delete_Duplication() {
        super.Delete_Duplication();
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
    public int How_Many_Max_Data(int[] ary, int x) {
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

    //找出数组中大于x的数据元素
    @Override
    public int[] delete_if_min_data(int[] ary ,int x) {
        int m = How_Many_Max_Data(ary,x);
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
    public int[] Delete_If_Max_Data(int[] ary, int x) {
        int m = How_Many_Max_Data(ary,x);
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
            System.out.println("数组数据元素如下：");
            for (int x = 0; x < ary.length; x++) {
                System.out.print(ary[x]);
                System.out.print(" ");
            }
        }
        System.out.println();
    }


}