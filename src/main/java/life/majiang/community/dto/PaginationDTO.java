package life.majiang.community.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:PaginationDTO
 * Package:life.majiang.community.dto
 * Description:
 *
 * @Date:2019/12/12 下午 11:26
 * @Author:gaochenyu2012@126.com
 */
@Data
public class PaginationDTO {
    private List<QuestionDTO> questions;
    private boolean showPrecious;
    private boolean showFirstPage;
    private boolean showNext;
    private boolean showEndPage;
    private Integer page;
    private List<Integer> pages = new ArrayList<>();
    private Integer totalPage;

    public void setPagination(Integer totalPage, Integer page) {

        this.totalPage = totalPage;
        this.page = page;

        pages.add(page);
        for(int i = 1;i <= 3;i++){
            if(page - i > 0){
                pages.add(0,page - i);
            }

            if(page + i <= totalPage){
                pages.add(page + i);
            }
        }

        // 是否展示上一页
        if (page == 1) {
            showPrecious = false;
        } else {
            showPrecious = true;
        }

        // 是否展示下一页
        if (page == totalPage) {
            showNext = false;
        } else {
            showNext = true;
        }

        // 是否展示第一页
        if (pages.contains(1)){
            showFirstPage = false;
        }else {
            showFirstPage = true;
        }

        // 是否展示最后一页
        if (pages.contains(totalPage)){
            showEndPage = false;
        } else {
            showEndPage = true;
        }
    }
}
