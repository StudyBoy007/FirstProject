package com.BigHomeWork.ThreeHomeWork.beans.ServicePackage;

import com.BigHomeWork.ThreeHomeWork.beans.MoblieCard;
import com.BigHomeWork.ThreeHomeWork.impl.CallService;
import com.BigHomeWork.ThreeHomeWork.impl.NetService;
import com.BigHomeWork.ThreeHomeWork.impl.SendService;

/**
 * Create by czq
 * time on 2019/6/30  19:50
 */
public class SuperPackage extends ServicePackage implements CallService, SendService, NetService {
    public int talkTime;
    public int smsCount;
    public int flow;

    public SuperPackage() {
        this.price = 78;
        this.flow = 1;
        this.smsCount = 50;
        this.talkTime = 200;
    }

    @Override
    public void showInfo() {

        System.out.println("超人套餐的通话时长为：" + talkTime + "分钟/月\t短信条数为：" + smsCount + "条/月\t流量为：" + flow + "GB/月\t资费为：" + price + "元/月");
    }

    @Override
    public int call(int minCount, MoblieCard card) {
        return 0;
    }

    @Override
    public int netPlay(int flow, MoblieCard card) {
        return 0;
    }

    @Override
    public int send(int count, MoblieCard card) {
        return 0;
    }
}
