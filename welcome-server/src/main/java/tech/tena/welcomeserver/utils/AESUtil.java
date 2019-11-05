package tech.tena.welcomeserver.utils;

import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AESUtil {

    // 加密
    public static String encrypt(String sSrc, String sKey, String charter)
            throws Exception {

        sSrc = URLEncoder.encode(sSrc, charter);

        if (sKey == null) {
            return null;
        }
        // 判断Key是否为16位
        if (sKey.length() != 16) {
            return null;
        }
        byte[] raw = sKey.getBytes(charter);
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");// "算法/模式/补码方式"
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
        byte[] encrypted = cipher.doFinal(sSrc.getBytes(charter));
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < encrypted.length; i++) {
            String hex = Integer.toHexString(encrypted[i] & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            sb.append(hex);
        }
        return sb.toString();
    }

    // 解密
    public static String decrypt(String sSrc, String sKey) throws Exception {
        try {

            byte[] byteRresult = new byte[sSrc.length() / 2];
            for (int i = 0; i < sSrc.length() / 2; i++) {
                int high = Integer.parseInt(sSrc.substring(i * 2, i * 2 + 1),
                        16);
                int low = Integer.parseInt(
                        sSrc.substring(i * 2 + 1, i * 2 + 2), 16);
                byteRresult[i] = (byte) (high * 16 + low);
            }
            // 判断Key是否正确
            if (sKey == null) {
                return null;
            }
            // 判断Key是否为16位
            if (sKey.length() != 16) {
                return null;
            }
            byte[] raw = sKey.getBytes("utf-8");
            SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec);

            try {
                byte[] original = cipher.doFinal(byteRresult);
                String originalString = new String(original, "utf-8");
                return URLDecoder.decode(originalString, "utf-8");
            } catch (Exception e) {
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
    }

}
