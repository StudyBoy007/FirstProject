package com.BigHomeWork.ThreeHomeWork.Utility;

import com.BigHomeWork.ThreeHomeWork.beans.Consuminfo;
import com.BigHomeWork.ThreeHomeWork.beans.MoblieCard;
import com.BigHomeWork.ThreeHomeWork.beans.Scene;
import com.BigHomeWork.ThreeHomeWork.beans.ServicePackage.NetPackage;
import com.BigHomeWork.ThreeHomeWork.beans.ServicePackage.ServicePackage;
import com.BigHomeWork.ThreeHomeWork.beans.ServicePackage.SuperPackage;
import com.BigHomeWork.ThreeHomeWork.beans.ServicePackage.TalkPackage;
import org.junit.Test;
import sun.nio.ch.Net;

import java.io.*;
import java.util.*;

/**
 * Create by czq
 * time on 2019/6/30  20:12
 */
public class CardUtil {
    public static Map<String, MoblieCard> cards = new HashMap<>();
    public static Map<String, List<Consuminfo>> consumInfos = new HashMap<>();

    public Scene initScene() {
        List<Scene> scenes = new ArrayList<>();
        Scene scene = new Scene();
        scene.type = "通话";
        scene.data = 90;
        scene.description = "问候客户，谁知其如此难缠  通话90分钟";
        scenes.add(scene);
        Scene scene1 = new Scene();
        scene1.type = "短信";
        scene1.data = 50;
        scene1.description = "通知朋友手机换号，发送短信50条";
        scenes.add(scene1);
        Scene scene2 = new Scene();
        scene2.type = "上网";
        scene2.data = 5;
        scene2.description = "用流量看春晚直播,花费流量5个G";
        scenes.add(scene2);
        return scenes.get(new Random().nextInt(1));
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
        Scanner input = new Scanner(System.in);
        System.out.print("请输入充值金额：");
        Double money = input.nextDouble();
        card.money += money;
        System.out.println("充值成功，当前花费余额为：" + card.money);
    }

    public void delCard(String number) {
        System.out.println("**************办理退网***************");
        MoblieCard moblieCard = cards.get(number);
        cards.remove(number, moblieCard);
        System.out.println("谢谢使用!");
    }

    public void showRemainDetail(String number) {
        MoblieCard moblieCard = cards.get(number);
        ServicePackage setPackage = moblieCard.setPackage;
        System.out.println("**************套餐余量查询***************");
        System.out.print("你的卡号是：" + number + ",套餐内剩余：\n");
        if (setPackage instanceof TalkPackage) {
            TalkPackage card = (TalkPackage) setPackage;
            String call = card.talkTime - moblieCard.realTalkTime > 0 ? "通话时长：" + (card.talkTime - moblieCard.realTalkTime) + "分钟" : "通话时长：" + 0 + "分钟";
            System.out.println(call);
            String message = card.smsCount - moblieCard.realSMSCount > 0 ? "短信条数：" + (card.smsCount - moblieCard.realSMSCount) + "条" : "短信条数：" + 0 + "条";
            System.out.println(message);
            System.out.println("上网流量：" + 0 + "GB");
        }
        if (setPackage instanceof NetPackage) {
            NetPackage card = (NetPackage) setPackage;
            System.out.println("通话时长：" + 0 + "分钟");
            System.out.println("短信条数：" + 0 + "条");
            String net = card.flow - moblieCard.realFlow > 0 ? "上网流量：" + (card.flow - moblieCard.realFlow) + "GB" : "上网流量：" + 0 + "GB";
            System.out.println(net);

        }
        if (setPackage instanceof SuperPackage) {
            SuperPackage card = (SuperPackage) setPackage;
            String call = card.talkTime - moblieCard.realTalkTime > 0 ? "通话时长：" + (card.talkTime - moblieCard.realTalkTime) + "分钟" : "通话时长：" + 0 + "分钟";
            System.out.println(call);
            String message = card.smsCount - moblieCard.realSMSCount > 0 ? "短信条数：" + (card.smsCount - moblieCard.realSMSCount) + "条" : "短信条数：" + 0 + "条";
            System.out.println(message);
            String net = card.flow - moblieCard.realFlow > 0 ? "上网流量：" + (card.flow - moblieCard.realFlow) + "GB" : "上网流量：" + 0 + "GB";
            System.out.println(net);
        }
    }

