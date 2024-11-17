package lab.sign.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/qrCode")
public class QRCodeController {

    @Autowired
    private QRCodeService qrCodeService;

    // 生成二维码接口
    @PostMapping(value = "/generateQRCode", produces = MediaType.IMAGE_PNG_VALUE)
    public byte[] generateQRCode(@RequestBody Member member) {
        try {
            // 调用QRCodeService生成二维码
            return qrCodeService.generateQRCode(member);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
