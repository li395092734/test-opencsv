package com.lydms.testopencsv.web;

import com.lydms.testopencsv.common.Result;
import com.lydms.testopencsv.service.TestCsvService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


/**
 * @author
 */
@RestController
@RequestMapping("/add")
public class TestCsvController {
    private static final Logger logger = LogManager.getLogger(TestCsvController.class);

    @Autowired
    private TestCsvService testCsvService;


    /**
     * 通过文档添加英语
     *
     * @param file
     * @return
     */
    @RequestMapping(value = "/file", method = {RequestMethod.POST})
    public Result addFile(@RequestParam MultipartFile file) throws IOException {
        logger.info("开始通过文件添加单词");

        testCsvService.csvDataMethod1(file);
        testCsvService.csvDataMethod2(file);
        testCsvService.csvDataMethod3(file);

        return null;
    }

}