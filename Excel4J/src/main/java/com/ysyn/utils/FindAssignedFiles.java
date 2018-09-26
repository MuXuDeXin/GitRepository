package com.ysyn.utils;

import java.io.File;
import java.util.List;

public class FindAssignedFiles {
    /* **********************使用步骤**********************
     * 1、定义查找文件夹的路径
     *    String baseDIR = "F:\\output\\水电运行汇总日报";
     * 2、定义查找文件的扩展名类型
     *    String fileExtendName = "*.xlsx";
     * 3、定义接收匹配文件的list
     *    List<String> resultList = new ArrayList<>();
     * 4、调用方法查找
     *    findFiles(baseDIR,fileExtendName,resultList);
     * ************************使用步骤**********************
     */
    /**
     * 递归查找文件
     * @param baseDirName  查找的文件夹路径
     * @param fileExtendName  需要查找的文件扩展名
     * @param fileList  查找到的文件集合
     */
    public static List<String> findFiles(String baseDirName, String fileExtendName, List<String> fileList) {
        File baseDir = new File(baseDirName);       // 创建一个File对象
        if (!baseDir.exists() || !baseDir.isDirectory()) {  // 判断目录是否存在
            System.out.println("文件查找失败：" + baseDirName + "不是一个目录！");
        }
        String tempName;
        //判断目录是否存在
        File tempFile;
        File[] files = baseDir.listFiles();
        for (int i = 0; i < (files != null ? files.length : 0); i++) {
            tempFile = files[i];
            if(tempFile.isDirectory()){
                findFiles(tempFile.getAbsolutePath(), fileExtendName, fileList);
            }else if(tempFile.isFile()){
                tempName = tempFile.getName();
                if(wildcardMatch(fileExtendName, tempName)){
                    // 匹配成功，将文件名添加到结果集
                    fileList.add(tempFile.getAbsoluteFile().toString().replace("\\","\\\\"));
                }
            }
        }
        return fileList;
    }

    /**
     * 通配符匹配
     * @param pattern    通配符模式
     * @param str    待匹配的字符串
     * @return    匹配成功则返回true，否则返回false
     */
    private static boolean wildcardMatch(String pattern, String str) {
        int patternLength = pattern.length();
        int strLength = str.length();
        int strIndex = 0;
        char ch;
        for (int patternIndex = 0; patternIndex < patternLength; patternIndex++) {
            ch = pattern.charAt(patternIndex);
            if (ch == '*') {
                //通配符星号*表示可以匹配任意多个字符
                while (strIndex < strLength) {
                    if (wildcardMatch(pattern.substring(patternIndex + 1), str.substring(strIndex))) {
                        return true;
                    }
                    strIndex++;
                }
            } else if (ch == '?') {
                //通配符问号?表示匹配任意一个字符
                strIndex++;
                if (strIndex > strLength) {
                    //表示str中已经没有字符匹配?了。
                    return false;
                }
            } else {
                if ((strIndex >= strLength) || (ch != str.charAt(strIndex))) {
                    return false;
                }
                strIndex++;
            }
        }
        return (strIndex == strLength);
    }
}
