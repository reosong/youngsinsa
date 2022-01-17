package project.youngsinsa.admin;

import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

public class Config {
    // ADD START
    @Bean
    public CommonsMultipartResolver multipartResolver() {
        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
        commonsMultipartResolver.setDefaultEncoding("UTF-8");
        commonsMultipartResolver.setMaxUploadSizePerFile(5 * 1024 * 1024);
        return commonsMultipartResolver;
    }
    // ADD END
}
