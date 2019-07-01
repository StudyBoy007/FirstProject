package com.BigHomeWork.ThreeHomeWork.Utility;

import com.BigHomeWork.ThreeHomeWork.beans.Consuminfo;
import com.BigHomeWork.ThreeHomeWork.beans.MoblieCard;
import com.BigHomeWork.ThreeHomeWork.beans.ServicePackage.NetPackage;
import com.BigHomeWork.ThreeHomeWork.beans.ServicePackage.ServicePackage;
import com.BigHomeWork.ThreeHomeWork.beans.ServicePackage.SuperPackage;
import com.BigHomeWork.ThreeHomeWork.beans.ServicePackage.TalkPackage;
import org.junit.Test;
import sun.nio.ch.Net;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.*;

/**
 * Create by czq
 * time on 2019/6/30  20:12
 */
public class CardUtil {
    public static Map<String, MoblieCard> cards = new HashMap<>();
    public static Map<String, List<Consuminfo>> consumInfos = new HashMap<>();

    public void initScene() {

    }

    public boolean isExistCard(String number, String password) {
        return false;
    }

    public boolean isExistCard(String number) {
        return false;
    }

    public String createNumber() {
        return null;
    }

    @Test
    public static String[] getNewNumbers(int count) {
        String[] numbers = new String[count];
        for (int i = 0; i < count; i++) {
            StringBuilder stringBuilder = null;
            do {
                stringBuilder = new StringBuilder();
                for (int j = 0; j < 11; j++) {
                    stringBuilder.append(new Random().nextInt(10));
                }
                if (cards.keySet().contains(stringBuilder.toString())) {
                    continue;
                }
            } while (!stringBuilder.toString().matches("^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$"));
            numbers[i] = stringBuilder.toString();
        }
        return numbers;
    }

    public void addCard(MoblieCard card) {
    }

    public void delCard(String number) {

    }

    public void showRemainDetail(String number) {
        MoblieCard moblieCard = cards.get(number);
        ServicePackage setPackage = moblieCard.setPackage;
        System.out.println("**************套餐余量查询***************");
        System.out.print("你的卡号是：" + number + ",套餐内剩余：\n");
        if (setPackage instanceof TalkPackage) {
            TalkPackage card = (TalkPackage) setPackage;
            System.out.println("通话时长：" + (card.talkTime - moblieCard.realTalkTime) + "分钟");
            System.out.println("短信条数：" + (card.smsCount - moblieCard.realSMSCount) + "条");
            System.out.println("上网流量：" + 0 + "GB");
        }
        if (setPackage instanceof NetPackage) {
            NetPackage card = (NetPackage) setPackage;
            System.out.println("通话时长：" + 0 + "分钟");
            System.out.println("短信条数：" + 0 + "条");
            System.out.println("上网流量：" + (card.flow - moblieCard.realFlow) + "GB");
        }
        if (setPackage instanceof SuperPackage) {
            SuperPackage card = (SuperPackage) setPackage;
            System.out.println("通话时长：" + (card.talkTime - moblieCard.realTalkTime) + "分钟");
            System.out.println("短信条数：" + (card.smsCount - moblieCard.realSMSCount) + "条");
            System.out.println("上网流量：" + (card.flow - moblieCard.realFlow) + "GB");
        }
    }

