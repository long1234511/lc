package web.com.entity;

/**
 * @version V1.0.1
 * @classname User
 * @description:
 * @author: longcong
 * @email: longcong@aliyun.com
 * @date: 2018-09-21  16:26
 **/
public class User {
    private Integer id;
    private String name;
    private String age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
