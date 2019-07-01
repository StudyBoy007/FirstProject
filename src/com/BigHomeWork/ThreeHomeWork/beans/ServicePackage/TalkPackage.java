package com.BigHomeWork.ThreeHomeWork.beans.ServicePackage;

import com.BigHomeWork.ThreeHomeWork.beans.MoblieCard;
import com.BigHomeWork.ThreeHomeWork.impl.CallService;
import com.BigHomeWork.ThreeHomeWork.impl.SendService;

/**
 * Create by czq
 * time on 2019/6/30  19:40
 */
public class TalkPackage extends ServicePackage implements CallService, SendService {
    public int talkTime;
    public int smsCount;

    public TalkPackage() {
        this.price = 58;
        this.talkTime = 500;
        this.smsCount = 30;
    }

    @Override
    public void showInfo() {

        System.out.println("话痨套餐的通话时长为：" + talkTime + "分钟/月\t短信条数为：" + smsCount + "条/月\t资费为：" + price + "元/月");
    }

    @Override
    public int call(int minCount, MoblieCard card) {
        return 0;
    }

    @Override
    public int send(int count, MoblieCard card) {
        return 0;
    }
}
