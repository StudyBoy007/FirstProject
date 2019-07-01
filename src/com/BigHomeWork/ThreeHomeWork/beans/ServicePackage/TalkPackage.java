package com.BigHomeWork.ThreeHomeWork.beans.ServicePackage;

import com.BigHomeWork.ThreeHomeWork.beans.MoblieCard;
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
        ServicePackage setPackage = card.setPackage;
        TalkPackage talkPackage = (TalkPackage) setPackage;
        if (talkPackage.talkTime >= minCount) {
            card.realTalkTime += minCount;
            return 1;
        } else {
            int over = minCount - talkPackage.talkTime;
            if ((over * 0.2) <= card.money) {
                card.realTalkTime += minCount;
                card.money -= over * 0.2;
                return 2;
            } else {
                try {
                    throw new Exception("本次通话了" + (talkPackage.talkTime + Math.floor(card.money / 0.2)) + "分钟,您的余额不足,请充值后在使用！");
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    card.realTalkTime += talkPackage.talkTime + (int) Math.floor(card.money / 0.2);
                    return 3;
                }
            }
        }
    }

    @Override
    public int send(int count, MoblieCard card) {
        ServicePackage setPackage = card.setPackage;
        TalkPackage talkPackage = (TalkPackage) setPackage;
        if (talkPackage.smsCount >= count) {
            card.realSMSCount += count;
            return 1;
        } else {
            int over = count - talkPackage.smsCount;
            if ((over * 0.1) <= card.money) {
                card.realSMSCount += count;
                card.money -= over * 0.1;
                return 2;
            } else {
                try {
                    throw new Exception("本次短信发了" + (talkPackage.smsCount + Math.floor(card.money / 0.1)) + "条,您的余额不足,请充值后在使用！");
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    card.realSMSCount += talkPackage.smsCount + (int) Math.floor(card.money / 0.1);
                    return 3;
                }
            }
        }
    }
}