    public void showAmountDetail(String number) {
        MoblieCard moblieCard = cards.get(number);
        System.out.println("**************本月账单查询***************");
        System.out.print("你的卡号为：" + number + ",当月账单：\n");
        System.out.println("套餐资费：" + moblieCard.setPackage.price + "元");
        if (moblieCard.setPackage instanceof TalkPackage) {
            TalkPackage card = (TalkPackage) moblieCard.setPackage;
            if (card.smsCount > moblieCard.realSMSCount && card.talkTime > moblieCard.realTalkTime) {
                System.out.println("合计：" + card.price + "元");
                System.out.println("账户余额：" + moblieCard.money + "元");
            } else {
                double total = card.price + (moblieCard.realSMSCount - card.smsCount) * 0.1 + (moblieCard.realTalkTime - card.talkTime) * 0.2;
                moblieCard.money -= (moblieCard.realSMSCount - card.smsCount) * 0.1 + (moblieCard.realTalkTime - card.talkTime) * 0.2;
                System.out.println("合计：" + total + "元");
                System.out.println("账户余额：" + moblieCard.money + "元");
            }
        }
        if (moblieCard.setPackage instanceof NetPackage) {
            NetPackage card = (NetPackage) moblieCard.setPackage;
            if (card.flow > moblieCard.realFlow) {
                System.out.println("合计：" + card.price + "元");
                System.out.println("账户余额：" + moblieCard.money + "元");
            } else {
                double total = card.price + (moblieCard.realFlow - card.flow) * 1024 * 0.1;
                moblieCard.money -= (moblieCard.realFlow - card.flow) * 0.1 * 1024;
                System.out.println("合计：" + total + "元");
                System.out.println("账户余额：" + moblieCard.money + "元");
            }
        }
        if (moblieCard.setPackage instanceof SuperPackage) {
            SuperPackage card = (SuperPackage) moblieCard.setPackage;
            if (card.smsCount > moblieCard.realSMSCount && card.talkTime > moblieCard.realTalkTime && card.flow > moblieCard.realFlow) {
                System.out.println("合计：" + card.price + "元");
                System.out.println("账户余额：" + moblieCard.money + "元");
            } else {
                double total = card.price + (moblieCard.realSMSCount - card.smsCount) * 0.1 + (moblieCard.realTalkTime - card.talkTime) * 0.2 + (moblieCard.realFlow - card.flow) * 0.1 * 1024;
                moblieCard.money -= (moblieCard.realSMSCount - card.smsCount) * 0.1 + (moblieCard.realTalkTime - card.talkTime) * 0.2 + (moblieCard.realFlow - card.flow) * 0.1 * 1024;
                System.out.println("合计：" + total + "元");
                System.out.println("账户余额：" + moblieCard.money + "元");
            }
        }
    }

    public void addConsuminfo(String number, Consuminfo info) {

    }

    public void userSoso(String number) {

    }

    public void showDescription() {

    }

    public void changingPack(String number, String packNum) {

    }

    public void printConsumInfo(String number) {
        MoblieCard moblieCard = cards.get(number);
        System.out.println("**************" + number + "**************");
        System.out.println("序号\t类型\t数据(通话(分钟)短信(条)上网(MB))");
        System.out.println("1.\t\t短信\t" + moblieCard.realSMSCount);
        System.out.println("2.\t\t通话\t" + moblieCard.realTalkTime);
        System.out.println("3.\t\t上网\t" + moblieCard.realFlow * 1024);
        List<Consuminfo> Oneconsuminfo = new ArrayList<>();
        if (moblieCard.realSMSCount > 0) {
            Consuminfo consuminfo1 = new Consuminfo();
            consuminfo1.cardNumber = number;
            consuminfo1.type = "短信";
            consuminfo1.consumData = moblieCard.realSMSCount;
            Oneconsuminfo.add(consuminfo1);
        }
        if (moblieCard.realTalkTime > 0) {
            Consuminfo consuminfo2 = new Consuminfo();
            consuminfo2.cardNumber = number;
            consuminfo2.type = "通话";
            consuminfo2.consumData = moblieCard.realTalkTime;
            Oneconsuminfo.add(consuminfo2);
        }
        if (moblieCard.realFlow > 0) {
            Consuminfo consuminfo3 = new Consuminfo();
            consuminfo3.cardNumber = number;
            consuminfo3.type = "上网";
            consuminfo3.consumData = moblieCard.realFlow;
            Oneconsuminfo.add(consuminfo3);
        }
        consumInfos.put(number, Oneconsuminfo);
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileOutputStream(new File("F:\\idea\\workspace\\CXXM\\FirstProject\\src\\com\\BigHomeWork\\ThreeHomeWork\\File\\ConsumInfo.txt"), true));
            pw.println("**************" + number + "**************");
            pw.println("1.短信：" + moblieCard.realSMSCount + "条");
            pw.println("2.通话：" + moblieCard.realTalkTime + "分钟");
            pw.println("3.上网：" + moblieCard.realFlow + "MB");
            pw.println("---------------------------------------");
            pw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
        try {
            pw = new PrintWriter(new FileOutputStream(new File("F:\\idea\\workspace\\CXXM\\FirstProject\\src\\com\\BigHomeWork\\ThreeHomeWork\\File\\ConsumInfosMap.txt")));
            pw.println("卡号(consuminfos的KEY)    消费记录(consuminfos的Value)(上网MB 通话分钟 短信条)");
            Set<Map.Entry<String, List<Consuminfo>>> entries = consumInfos.entrySet();
            for (Map.Entry<String, List<Consuminfo>> entry : entries) {
                List<Consuminfo> value = entry.getValue();
                pw.println();
                for (Consuminfo consuminfo : value) {
                    pw.println(consuminfo.cardNumber + "\t\t\t\t\t" + consuminfo.type + " " + consuminfo.consumData);
                }
            }
            pw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }

    public void chargeMoney(String number, double money) {

    }
}
