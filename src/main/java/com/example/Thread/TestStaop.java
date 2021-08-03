package com.example.Thread;


import com.example.oop.demo01;
import org.springframework.beans.factory.annotation.Autowired;

// 1.建议线程正常停止
//   2.建议使用标志位
public class TestStaop implements  Runnable{

    //设置标志位
    private  boolean flag = true;
    @Autowired
    demo01 demo01;

    public void run() {
        int i = 0;
        while (flag){
            System.out.println("run////////Thread"+ i++);
        }
    }
    // 设置一个公开的方法停止线程，转换标准位
    public void stop(){
        this.flag = false;
    }

    public static void main(String[] args) {
        TestStaop test = new TestStaop();

        new Thread(test).start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("main////////Thread"+ i++);

            if (i >= 900) {
                test.stop();
            }

        }
    }
}
