package com.company.Streams;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class decrypter {
    private InputStream is = null;

    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("You must provide a path as the first arguement"
                    + " and a dest as the second argument");
            System.exit(-1);
        }
        decrypter d = new decrypter();
        d.decrypt(args[0], args[1]);
    }

    public void decrypt(String path, String dest) {

        File of = new File(dest);
        if(of.exists())
        {
            of.delete();
        }
        OutputStream os = null;

        try {
            os = new FileOutputStream(of);
            is = new FileInputStream(new File(path));
            byte[] ifBytes = Files.readAllBytes(Paths.get(path));

            String key = "YEA56Lil7c2lML3C7tH4uDNbi+qrH3zmpz5JA3rQWb8=";
            byte[] byteKey = Base64.getDecoder().decode(key);

            Cipher aesCipher;
            aesCipher = Cipher.getInstance("AES");
            // aesCipher = Cipher.getInstance("AES/CFB8/NoPadding");
            SecretKey secKey = new SecretKeySpec(byteKey, "AES");
            aesCipher.init(Cipher.DECRYPT_MODE, secKey);
            byte[] output = read(ifBytes, secKey);
            os.write(output);
            os.flush();
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidAlgorithmParameterException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException | ShortBufferException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public byte[] read(byte[] bArr, SecretKey key) throws NoSuchAlgorithmException, NoSuchPaddingException,
            InvalidKeyException, InvalidAlgorithmParameterException, ShortBufferException, IllegalBlockSizeException,
            BadPaddingException, IOException {

        int i2 = 0;
        byte[] buf = new byte[20480 + 16];
        byte[] bArr2 = new byte[16];
        int i3 = 20480 + 16;
        while (i2 < 16) {
            InputStream inputStream = is;
            int read = inputStream.read();
            bArr2[i2] = (byte) read;
            i2++;
        }
        while (true) {
            if (i2 >= i3) {
                break;
            }
            InputStream inputStream2 = is;
            int read2 = inputStream2.read(buf, i2, i3 - i2);
            if (read2 == -1) {
                System.out.println((Object) "received -1 from underlying input stream");
                break;
            }
            i2 += read2;
        }
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
        IvParameterSpec mIv = ivParameterSpec;
        Cipher cipher = Cipher.getInstance("AES/CFB8/NoPadding");

        if (cipher != null) {
            cipher.init(2, key, ivParameterSpec);
            byte[] stripped = Arrays.copyOfRange(bArr, bArr2.length + 1, bArr.length);
            return cipher.doFinal(stripped);
//			if (i2 == i3) {
//				return cipher.doFinal(buf, 16, 20480, bArr, i);
//			}
//			return cipher.doFinal(buf, 16, i2 - 16, bArr, i);
        }
        return new byte[0];
    }
}