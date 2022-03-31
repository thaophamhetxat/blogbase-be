package thao.com.bewebblog.controller;

import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Aspect
@RestController
@RequestMapping("/blog/")
public class BlogController {
    private Logger logger = LoggerFactory.getLogger(BlogController.class);
}
