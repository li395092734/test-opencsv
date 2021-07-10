package com.lydms.testopencsv.service;

import com.lydms.testopencsv.domain.CsvFile;
import com.lydms.testopencsv.utils.CsvUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class TestCsvService {

    private static final Logger logger = LogManager.getLogger(TestCsvService.class);


    public void csvDataMethod1(MultipartFile file) {
        List<CsvFile> csvFileList = CsvUtils.getCsvDataMethod1(file);
        for (CsvFile csvFile : csvFileList) {
            logger.info(csvFile);
        }
    }


    public void csvDataMethod2(MultipartFile file) {
        List<String[]> csvDataMethod2 = CsvUtils.getCsvDataMethod2(file);
        for (String[] strings : csvDataMethod2) {
            for (String s : strings) {
                System.out.print(s + " _ ");
                logger.info(s + "_");
            }
            logger.info("");
        }
    }


    public void csvDataMethod3(MultipartFile file) {
        List<CsvFile> csvFileList = CsvUtils.getCsvDataMethod3(file, CsvFile.class);

        for (CsvFile csvFile : csvFileList) {
            logger.info(csvFile);
        }
    }
}
