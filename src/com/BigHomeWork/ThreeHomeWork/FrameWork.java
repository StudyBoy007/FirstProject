package com.BigHomeWork.ThreeHomeWork;

import com.BigHomeWork.ThreeHomeWork.Utility.CardUtil;

import com.BigHomeWork.ThreeHomeWork.beans.MoblieCard;

import com.BigHomeWork.ThreeHomeWork.beans.ServicePackage.NetPackage;

import com.BigHomeWork.ThreeHomeWork.beans.ServicePackage.SuperPackage;
import com.BigHomeWork.ThreeHomeWork.beans.ServicePackage.TalkPackage;

import java.io.*;
import java.rmi.registry.Registry;
import java.util.*;

/**
 * Create by czq
 * time on 2019/6/30  20:34
 */
public class FrameWork {
    public static Scanner input = new Scanner(System.in);
    public static CardUtil cardUtil = new CardUtil();

    public static void display() {
        System.out.println("***************************欢迎使用嗖嗖移动大厅***************************");
        while (true) {
            System.out.println("1.用户登录\t2.用户注册\t3.使用嗖嗖\t4.花费充值\t5.资费说明\t6.退出系统");
            try {
                int index = input.nextInt();
                switch (index) {
                    case 1:
                        login();
                        break;
                    case 2:
                        register();
                        break;
                    case 3:
                        userSoSo();
                        break;
                    case 4:
                        addMoney();
                        break;
                    case 5:
                        printMessage();
                        break;
                    case 6:
                        System.exit(0);
                    default:
                        System.out.println("您的输入有误,请出入符合要求的的数字！");
                }
            } catch (InputMismatchException e) {
                String s = input.next();
                System.out.println("您的输入有误,请输入数字！");
            }
        }
    }

    public static void UserMenu(String number) {
        System.out.println("*****************************嗖嗖移动用户菜单***************************");
        while (true) {
            System.out.println("1.本月账单查询\n2.套餐余量查询\n3.打印消费详单\n4.套餐变更\n5.办理退网\n请选择(输入1-5选择功能，其他键返回上一级)");
            try {
                int index = input.nextInt();
                switch (index) {
                    case 1:
                        cardUtil.showAmountDetail(number);
                        break;
                    case 2:
                        cardUtil.showRemainDetail(number);
                        break;
                    case 3:
                        cardUtil.printConsumInfo(number);
                        break;
                    case 4:
                        changePack(number);
                        break;
                    case 5:
                        cardUtil.delCard(number);
                        break;
                    default:
                        display();
                }
            } catch (InputMismatchException e) {
                String s = input.next();
                display();
            }
        }
    }

    public static void login() {
        Set<String> strings = cardUtil.cards.keySet();
        System.out.print("请输入你的电话号码：");
        String telephone = input.next();
        if (strings.contains(telephone)) {
            MoblieCard moblieCard = cardUtil.cards.get(telephone);
            System.out.print("该用户存在,请输入对应的密码：");
            String password = input.next();
            if (moblieCard.passWord.equals(password)) {
                System.out.println("登录成功！");
                UserMenu(telephone);
            } else {
                System.out.println("登录失败");
            }
        } else {
            System.out.println("该用户号码不存在！");
        }
    }

