package commonUtils;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.IOException;

/**
 * Created by Zhangx on 2017/6/7 at 18:04.
 * 下载文件
 */
public class FIleDownload
{
    //springmvc中支持的下载
    @RequestMapping("/downfile2")
    public ResponseEntity<byte[]> download() throws IOException
    {
        File file = new File("c:\\ajaxutils.txt");
        //处理显示中文文件名的问题
        String fileName = new String(file.getName().getBytes("utf-8"), "ISO-8859-1");
        //设置请求头内容,告诉浏览器代开下载窗口
        HttpHeaders headers = new HttpHeaders();
        headers.setContentDispositionFormData("attachment", fileName);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),
                headers, HttpStatus.CREATED);
    }
}
