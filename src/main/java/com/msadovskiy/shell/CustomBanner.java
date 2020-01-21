package com.msadovskiy.shell;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.shell.plugin.BannerProvider;
import org.springframework.shell.support.util.OsUtils;
import org.springframework.stereotype.Component;

@Component
//@Order(Ordered.HIGHEST_PRECEDENCE)
public class CustomBanner implements BannerProvider {

    @Override
    public String getBanner() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("=================================").append(OsUtils.LINE_SEPARATOR);
        stringBuffer.append("*        EcoBike Shell          *").append(OsUtils.LINE_SEPARATOR);
        stringBuffer.append("=================================").append(OsUtils.LINE_SEPARATOR);
        stringBuffer.append("Version:").append(this.getVersion());
        return stringBuffer.toString();
    }

    @Override
    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public String getWelcomeMessage() {
        return "Welcome to EcoBike Shell project";
    }

    @Override
    public String getProviderName() {
        return "EcoBike Banner";
    }
}