    public static void register() {
        MoblieCard moblieCard = new MoblieCard();
        System.out.println("*****************可选择的卡号*****************");
        String[] newNumbers = CardUtil.getNewNumbers(9);
        for (int i = 0; i < newNumbers.length; i++) {
            System.out.print((i + 1) + "." + newNumbers[i] + "  ");
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
        System.out.print("请选择卡号,输入(1~9)的序号：");
        int index;
        while (true) {
            try {
                int count = 0;
                do {
                    if (count > 0) {
                        System.out.println("您的输入有误,请输入符合要求的数字！");
                    }
                    count++;
                    index = input.nextInt();
                } while (index > 9);
                break;
            } catch (InputMismatchException e) {
                String s = input.next();
                System.out.println("您的输入有误，请输入正确的数字！");
            }
        }
        moblieCard.cardNumber = String.valueOf(newNumbers[index - 1]);
        out:
        while (true) {
            System.out.println("1.话痨套餐\t2.网虫套餐\t3.超人套餐\t请选择套餐输入序号(1~3)");
            try {
                int index1 = input.nextInt();
                switch (index1) {
                    case 1:
                        moblieCard.setPackage = new TalkPackage();
                        break out;
                    case 2:
                        moblieCard.setPackage = new NetPackage();
                        break out;
                    case 3:
                        moblieCard.setPackage = new SuperPackage();
                    default:
                        System.out.println("您的输入有误，请输入正确范围内的数字!");
                }
            } catch (InputMismatchException e) {
                String s = input.next();
                System.out.println("你的输入有误，请输入数字！");
            }
        }
        System.out.print("请输入姓名：");
        String username = input.next();
        System.out.print("请输入密码：");
        String password = input.next();
        moblieCard.userName = username;
        moblieCard.passWord = password;
        System.out.print("请输入预存话费金额：");
        double moneyFirst = 0;
        while (true) {
            try {
                moneyFirst = input.nextDouble();
                if (moneyFirst < moblieCard.setPackage.price) {
                    System.out.print("您预存的话费金额不足以支付本月固定套餐资费,请重新充值：");
                    continue;
                }
                break;
            } catch (Exception e) {
                String s = input.next();
                System.out.println("请输入真确的数字！");
            }
        }
        moblieCard.money = moneyFirst - moblieCard.setPackage.price;
        System.out.println("注册成功！卡号：" + moblieCard.cardNumber + ",用户名：" + moblieCard.userName + ",当前余额：" + moblieCard.money + "。");
        moblieCard.setPackage.showInfo();
        cardUtil.cards.put(moblieCard.cardNumber, moblieCard);
    }

    public static void userSoSo() {
        System.out.print("请输入手机号：");
        String number = input.next();
        cardUtil.userSoso(number);
    }

    public static void changePack(String number) {
        MoblieCard moblieCard = cardUtil.cards.get(number);
        System.out.println("**************套餐变更***************");
        while (true) {
            System.out.print("1.话痨套餐\t2.网虫套餐\t3.超人套餐\t请选择套餐输入序号(1~3)");
            try {
                int index1 = input.nextInt();
                cardUtil.changingPack(number, String.valueOf(index1));
                break;
            } catch (InputMismatchException e) {
                String s = input.next();
                System.out.println("你的输入有误，请输入数字！");
            }
        }
    }

    public static void addMoney() {
        System.out.print("请输入充值卡号：");
        String number = input.next();
        cardUtil.addCard(cardUtil.cards.get(number));
    }

    public static void printMessage() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("F:\\idea\\workspace\\CXXM\\FirstProject\\src\\com\\BigHomeWork\\ThreeHomeWork\\File\\payMenu.txt"))));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    public static void userSoSo() {
//        System.out.print("请输入手机号：");
//        String number = input.next();
//        List<Scene> scenes = new ArrayList<>();
//        Scene scene = new Scene();
//        scene.type = "通话";
//        scene.data = 900;
//        scene.description = "问候客户，谁知其如此难缠  通话90分钟";
//        scenes.add(scene);
//        Scene scene1 = new Scene();
//        scene1.type = "短信";
//        scene1.data = 50;
//        scene1.description = "通知朋友手机换号，发送短信50条";
//        scenes.add(scene1);
//        Scene scene2 = new Scene();
//        scene2.type = "上网";
//        scene2.data = 5;
//        scene2.description = "用流量看春晚直播,花费流量5个G";
//        scenes.add(scene2);
//        Scene sceneUse = scenes.get(new Random().nextInt(1));
//        MoblieCard moblieCard = cardUtil.cards.get(number);
//        ServicePackage Package = moblieCard.setPackage;
//        if (Package instanceof TalkPackage) {
//            TalkPackage talkPackage = (TalkPackage) Package;
//            if ("短信".equals(sceneUse.type)) {
//                if (talkPackage.smsCount >= sceneUse.data) {
//                    moblieCard.realSMSCount += sceneUse.data;
//                    System.out.println(sceneUse.description);
//                    System.out.println("不存在此卡的消费记录，已添加一条消费记录");
//                    List<Consuminfo> consuminfos = cardUtil.consumInfos.get(number);
//                    if (consuminfos == null) {
//                        consuminfos = new ArrayList<>();
//                        cardUtil.consumInfos.put(number, consuminfos);
//                    }
//                    Consuminfo consuminfo = new Consuminfo();
//                    consuminfo.type = "短信";
//                    consuminfo.cardNumber = number;
//                    consuminfo.consumData = sceneUse.data;
//                    consuminfos.add(consuminfo);
//                } else {
//                    int over = sceneUse.data - talkPackage.smsCount;
//                    if ((over * 0.1) <= moblieCard.money) {
//                        moblieCard.realSMSCount += sceneUse.data;
//                        moblieCard.money -= over * 0.1;
//                        System.out.println(sceneUse.description);
//                        System.out.println("不存在此卡的消费记录，已添加一条消费记录");
//                        List<Consuminfo> consuminfos = cardUtil.consumInfos.get(number);
//                        if (consuminfos == null) {
//                            consuminfos = new ArrayList<>();
//                            cardUtil.consumInfos.put(number, consuminfos);
//                        }
//                        Consuminfo consuminfo = new Consuminfo();
//                        consuminfo.type = "短信";
//                        consuminfo.cardNumber = number;
//                        consuminfo.consumData = sceneUse.data;
//                        consuminfos.add(consuminfo);
//                    } else {
//                        try {
//                            throw new Exception("本次短信发了" + (talkPackage.smsCount + Math.floor(moblieCard.money / 0.1)) + "条,您的余额不足,请充值后在使用！");
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                        } finally {
//                            moblieCard.realSMSCount += talkPackage.smsCount + (int) Math.floor(moblieCard.money / 0.1);
//                            System.out.println(sceneUse.description);
//                            System.out.println("不存在此卡的消费记录，已添加一条消费记录");
//                            List<Consuminfo> consuminfos = cardUtil.consumInfos.get(number);
//                            if (consuminfos == null) {
//                                consuminfos = new ArrayList<>();
//                                cardUtil.consumInfos.put(number, consuminfos);
//                            }
//                            Consuminfo consuminfo = new Consuminfo();
//                            consuminfo.type = "短信";
//                            consuminfo.cardNumber = number;
//                            consuminfo.consumData = talkPackage.smsCount + (int) Math.floor(moblieCard.money / 0.1);
//                            moblieCard.money = 0;
//                            consuminfos.add(consuminfo);
//                        }
//                    }
//                }
//            }
//            if ("通话".equals(sceneUse.type)) {
//                if (talkPackage.talkTime >= sceneUse.data) {
//                    moblieCard.realTalkTime += scene.data;
//                    System.out.println(sceneUse.description);
//                    System.out.println("不存在此卡的消费记录，已添加一条消费记录");
//                    List<Consuminfo> consuminfos = cardUtil.consumInfos.get(number);
//                    if (consuminfos == null) {
//                        consuminfos = new ArrayList<>();
//                        cardUtil.consumInfos.put(number, consuminfos);
//                    }
//                    Consuminfo consuminfo = new Consuminfo();
//                    consuminfo.type = "通话";
//                    consuminfo.cardNumber = number;
//                    consuminfo.consumData = sceneUse.data;
//                    consuminfos.add(consuminfo);
//                } else {
//                    int over = sceneUse.data - talkPackage.talkTime;
//                    if ((over * 0.2) <= moblieCard.money) {
//                        moblieCard.realTalkTime += sceneUse.data;
//                        moblieCard.money -= over * 0.2;
//                        System.out.println(sceneUse.description);
//                        System.out.println("不存在此卡的消费记录，已添加一条消费记录");
//                        List<Consuminfo> consuminfos = cardUtil.consumInfos.get(number);
//                        if (consuminfos == null) {
//                            consuminfos = new ArrayList<>();
//                            cardUtil.consumInfos.put(number, consuminfos);
//                        }
//                        Consuminfo consuminfo = new Consuminfo();
//                        consuminfo.type = "通话";
//                        consuminfo.cardNumber = number;
//                        consuminfo.consumData = sceneUse.data;
//                        consuminfos.add(consuminfo);
//                    } else {
//                        try {
//                            throw new Exception("本次通话了" + (talkPackage.talkTime + Math.floor(moblieCard.money / 0.2)) + "分钟,您的余额不足,请充值后在使用！");
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                        } finally {
//                            moblieCard.realTalkTime += talkPackage.talkTime + (int) (Math.floor(moblieCard.money / 0.2));
//                            System.out.println(sceneUse.description);
//                            System.out.println("不存在此卡的消费记录，已添加一条消费记录");
//                            List<Consuminfo> consuminfos = cardUtil.consumInfos.get(number);
//                            if (consuminfos == null) {
//                                consuminfos = new ArrayList<>();
//                                cardUtil.consumInfos.put(number, consuminfos);
//                            }
//                            Consuminfo consuminfo = new Consuminfo();
//                            consuminfo.type = "通话";
//                            consuminfo.cardNumber = number;
//                            consuminfo.consumData = talkPackage.talkTime + (int) (Math.floor(moblieCard.money / 0.2));
//                            moblieCard.money = 0;
//                            consuminfos.add(consuminfo);
//                        }
//                    }
//                }
//            }
//            if ("上网".equals(sceneUse.type)) {
//                if (sceneUse.data * 1024 * 0.1 <= moblieCard.money) {
//                    moblieCard.realFlow += sceneUse.data;
//                    moblieCard.money -= sceneUse.data * 1024 * 0.1;
//                    System.out.println(sceneUse.description);
//                    System.out.println("不存在此卡的消费记录，已添加一条消费记录");
//                    List<Consuminfo> consuminfos = cardUtil.consumInfos.get(number);
//                    if (consuminfos == null) {
//                        consuminfos = new ArrayList<>();
//                        cardUtil.consumInfos.put(number, consuminfos);
//                    }
//                    Consuminfo consuminfo = new Consuminfo();
//                    consuminfo.type = "上网";
//                    consuminfo.cardNumber = number;
//                    consuminfo.consumData = sceneUse.data;
//                    consuminfos.add(consuminfo);
//                } else {
//                    try {
//                        throw new Exception("本次上网使用了" + Math.floor(moblieCard.money / 0.1) + "MB,您的余额不足,请充值后在使用！");
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    } finally {
//                        moblieCard.realFlow += (int) (Math.floor(moblieCard.money / 0.1) / 1024);
//                        System.out.println(sceneUse.description);
//                        System.out.println("不存在此卡的消费记录，已添加一条消费记录");
//                        List<Consuminfo> consuminfos = cardUtil.consumInfos.get(number);
//                        if (consuminfos == null) {
//                            consuminfos = new ArrayList<>();
//                            cardUtil.consumInfos.put(number, consuminfos);
//                        }
//                        Consuminfo consuminfo = new Consuminfo();
//                        consuminfo.type = "上网";
//                        consuminfo.cardNumber = number;
//                        consuminfo.consumData = (int) (Math.floor(moblieCard.money / 0.1) / 1024);
//                        moblieCard.money = 0;
//                        consuminfos.add(consuminfo);
//                    }
//                }
//            }
//
//        }
//
//        if (Package instanceof NetPackage) {
//            NetPackage netPackage = (NetPackage) Package;
//            if ("短信".equals(sceneUse.type)) {
//                if (sceneUse.data * 0.1 <= moblieCard.money) {
//                    moblieCard.realSMSCount += sceneUse.data;
//                    moblieCard.money -= sceneUse.data * 0.1;
//                    System.out.println(sceneUse.description);
//                    System.out.println("不存在此卡的消费记录，已添加一条消费记录");
//                    List<Consuminfo> consuminfos = cardUtil.consumInfos.get(number);
//                    if (consuminfos == null) {
//                        consuminfos = new ArrayList<>();
//                        cardUtil.consumInfos.put(number, consuminfos);
//                    }
//                    Consuminfo consuminfo = new Consuminfo();
//                    consuminfo.type = "短信";
//                    consuminfo.cardNumber = number;
//                    consuminfo.consumData = sceneUse.data;
//                    consuminfos.add(consuminfo);
//                } else {
//                    try {
//                        throw new Exception("本次短信发了" + Math.floor(moblieCard.money / 0.1) + "条,您的余额不足,请充值后在使用！");
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    } finally {
//                        moblieCard.realSMSCount += (int) Math.floor(moblieCard.money / 0.1);
//                        System.out.println(sceneUse.description);
//                        System.out.println("不存在此卡的消费记录，已添加一条消费记录");
//                        List<Consuminfo> consuminfos = cardUtil.consumInfos.get(number);
//                        if (consuminfos == null) {
//                            consuminfos = new ArrayList<>();
//                            cardUtil.consumInfos.put(number, consuminfos);
//                        }
//                        Consuminfo consuminfo = new Consuminfo();
//                        consuminfo.type = "短信";
//                        consuminfo.cardNumber = number;
//                        consuminfo.consumData = (int) Math.floor(moblieCard.money / 0.1);
//                        moblieCard.money = 0;
//                        consuminfos.add(consuminfo);
//                    }
//                }
//            }
//            if ("通话".equals(sceneUse.type)) {
//                if (sceneUse.data * 0.2 <= moblieCard.money) {
//                    moblieCard.realTalkTime += sceneUse.data;
//                    moblieCard.money -= sceneUse.data * 0.2;
//                    System.out.println(sceneUse.description);
//                    System.out.println("不存在此卡的消费记录，已添加一条消费记录");
//                    List<Consuminfo> consuminfos = cardUtil.consumInfos.get(number);
//                    if (consuminfos == null) {
//                        consuminfos = new ArrayList<>();
//                        cardUtil.consumInfos.put(number, consuminfos);
//                    }
//                    Consuminfo consuminfo = new Consuminfo();
//                    consuminfo.type = "通话";
//                    consuminfo.cardNumber = number;
//                    consuminfo.consumData = sceneUse.data;
//                    consuminfos.add(consuminfo);
//                } else {
//                    try {
//                        throw new Exception("本次通话了" + Math.floor(moblieCard.money / 0.2) + "分钟,您的余额不足,请充值后在使用！");
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    } finally {
//                        moblieCard.realTalkTime += (int) Math.floor(moblieCard.money / 0.2);
//                        System.out.println(sceneUse.description);
//                        System.out.println("不存在此卡的消费记录，已添加一条消费记录");
//                        List<Consuminfo> consuminfos = cardUtil.consumInfos.get(number);
//                        if (consuminfos == null) {
//                            consuminfos = new ArrayList<>();
//                            cardUtil.consumInfos.put(number, consuminfos);
//                        }
//                        Consuminfo consuminfo = new Consuminfo();
//                        consuminfo.type = "上网";
//                        consuminfo.cardNumber = number;
//                        consuminfo.consumData = (int) Math.floor(moblieCard.money / 0.2);
//                        moblieCard.money = 0;
//                        consuminfos.add(consuminfo);
//                    }
//                }
//            }
//            if ("上网".equals(sceneUse.type)) {
//                if (netPackage.flow >= sceneUse.data) {
//                    moblieCard.realFlow += sceneUse.data;
//                    System.out.println(sceneUse.description);
//                    System.out.println("不存在此卡的消费记录，已添加一条消费记录");
//                    List<Consuminfo> consuminfos = cardUtil.consumInfos.get(number);
//                    if (consuminfos == null) {
//                        consuminfos = new ArrayList<>();
//                        cardUtil.consumInfos.put(number, consuminfos);
//                    }
//                    Consuminfo consuminfo = new Consuminfo();
//                    consuminfo.type = "上网";
//                    consuminfo.cardNumber = number;
//                    consuminfo.consumData = sceneUse.data;
//                    consuminfos.add(consuminfo);
//                } else {
//                    int over = sceneUse.data - netPackage.flow;
//                    if ((over * 1024 * 0.1) <= moblieCard.money) {
//                        moblieCard.realFlow += sceneUse.data;
//                        moblieCard.money -= over * 1024 * 0.1;
//                        System.out.println(sceneUse.description);
//                        System.out.println("不存在此卡的消费记录，已添加一条消费记录");
//                        List<Consuminfo> consuminfos = cardUtil.consumInfos.get(number);
//                        if (consuminfos == null) {
//                            consuminfos = new ArrayList<>();
//                            cardUtil.consumInfos.put(number, consuminfos);
//                        }
//                        Consuminfo consuminfo = new Consuminfo();
//                        consuminfo.type = "上网";
//                        consuminfo.cardNumber = number;
//                        consuminfo.consumData = sceneUse.data;
//                        consuminfos.add(consuminfo);
//                    } else {
//                        try {
//                            throw new Exception("本次上网使用了" + (netPackage.flow * 1024 + Math.floor(moblieCard.money / 0.1)) + "MB,您的余额不足,请充值后在使用！");
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                        } finally {
//                            moblieCard.realFlow += (netPackage.flow + Math.floor(moblieCard.money / 0.1) / 1024);
//                            System.out.println(sceneUse.description);
//                            System.out.println("不存在此卡的消费记录，已添加一条消费记录");
//                            List<Consuminfo> consuminfos = cardUtil.consumInfos.get(number);
//                            if (consuminfos == null) {
//                                consuminfos = new ArrayList<>();
//                                cardUtil.consumInfos.put(number, consuminfos);
//                            }
//                            Consuminfo consuminfo = new Consuminfo();
//                            consuminfo.type = "上网";
//                            consuminfo.cardNumber = number;
//                            consuminfo.consumData = (netPackage.flow + (int) Math.floor(moblieCard.money / 0.1) / 1024);
//                            moblieCard.money = 0;
//                            consuminfos.add(consuminfo);
//                        }
//                    }
//                }
//            }
//        }
//        if (Package instanceof SuperPackage) {
//            SuperPackage superPackage = (SuperPackage) Package;
//            if ("短信".equals(sceneUse.type)) {
//                if (superPackage.smsCount >= sceneUse.data) {
//                    moblieCard.realSMSCount += sceneUse.data;
//                    System.out.println(sceneUse.description);
//                    System.out.println("不存在此卡的消费记录，已添加一条消费记录");
//                    List<Consuminfo> consuminfos = cardUtil.consumInfos.get(number);
//                    if (consuminfos == null) {
//                        consuminfos = new ArrayList<>();
//                        cardUtil.consumInfos.put(number, consuminfos);
//                    }
//                    Consuminfo consuminfo = new Consuminfo();
//                    consuminfo.type = "短信";
//                    consuminfo.cardNumber = number;
//                    consuminfo.consumData = sceneUse.data;
//                    consuminfos.add(consuminfo);
//                } else {
//                    int over = sceneUse.data - superPackage.smsCount;
//                    if ((over * 0.1) <= moblieCard.money) {
//                        moblieCard.realSMSCount += sceneUse.data;
//                        moblieCard.money -= over * 0.1;
//                        System.out.println(sceneUse.description);
//                        System.out.println("不存在此卡的消费记录，已添加一条消费记录");
//                        List<Consuminfo> consuminfos = cardUtil.consumInfos.get(number);
//                        if (consuminfos == null) {
//                            consuminfos = new ArrayList<>();
//                            cardUtil.consumInfos.put(number, consuminfos);
//                        }
//                        Consuminfo consuminfo = new Consuminfo();
//                        consuminfo.type = "短信";
//                        consuminfo.cardNumber = number;
//                        consuminfo.consumData = sceneUse.data;
//                        consuminfos.add(consuminfo);
//                    } else {
//                        try {
//                            throw new Exception("本次短信发了" + (superPackage.smsCount + Math.floor(moblieCard.money / 0.1)) + "条,您的余额不足,请充值后在使用！");
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                        } finally {
//                            moblieCard.realSMSCount += superPackage.smsCount + Math.floor(moblieCard.money / 0.1);
//                            System.out.println(sceneUse.description);
//                            System.out.println("不存在此卡的消费记录，已添加一条消费记录");
//                            List<Consuminfo> consuminfos = cardUtil.consumInfos.get(number);
//                            if (consuminfos == null) {
//                                consuminfos = new ArrayList<>();
//                                cardUtil.consumInfos.put(number, consuminfos);
//                            }
//                            Consuminfo consuminfo = new Consuminfo();
//                            consuminfo.type = "短信";
//                            consuminfo.cardNumber = number;
//                            consuminfo.consumData = superPackage.smsCount + (int) Math.floor(moblieCard.money / 0.1);
//                            moblieCard.money = 0;
//                            consuminfos.add(consuminfo);
//                        }
//                    }
//                }
//            }
//            if ("通话".equals(sceneUse.type)) {
//                if (superPackage.talkTime >= sceneUse.data) {
//                    moblieCard.realTalkTime += sceneUse.data;
//                    System.out.println(sceneUse.description);
//                    System.out.println("不存在此卡的消费记录，已添加一条消费记录");
//                    List<Consuminfo> consuminfos = cardUtil.consumInfos.get(number);
//                    if (consuminfos == null) {
//                        consuminfos = new ArrayList<>();
//                        cardUtil.consumInfos.put(number, consuminfos);
//                    }
//                    Consuminfo consuminfo = new Consuminfo();
//                    consuminfo.type = "通话";
//                    consuminfo.cardNumber = number;
//                    consuminfo.consumData = sceneUse.data;
//                    consuminfos.add(consuminfo);
//                } else {
//                    int over = sceneUse.data - superPackage.talkTime;
//                    if ((over * 0.2) <= moblieCard.money) {
//                        moblieCard.realTalkTime += sceneUse.data;
//                        moblieCard.money -= over * 0.2;
//                        System.out.println(sceneUse.description);
//                        System.out.println("不存在此卡的消费记录，已添加一条消费记录");
//                        List<Consuminfo> consuminfos = cardUtil.consumInfos.get(number);
//                        if (consuminfos == null) {
//                            consuminfos = new ArrayList<>();
//                            cardUtil.consumInfos.put(number, consuminfos);
//                        }
//                        Consuminfo consuminfo = new Consuminfo();
//                        consuminfo.type = "通话";
//                        consuminfo.cardNumber = number;
//                        consuminfo.consumData = sceneUse.data;
//                        consuminfos.add(consuminfo);
//                    } else {
//                        try {
//                            throw new Exception("本次通话了" + (superPackage.talkTime + Math.floor(moblieCard.money / 0.2)) + "分钟,您的余额不足,请充值后在使用！");
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                        } finally {
//                            moblieCard.realTalkTime += (superPackage.talkTime + Math.floor(moblieCard.money / 0.2));
//                            System.out.println(sceneUse.description);
//                            System.out.println("不存在此卡的消费记录，已添加一条消费记录");
//                            List<Consuminfo> consuminfos = cardUtil.consumInfos.get(number);
//                            if (consuminfos == null) {
//                                consuminfos = new ArrayList<>();
//                                cardUtil.consumInfos.put(number, consuminfos);
//                            }
//                            Consuminfo consuminfo = new Consuminfo();
//                            consuminfo.type = "通话";
//                            consuminfo.cardNumber = number;
//                            consuminfo.consumData = (superPackage.talkTime + (int) Math.floor(moblieCard.money / 0.2));
//                            moblieCard.money = 0;
//                            consuminfos.add(consuminfo);
//                        }
//                    }
//                }
//            }
//            if ("上网".equals(sceneUse.type)) {
//                if (superPackage.flow >= sceneUse.data) {
//                    moblieCard.realFlow += sceneUse.data;
//                    System.out.println(sceneUse.description);
//                    System.out.println("不存在此卡的消费记录，已添加一条消费记录");
//                    List<Consuminfo> consuminfos = cardUtil.consumInfos.get(number);
//                    if (consuminfos == null) {
//                        consuminfos = new ArrayList<>();
//                        cardUtil.consumInfos.put(number, consuminfos);
//                    }
//                    Consuminfo consuminfo = new Consuminfo();
//                    consuminfo.type = "上网";
//                    consuminfo.cardNumber = number;
//                    consuminfo.consumData = sceneUse.data;
//                    consuminfos.add(consuminfo);
//                } else {
//                    int over = sceneUse.data - superPackage.flow;
//                    if ((over * 1024 * 0.1) <= moblieCard.money) {
//                        moblieCard.realFlow += sceneUse.data;
//                        moblieCard.money -= over * 1024 * 0.1;
//                        System.out.println(sceneUse.description);
//                        System.out.println("不存在此卡的消费记录，已添加一条消费记录");
//                        List<Consuminfo> consuminfos = cardUtil.consumInfos.get(number);
//                        if (consuminfos == null) {
//                            consuminfos = new ArrayList<>();
//                            cardUtil.consumInfos.put(number, consuminfos);
//                        }
//                        Consuminfo consuminfo = new Consuminfo();
//                        consuminfo.type = "上网";
//                        consuminfo.cardNumber = number;
//                        consuminfo.consumData = sceneUse.data;
//                        consuminfos.add(consuminfo);
//                    } else {
//                        try {
//                            throw new Exception("本次上网使用了" + (superPackage.flow * 1024 + Math.floor(moblieCard.money / 0.1)) + "MB,您的余额不足,请充值后在使用！");
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                        } finally {
//                            moblieCard.realFlow += (superPackage.flow + Math.floor(moblieCard.money / 0.1) / 1024);
//                            System.out.println(sceneUse.description);
//                            System.out.println("不存在此卡的消费记录，已添加一条消费记录");
//                            List<Consuminfo> consuminfos = cardUtil.consumInfos.get(number);
//                            if (consuminfos == null) {
//                                consuminfos = new ArrayList<>();
//                                cardUtil.consumInfos.put(number, consuminfos);
//                            }
//                            Consuminfo consuminfo = new Consuminfo();
//                            consuminfo.type = "上网";
//                            consuminfo.cardNumber = number;
//                            consuminfo.consumData = (superPackage.flow + (int) Math.floor(moblieCard.money / 0.1) / 1024);
//                            moblieCard.money = 0;
//                            consuminfos.add(consuminfo);
//                        }
//                    }
//                }
//            }
//        }
//    }
}
