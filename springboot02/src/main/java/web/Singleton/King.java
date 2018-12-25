package web.Singleton;

import com.sun.tools.internal.xjc.reader.Ring;

/**
 * @version V1.0.1
 * @classname King
 * @description:
 * @author: longcong
 * @email: longcong@aliyun.com
 * @date: 2018-12-20  10:18
 **/
public class King {
   /*     //饿汉式1
    private static final King king = new King();

    public static King getIntance(){
        return king;
    }*/
   //懒汉式

/*    private static King king;

    public static synchronized King getIntance(){
        if(king == null){
            king =  new King();
        }
        return king;
    }*/


//双重校验锁模式
 /*   private static  King king;


    public static  King getInstance(){
        if(king == null){
            synchronized (King.class){
                if(king == null){
                    king = new King();
                }
            }

        }
        return  king;
    }*/

 //静态内部类模式
/* private King() {
 }
     static class Ring {

         public static final King king = new King();

    }


    public static King getInstance(){
         return  Ring.king;
    }*/
}
