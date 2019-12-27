package life.majiang.community.model;

public class Question {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.id
     *
     * @mbg.generated Fri Dec 27 21:02:37 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.title
     *
     * @mbg.generated Fri Dec 27 21:02:37 CST 2019
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.gmt_create
     *
     * @mbg.generated Fri Dec 27 21:02:37 CST 2019
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.gmt_modified
     *
     * @mbg.generated Fri Dec 27 21:02:37 CST 2019
     */
    private Long gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.creator
     *
     * @mbg.generated Fri Dec 27 21:02:37 CST 2019
     */
    private Integer creator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.comment_count
     *
     * @mbg.generated Fri Dec 27 21:02:37 CST 2019
     */
    private Integer commentCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.view_count
     *
     * @mbg.generated Fri Dec 27 21:02:37 CST 2019
     */
    private Integer viewCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.like_count
     *
     * @mbg.generated Fri Dec 27 21:02:37 CST 2019
     */
    private Integer likeCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.tag
     *
     * @mbg.generated Fri Dec 27 21:02:37 CST 2019
     */
    private String tag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.description
     *
     * @mbg.generated Fri Dec 27 21:02:37 CST 2019
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.id
     *
     * @return the value of question.id
     *
     * @mbg.generated Fri Dec 27 21:02:37 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.id
     *
     * @param id the value for question.id
     *
     * @mbg.generated Fri Dec 27 21:02:37 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.title
     *
     * @return the value of question.title
     *
     * @mbg.generated Fri Dec 27 21:02:37 CST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.title
     *
     * @param title the value for question.title
     *
     * @mbg.generated Fri Dec 27 21:02:37 CST 2019
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.gmt_create
     *
     * @return the value of question.gmt_create
     *
     * @mbg.generated Fri Dec 27 21:02:37 CST 2019
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.gmt_create
     *
     * @param gmtCreate the value for question.gmt_create
     *
     * @mbg.generated Fri Dec 27 21:02:37 CST 2019
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.gmt_modified
     *
     * @return the value of question.gmt_modified
     *
     * @mbg.generated Fri Dec 27 21:02:37 CST 2019
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.gmt_modified
     *
     * @param gmtModified the value for question.gmt_modified
     *
     * @mbg.generated Fri Dec 27 21:02:37 CST 2019
     */
    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.creator
     *
     * @return the value of question.creator
     *
     * @mbg.generated Fri Dec 27 21:02:37 CST 2019
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.creator
     *
     * @param creator the value for question.creator
     *
     * @mbg.generated Fri Dec 27 21:02:37 CST 2019
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.comment_count
     *
     * @return the value of question.comment_count
     *
     * @mbg.generated Fri Dec 27 21:02:37 CST 2019
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.comment_count
     *
     * @param commentCount the value for question.comment_count
     *
     * @mbg.generated Fri Dec 27 21:02:37 CST 2019
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.view_count
     *
     * @return the value of question.view_count
     *
     * @mbg.generated Fri Dec 27 21:02:37 CST 2019
     */
    public Integer getViewCount() {
        return viewCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.view_count
     *
     * @param viewCount the value for question.view_count
     *
     * @mbg.generated Fri Dec 27 21:02:37 CST 2019
     */
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.like_count
     *
     * @return the value of question.like_count
     *
     * @mbg.generated Fri Dec 27 21:02:37 CST 2019
     */
    public Integer getLikeCount() {
        return likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.like_count
     *
     * @param likeCount the value for question.like_count
     *
     * @mbg.generated Fri Dec 27 21:02:37 CST 2019
     */
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.tag
     *
     * @return the value of question.tag
     *
     * @mbg.generated Fri Dec 27 21:02:37 CST 2019
     */
    public String getTag() {
        return tag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.tag
     *
     * @param tag the value for question.tag
     *
     * @mbg.generated Fri Dec 27 21:02:37 CST 2019
     */
    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.description
     *
     * @return the value of question.description
     *
     * @mbg.generated Fri Dec 27 21:02:37 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.description
     *
     * @param description the value for question.description
     *
     * @mbg.generated Fri Dec 27 21:02:37 CST 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}