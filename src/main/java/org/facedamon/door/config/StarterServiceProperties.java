package org.facedamon.door.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author facedamon
 * @date 2023/10/26 16:12
 */
@ConfigurationProperties("facedamon.door")
public class StarterServiceProperties {

    private String userStr;

    public String getUserStr() {
        return userStr;
    }

    public void setUserStr(String userStr) {
        this.userStr = userStr;
    }
}
