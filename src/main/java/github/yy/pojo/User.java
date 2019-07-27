package github.yy.pojo;

/**
 * @program: day75-spring-mybatis
 * @author: yy
 * @create: 2019-07-26 20:49
 * Description: No Description
 */
public class User {

    private Integer id;//主键
    private String username;//用户名
    private String password;//密码
    private String name;//姓名

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}