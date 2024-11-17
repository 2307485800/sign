package lab.sign.test;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 演示
 */
@RestController
public class QRCodeController1 {

    @GetMapping(value = "/generate-qrcode", produces = MediaType.IMAGE_PNG_VALUE)
    public void generateQRCode(HttpServletResponse response) throws IOException, WriterException {
        // 目标 URL：百度
        String url = "https://www.baidu.com";

        // 创建二维码
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(url, BarcodeFormat.QR_CODE, 300, 300);

        // 将二维码输出为 PNG 图片
        response.setContentType(MediaType.IMAGE_PNG_VALUE);
        MatrixToImageWriter.writeToStream(bitMatrix, "PNG", response.getOutputStream());
    }
}
