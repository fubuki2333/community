package life.majiang.community.dto;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

/**
 * ClassName:HotTagDTO
 * Package:life.majiang.community.dto
 * Description:
 *
 * @Date:2020/2/6 下午 4:48
 * @Author:gaochenyu2020@163.com
 */
@Data
public class HotTagDTO implements Comparable{
    private String name;
    private Integer priority;

    @Override
    public int compareTo(@NotNull Object o) {
        return this.getPriority() - ((HotTagDTO)o).getPriority();
    }
}