    public void showAmountDetail(String number) {
        MoblieCard moblieCard = cards.get(number);
        System.out.println("**************本月账单查询***************");
        System.out.print("你的卡号为：" + number + ",当月账单：\n");
        System.out.println("套餐资费：" + moblieCard.setPackage.price + "元");
        if (moblieCard.setPackage instanceof TalkPackage) {
            TalkPackage card = (TalkPackage) moblieCard.setPackage;
            if (card.smsCount > moblieCard.realSMSCount && card.talkTime > moblieCard.realTalkTime && moblieCard.realFlow == 0) {
                System.out.println("合计：" + card.price + "元");
                System.out.println("账户余额：" + moblieCard.money + "元");
            } else {
                double total = card.price;
                if (moblieCard.realSMSCount > card.smsCount) {
                    total += (moblieCard.realSMSCount - card.smsCount) * 0.1;
                }
                if (moblieCard.realTalkTime > card.talkTime) {
                    total += (moblieCard.realTalkTime - card.talkTime) * 0.2;
                }
                if (moblieCard.realFlow != 0) {
                    total += moblieCard.realFlow * 1024 * 0.1;
                }
                System.out.println("合计：" + total + "元");
                System.out.println("账户余额：" + moblieCard.money + "元");
            }
        }
        if (moblieCard.setPackage instanceof NetPackage) {
            NetPackage card = (NetPackage) moblieCard.setPackage;
            if (card.flow > moblieCard.realFlow && moblieCard.realTalkTime == 0 && moblieCard.realSMSCount == 0) {
                System.out.println("合计：" + card.price + "元");
                System.out.println("账户余额：" + moblieCard.money + "元");
            } else {
                double total = card.price;
                if (moblieCard.realSMSCount != 0) {
                    total += moblieCard.realSMSCount * 0.1;
                }
                if (moblieCard.realTalkTime != 0) {
                    total += moblieCard.realTalkTime * 0.2;
                }
                if (moblieCard.realFlow - card.flow > 0) {
                    total += (moblieCard.realFlow - card.flow) * 1024 * 0.1;
                }
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
                double total = card.price;
                if (moblieCard.realSMSCount > card.smsCount) {
                    total += (moblieCard.realSMSCount - card.smsCount) * 0.1;
                }
                if (moblieCard.realTalkTime > card.talkTime) {
                    total += (moblieCard.realTalkTime - card.talkTime) * 0.2;
                }
                if (moblieCard.realFlow - card.flow > 0) {
                    total += (moblieCard.realFlow - card.flow) * 1024 * 0.1;
                }
                System.out.println("合计：" + total + "元");
                System.out.println("账户余额：" + moblieCard.money + "元");
            }
        }
    }

    public void addConsuminfo(String number, Consuminfo info) {

    }

