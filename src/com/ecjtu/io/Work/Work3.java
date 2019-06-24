package com.ecjtu.io.Work;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Create by czq
 * time on 2019/6/19  16:19
 */
public class Work3 {
    public static void main(String[] args) {
        User user = new User("李飞", "1234");
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file\\user.dat"));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file\\user.dat"));
            oos.writeObject(user);
            oos.flush();
            User newUser = (User) ois.readObject();
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("File\\database.txt")));
            String line;
            List<String> listJuify = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                listJuify.add(line);
            }
            String str = listJuify.get(0);
            int index = str.indexOf(":");
            String username = str.substring(index + 1);
            String str1 = listJuify.get(1);
            int index1 = str1.indexOf(":");
            String password = str1.substring(index1 + 1);
            System.out.println();
            if (newUser.getUsername().equals(username) && newUser.getPassword().equals(password)) {
                System.out.println("用户登录成功！！");
            } else {
                System.out.println("用户名或密码不正确!!");
            }

            oos.close();
            ois.close();
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}

class User implements Serializable {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
