package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        String str = "{1001!ncye}+{1002!ncye}+{1009!ncye}";

        System.out.println(str.indexOf("!"));
        System.out.println(str.substring(6));


        String kmdmCont = "{1621!ncye}-{1622!ncye}";
        Pattern pattern = Pattern.compile("(?<=\\{)(.+?)(?=\\})");
        Matcher matcher = pattern.matcher(kmdmCont);
        while (matcher.find()) {

            String s = matcher.group();
            System.out.println("s:::" + s);
            /*ls.add(s);
            String _v = getKmdmSignValue("{" + s + "}",dygInfo); // 获取具体单元格的值*/
        //    kmdmCont = kmdmCont.replace("{" + s + "}", _v +"M");//数字末尾加M，是为了精度记录
            System.out.println(kmdmCont);
        }
    }
}
