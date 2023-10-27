package org.facedamon.door.config;

import org.springframework.util.StringUtils;

/**
 * @author facedamon
 * @date 2023/10/26 16:11
 */
public class StarterService {

    private String userStr;

    public StarterService(String userStr) {
        this.userStr = userStr;
    }

    public String[] split(String separatorChar) {
        return StringUtils.split(this.userStr, separatorChar);
    }
}