    public void userSoso(String number) {
        Scene sceneUse = initScene();
        MoblieCard moblieCard = cards.get(number);
        ServicePackage Package = moblieCard.setPackage;
        if (Package instanceof TalkPackage) {
            TalkPackage talkPackage = (TalkPackage) Package;
            if ("上网".equals(sceneUse.type)) {
                if (sceneUse.data * 1024 * 0.1 <= moblieCard.money) {
                    moblieCard.realFlow += sceneUse.data;
                    moblieCard.money -= sceneUse.data * 1024 * 0.1;
                    System.out.println(sceneUse.description);
                    System.out.println("不存在此卡的消费记录，已添加一条消费记录");
                    List<Consuminfo> consuminfos = consumInfos.get(number);
                    if (consuminfos == null) {
                        consuminfos = new ArrayList<>();
                        consumInfos.put(number, consuminfos);
                    }
                    Consuminfo consuminfo = new Consuminfo();
                    consuminfo.type = "上网";
                    consuminfo.cardNumber = number;
                    consuminfo.consumData = sceneUse.data;
                    consuminfos.add(consuminfo);
                } else {
                    try {
                        throw new Exception("本次上网使用了" + Math.floor(moblieCard.money / 0.1) + "MB,您的余额不足,请充值后在使用！");
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        moblieCard.realFlow += (int) (Math.floor(moblieCard.money / 0.1) / 1024);
                        System.out.println(sceneUse.description);
                        System.out.println("不存在此卡的消费记录，已添加一条消费记录");
                        List<Consuminfo> consuminfos = consumInfos.get(number);
                        if (consuminfos == null) {
                            consuminfos = new ArrayList<>();
                            consumInfos.put(number, consuminfos);
                        }
                        Consuminfo consuminfo = new Consuminfo();
                        consuminfo.type = "上网";
                        consuminfo.cardNumber = number;
                        consuminfo.consumData = (int) (Math.floor(moblieCard.money / 0.1) / 1024);
                        moblieCard.money = 0;
                        consuminfos.add(consuminfo);
                    }
                }
            } else {
                int index = 0;
                if ("短信".equals(sceneUse.type)) {
                    index = talkPackage.send(sceneUse.data, moblieCard);
                } else {
                    index = talkPackage.call(sceneUse.data, moblieCard);
                }
                System.out.println(sceneUse.description);
                System.out.println("不存在此卡的消费记录，已添加一条消费记录");
                List<Consuminfo> consuminfos = consumInfos.get(number);
                if (consuminfos == null) {
                    consuminfos = new ArrayList<>();
                    consumInfos.put(number, consuminfos);
                }
                Consuminfo consuminfo = new Consuminfo();
                if ("短信".equals(sceneUse.type)) {
                    consuminfo.type = "短信";
                } else {
                    consuminfo.type = "通话";
                }
                consuminfo.cardNumber = number;
                if (index == 1 || index == 2) {
                    consuminfo.consumData = sceneUse.data;
                } else {
                    if ("短信".equals(sceneUse.type)) {
                        consuminfo.consumData = talkPackage.smsCount + (int) Math.floor(moblieCard.money / 0.1);
                    } else {
                        consuminfo.consumData = talkPackage.talkTime + (int) Math.floor(moblieCard.money / 0.2);
                    }
                    moblieCard.money = 0;
                }
                consuminfos.add(consuminfo);
            }
        }

        if (Package instanceof NetPackage) {
            NetPackage netPackage = (NetPackage) Package;
            double i = 0;
            if ("上网".equals(sceneUse.type)) {
                int index = netPackage.netPlay(sceneUse.data, moblieCard);
                System.out.println(sceneUse.description);
                System.out.println("不存在此卡的消费记录，已添加一条消费记录");
                List<Consuminfo> consuminfos = consumInfos.get(number);
                if (consuminfos == null) {
                    consuminfos = new ArrayList<>();
                    consumInfos.put(number, consuminfos);
                }
                Consuminfo consuminfo = new Consuminfo();

                consuminfo.type = "上网";

                consuminfo.cardNumber = number;
                if (index == 1 || index == 2) {
                    consuminfo.consumData = sceneUse.data;
                } else {
                    consuminfo.consumData = netPackage.flow + (int) Math.floor(moblieCard.money / 0.1) / 1024;
                    moblieCard.money = 0;
                }
                consuminfos.add(consuminfo);
            } else {
                if ("短信".equals(sceneUse.type)) {
                    i = 0.1;
                } else {
                    i = 0.2;
                }
                if (sceneUse.data * i <= moblieCard.money) {
                    moblieCard.realSMSCount += sceneUse.data;
                    moblieCard.money -= sceneUse.data * i;
                    System.out.println(sceneUse.description);
                    System.out.println("不存在此卡的消费记录，已添加一条消费记录");
                    List<Consuminfo> consuminfos = consumInfos.get(number);
                    if (consuminfos == null) {
                        consuminfos = new ArrayList<>();
                        consumInfos.put(number, consuminfos);
                    }
                    Consuminfo consuminfo = new Consuminfo();
                    consuminfo.type = "短信";
                    consuminfo.cardNumber = number;
                    consuminfo.consumData = sceneUse.data;
                    consuminfos.add(consuminfo);
                } else {
                    try {
                        if ("短信".equals(sceneUse.type)) {
                            throw new Exception("本次短信发了" + Math.floor(moblieCard.money / 0.1) + "条,您的余额不足,请充值后在使用！");
                        } else {
                            throw new Exception("本次通话了" + Math.floor(moblieCard.money / 0.2) + "分钟,您的余额不足,请充值后在使用！");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        moblieCard.realSMSCount += (int) Math.floor(moblieCard.money / i);
                        System.out.println(sceneUse.description);
                        System.out.println("不存在此卡的消费记录，已添加一条消费记录");
                        List<Consuminfo> consuminfos = consumInfos.get(number);
                        if (consuminfos == null) {
                            consuminfos = new ArrayList<>();
                            consumInfos.put(number, consuminfos);
                        }
                        Consuminfo consuminfo = new Consuminfo();
                        if ("短信".equals(sceneUse.type)) {
                            consuminfo.type = "短信";
                        } else {
                            consuminfo.type = "通话";
                        }
                        consuminfo.cardNumber = number;
                        consuminfo.consumData = (int) Math.floor(moblieCard.money / i);
                        moblieCard.money = 0;
                        consuminfos.add(consuminfo);
                    }
                }

            }
        }

        if (Package instanceof SuperPackage) {
            SuperPackage superPackage = (SuperPackage) Package;

            int index = 0;
            if ("短信".equals(sceneUse.type)) {
                index = superPackage.send(sceneUse.data, moblieCard);
            } else if ("通话".equals(sceneUse.type)) {
                index = superPackage.call(sceneUse.data, moblieCard);
            } else {
                index = superPackage.netPlay(sceneUse.data, moblieCard);
            }
            System.out.println(sceneUse.description);
            System.out.println("不存在此卡的消费记录，已添加一条消费记录");
            List<Consuminfo> consuminfos = consumInfos.get(number);
            if (consuminfos == null) {
                consuminfos = new ArrayList<>();
                consumInfos.put(number, consuminfos);
            }
            Consuminfo consuminfo = new Consuminfo();
            if ("短信".equals(sceneUse.type)) {
                consuminfo.type = "短信";
            } else if ("通话".equals(sceneUse.type)) {
                consuminfo.type = "通话";
            } else {
                consuminfo.type = "上网";
            }
            consuminfo.cardNumber = number;
            if (index == 1 || index == 2) {
                consuminfo.consumData = sceneUse.data;
            } else {
                if ("短信".equals(sceneUse.type)) {
                    consuminfo.consumData = superPackage.smsCount + (int) Math.floor(moblieCard.money / 0.1);
                } else if ("通话".equals(sceneUse.type)) {
                    consuminfo.consumData = superPackage.talkTime + (int) Math.floor(moblieCard.money / 0.2);
                } else {
                    consuminfo.consumData = superPackage.flow + (int) Math.floor(moblieCard.money / 0.1) / 1024;
                }
                moblieCard.money = 0;
            }
            consuminfos.add(consuminfo);
        }
    }

    public void showDescription() {

    }

    public void changingPack(String number, String packNum) {
        MoblieCard moblieCard = cards.get(number);
        out:
        while (true) {
            switch (Integer.parseInt(packNum)) {
                case 1:
                    TalkPackage talkPackage = new TalkPackage();
                    if (moblieCard.setPackage instanceof TalkPackage) {
                        System.out.println("对不起，你已经是该套餐的用户，无需更换套餐");
                        break out;
                    } else {
                        if (talkPackage.price > moblieCard.money) {
                            System.out.println("对不起，您的余额不足以支付新套餐本月资费，请充值后再办理更换套餐业务！");
                            break out;
                        } else {
                            moblieCard.money -= talkPackage.price;
                            moblieCard.setPackage = talkPackage;
                            moblieCard.realFlow = 0;
                            moblieCard.realTalkTime = 0;
                            moblieCard.realSMSCount = 0;
                            System.out.println("套餐更换成功,您现在的套餐信息如下：");
                            talkPackage.showInfo();
                            break out;
                        }
                    }
                case 2:
                    NetPackage netPackage = new NetPackage();
                    if (moblieCard.setPackage instanceof NetPackage) {
                        System.out.println("对不起，你已经是该套餐的用户，无需更换套餐");
                        break out;
                    } else {
                        if (netPackage.price > moblieCard.money) {
                            System.out.println("对不起，您的余额不足以支付新套餐本月资费，请充值后再办理更换套餐业务！");
                            break out;
                        } else {
                            moblieCard.money -= netPackage.price;
                            moblieCard.setPackage = netPackage;
                            moblieCard.realFlow = 0;
                            moblieCard.realTalkTime = 0;
                            moblieCard.realSMSCount = 0;
                            System.out.println("套餐更换成功,您现在的套餐信息如下：");
                            netPackage.showInfo();
                            break out;
                        }
                    }

                case 3:
                    SuperPackage superPackage = new SuperPackage();
                    if (moblieCard.setPackage instanceof SuperPackage) {
                        System.out.println("对不起，你已经是该套餐的用户，无需更换套餐");
                        break out;
                    } else {
                        if (superPackage.price > moblieCard.money) {
                            System.out.println("对不起，您的余额不足以支付新套餐本月资费，请充值后再办理更换套餐业务！");
                            break out;
                        } else {
                            moblieCard.money -= superPackage.price;
                            moblieCard.setPackage = superPackage;
                            moblieCard.realFlow = 0;
                            moblieCard.realTalkTime = 0;
                            moblieCard.realSMSCount = 0;
                            System.out.println("套餐更换成功,您现在的套餐信息如下：");
                            superPackage.showInfo();
                            break out;
                        }
                    }
                default:
                    System.out.println("您的输入有误，请输入正确范围内的数字!");
            }
        }
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
                    pw.println(consuminfo.cardNumber + "\t\t\t\t\t\t\t\t" + consuminfo.type + " " + consuminfo.consumData);
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
