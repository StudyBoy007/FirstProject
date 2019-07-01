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
        this.price = 58;
        this.flow = 3;
        System.out.println("网虫套餐的上网流量为：" + flow + "GB/月\t资费为：" + price + "元/月");
    }

    @Override
    public int netPlay(int flow, MoblieCard card) {
        return 0;
    }
}
