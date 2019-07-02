package com.BigHomeWork.ThreeHomeWork.beans.ServicePackage;

import com.BigHomeWork.ThreeHomeWork.beans.MoblieCard;
import com.BigHomeWork.ThreeHomeWork.impl.NetService;

/**
 * Create by czq
 * time on 2019/6/30  19:46
 */
public class NetPackage extends ServicePackage implements NetService {
    public int flow;

    public NetPackage() {
        this.flow = 3;
        this.price = 68;
    }

    @Override
    public void showInfo() {
        this.flow = 3;
        System.out.println("网虫套餐的上网流量为：" + flow + "GB/月\t资费为：" + price + "元/月");
    }

    @Override
    public int netPlay(int flow, MoblieCard card) {
        ServicePackage setPackage = card.setPackage;
        NetPackage netPackage = (NetPackage) setPackage;
        if (netPackage.flow - card.realFlow >= flow) {
            card.realFlow += flow;
            return 1;
        } else {

            int x = netPackage.flow - card.realFlow > 0 ? netPackage.flow - card.realFlow : 0;
            int over = flow - x;
            if ((over * 0.1) <= card.money) {
                card.realFlow += flow;
                card.money -= over * 0.1;
                return 2;
            } else {
                try {
                    throw new Exception("本次上网花费了" + (x + Math.floor(card.money / 0.1)) + "MB,您的余额不足,请充值后在使用！");
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    card.realFlow += x + (int) Math.floor(card.money / 0.1);
                    return 3;
                }
            }
        }
    }
}
