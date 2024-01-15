package com.yupi.generator;

import com.yupi.model.MainTemplateConfig;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


/**
动态文件生成器
 */
public class DynamicGenerator {
    public static void main(String[] args) {

    }

    public static void doGenerator(String inputPath,String outputPath,Object model) throws IOException , TemplateException {
        //创建Configuration对象，参数为版本号
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_32);

        File tempalteDir = new File(inputPath).getParentFile();
        configuration.setDirectoryForTemplateLoading(tempalteDir);

        //设置模板所用的文符集
        configuration.setDefaultEncoding("utf-8");

        configuration.setNumberFormat("0.######");

        //创建模板对象，加载模板
        String templateName = new File(inputPath).getName();
        Template template = configuration.getTemplate(templateName);

        Writer out = new FileWriter(outputPath);

        template.process(model, out);

        out.close();
    }
}
