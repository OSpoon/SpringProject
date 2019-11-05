package tech.tena.welcomeserver.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import tech.tena.welcomeserver.bean.Dec;
import tech.tena.welcomeserver.bean.Enc;
import tech.tena.welcomeserver.utils.AESUtil;


@RestController
@Api(tags = "AES加解密")
@RequestMapping("/aes")
public class AesController {

    @PostMapping("/encrypt")
    @ApiOperation("AES加密")
    public String encrypt(@RequestBody Enc enc) {
        String dec = "";
        int code = 400;
        try {
            dec = AESUtil.encrypt(enc.getsEnc(), enc.getKey(), "UTF-8");
            System.out.println(dec);
            code = 200;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "{\"code\":" + code + ", \"result\":" + dec + "}";
    }

    @PostMapping("/decrypt")
    @ApiOperation("AES解密")
    public String decrypt(@RequestBody Dec dec) {
        String enc = "";
        int code = 400;
        try {
            enc = AESUtil.decrypt(dec.getsDec(), dec.getKey());
            System.out.println(enc);
            code = 200;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "{\"code\":" + code + ", \"result\":" + enc + "}";
    }
}
