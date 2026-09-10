package org.example.infrastructure.dao.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商品活动配置
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ScSkuActivity {
    /** 渠道 */
    private String source;
    /** 来源 */
    private String channel;
    /** 商品ID */
    private String goods_id;
    /** 创建时间 */
    private String create_time;
    /** 更新时间 */
    private String update_time;
}
