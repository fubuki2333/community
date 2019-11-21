package life.majiang.community.dto;

/**
 * ClassName:GithubUser
 * Package:life.majiang.community.dto
 * Description:
 *
 * @Date:2019/11/21 下午 1:50
 * @Author:gaochenyu2020@163.com
 */
public class GithubUser {
    private String name;
    private Long id;
    private String bio;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
