package zzz.study.utils;
import java.util.*;
/**
 * describe: TODO
 * @creat_user: c_huangzhijun
 * creat_date: 2018/1/14
 * creat_time: 13:01
 **/
public class NewMapUtil {
    /**
     * 将map的值转换成字符串类型
     * @param map
     * @return
     */
    public static Map<String,String> transMap(Map<String,Object> map){
        if(map ==null){return  null;}
        Map<String,String> result = new HashMap<>();
        map.forEach(
                (k,v)->result.put(k,v!=null ? v.toString():null)
        );
        return result;
    }
    /**
     * 将两个Map里面相同的key的值合并为列表
     * eg. src = ["id": 1, "detail": "haha111", "extra":"extra111"] ,
     * dest = ["id": 2, "detail": "haha222", "another": "another222"]
     * merge 之后返回 ["id": [1,2], "detail": ["haha111", "haha222"], "extra":"extra111", "another": "another222"]
     * @param src
     * @param dest
     * @return
     */
    public static Map<String,?extends Object> merge(Map<String,?extends Object>src,Map<String,?extends Object> dest){
        if(src==null || src.size()==0){return dest;}
        if (dest ==null || dest.size() == 0 ){return dest;}
        Map<String,Object> result = new HashMap<>();
        src.forEach(
                (key,value)->{
                    Object valueDesc = dest.get(key);
                    if(valueDesc != null){
                        result.put(key,mergeToList(value,valueDesc));
                    }
                    else {
                        result.put(key,value);
                    }
                }
        );
        dest.forEach(
                (key,value)->{
                    if(result.get(key) == null){
                        result.put(key,value);
                    }
                }
        );
        return result;
    }
    public static List mergeToList(Object src,Object ...args){
        List valList = new ArrayList();
        add(valList,src);
        for (Object arg:args){
            add(valList,arg);
        }
        return valList;
    }
    public static List add(List valList,Object src){
        if(src == null){return valList ;}
        if(src instanceof List){
            valList.addAll((List) src);
        }
        else {
            valList.add(src);
        }
        return valList;
    }
}
