package com.imooc.security;

import java.io.IOException;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 09:54
 */
public class ImoocBase64 {

    private static String src = "imooc security base64";

    public static void main(String[] args) throws IOException {
        jdkBase64();
    }

    public static void jdkBase64() throws IOException {
        try {
            BASE64Encoder encoder = new BASE64Encoder();
            String encode = encoder.encode(src.getBytes());
            System.out.println("encode: " + encode);

            BASE64Decoder decoder = new BASE64Decoder();
            String decode = new String(decoder.decodeBuffer(encode));
            System.out.println("decode: " + decode);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
