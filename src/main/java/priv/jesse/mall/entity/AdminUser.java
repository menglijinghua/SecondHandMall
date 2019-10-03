package priv.jesse.mall.entity;


import javax.persistence.*;
import java.io.Serializable;

/**
 * 管理员用户
 */
@Entity
public class AdminUser implements Serializable {
    /**
     * Entity 指这个类映射到数据库表， 当你不使用这个类（被注解的类）时，后台不会对其进行处理，
     * 只有当你从数据库读取数据时，由于你要读取的表映射有实体类（被@Entity注释的），
     * 那么后台应该会自动帮你实例化一个对象， 然后将数据库中的数据填充到对象中
     */

    /**
     * persistence这个包的作用是持久化，
     * 就是在实体类中进行元数据标签的作用，
     * 使得实体类与数据库中的表建立映射关系
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column
    private Integer id;

    @Column(nullable = false)
    private String username;

    @Column
    private String password;

    public AdminUser(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public AdminUser() {
        super();
    }

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
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AdminUser other = (AdminUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
                && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}