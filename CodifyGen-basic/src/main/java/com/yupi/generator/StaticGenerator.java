package com.yupi.generator;

import cn.hutool.core.io.FileUtil;

import java.io.File;

/**
静态文件生成器
 */
public class StaticGenerator {
    public static void main(String[] args) {
        String ProjectPath = System.getProperty("user.dir");
        //输入路径
        String inputPath = ProjectPath + File.separator+"CodifyGen-demo-projects"+ File.separator +"acm-template";
        System.out.println(inputPath);
        //输出路径
        String outputPath = ProjectPath;
        //copyfilebyhutool(inputPath,outputPath);
    }

    public static void copyfilebyhutool(String inputPath,String outputPath) {
        FileUtil.copy(inputPath, outputPath, false);
    }
}
