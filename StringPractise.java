package cn.itcast.day08;
public class StringPractise {
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        String str = getString(arr);
        System.out.println(str);
    }
    public static String getString(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                str += "word"+arr[i]+"]";
            }else
            str +="word"+arr[i]+"#";
        }
        return str;
    }
}