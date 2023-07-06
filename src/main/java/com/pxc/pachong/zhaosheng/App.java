package com.pxc.pachong.zhaosheng;

import com.alibaba.excel.EasyExcel;
import com.pxc.pachong.zhaosheng.dto.School;
import org.apache.commons.compress.utils.Lists;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.text.MessageFormat;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * @author pengxincheng
 * @date 2023/6/20 11:01
 */
public class App {

    static String  URL = "http://jxjy.moe.edu.cn/admission/index?endTime=2023&province=884c48e9-4446-11eb-806b-02420a410002&schoolName=1&professionalName=&page={0}";
    public static void main(String[] args) throws Exception{

        List<School> schools = Lists.newArrayList();

         for (int j = 1; j <=26 ; j++) {
             String url = MessageFormat.format(URL,j);
             Document document = Jsoup.connect(url).get();
             Elements tables = document.getElementsByTag("table");

             if(Objects.nonNull(tables) && tables.size() > 0){
                 Element table = tables.get(0);

                 Elements trs =  table.getElementsByTag("tr");

                 for (int i = 0; i < trs.size(); i++) {
                     if(i == 0){
                         continue;
                     }
                     Element tr = trs.get(i);
                     Elements tds =  tr.getElementsByTag("td");
                     if(tds.size() > 0){
                         School school = new School();
                         school.setName(tds.get(1).text());
                         school.setNo(tds.get(2).text());
                         school.setProvince(tds.get(3).text());
                         school.setMajorNo(tds.get(4).text());
                         school.setMajorName(tds.get(5).text());
                         school.setLevel(tds.get(6).text());
                         school.setLearnStyle(tds.get(7).text());
                         schools.add(school);
                     }
                 }

             }

             TimeUnit.SECONDS.sleep(2);
        }



        EasyExcel.write("学校信息.xlsx",School.class).sheet("学校信息").doWrite(schools);

    }
}
