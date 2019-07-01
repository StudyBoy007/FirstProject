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
        ServicePackage setPackage = card.setPackage;
        SuperPackage superPackage = (SuperPackage) setPackage;
        if (superPackage.talkTime >= minCount) {
            card.realTalkTime += minCount;
            return 1;
        } else {
            int over = minCount - superPackage.talkTime;
            if ((over * 0.2) <= card.money) {
                card.realTalkTime += minCount;
                card.money -= over * 0.2;
                return 2;
            } else {
                try {
                    throw new Exception("本次通话了" + (superPackage.talkTime + Math.floor(card.money / 0.2)) + "分钟,您的余额不足,请充值后在使用！");
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    card.realTalkTime += superPackage.talkTime + (int) Math.floor(card.money / 0.2);
                    return 3;
                }
            }
        }
    }

    @Override
    public int netPlay(int flow, MoblieCard card) {
        ServicePackage setPackage = card.setPackage;
        SuperPackage superPackage = (SuperPackage) setPackage;
        if (superPackage.flow >= flow) {
            card.realFlow += flow;
            return 1;
        } else {
            int over = flow - superPackage.flow;
            if ((over * 0.1) <= card.money) {
                card.realFlow += flow;
                card.money -= over * 0.1;
                return 2;
            } else {
                try {
                    throw new Exception("本次上网花费了" + (superPackage.flow * 1024 + Math.floor(card.money / 0.1)) + "MB,您的余额不足,请充值后在使用！");
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    card.realFlow += superPackage.flow + (int) Math.floor(card.money / 0.1);
                    return 3;
                }
            }
        }
    }

    @Override
    public int send(int count, MoblieCard card) {
        ServicePackage setPackage = card.setPackage;
        SuperPackage superPackage = (SuperPackage) setPackage;
        if (superPackage.smsCount >= count) {
            card.realSMSCount += count;
            return 1;
        } else {
            int over = count - superPackage.smsCount;
            if ((over * 0.1) <= card.money) {
                card.realSMSCount += count;
                card.money -= over * 0.1;
                return 2;
            } else {
                try {
                    throw new Exception("本次短信发了" + (superPackage.smsCount + Math.floor(card.money / 0.1)) + "条,您的余额不足,请充值后在使用！");
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    card.realSMSCount += superPackage.smsCount + (int) Math.floor(card.money / 0.1);
                    return 3;
                }
            }
        }
    }
}
