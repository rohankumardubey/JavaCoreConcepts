package com.company;

import java.nio.ByteBuffer;
import java.util.UUID;

public class UuidUtils {
    public static UUID asUuid(byte[] bytes) {
        ByteBuffer bb = ByteBuffer.wrap(bytes);
        long firstLong = bb.getLong();
        long secondLong = bb.getLong();
        return new UUID(firstLong, secondLong);
    }

    public static byte[] asBytes(UUID uuid) {
        ByteBuffer bb = ByteBuffer.wrap(new byte[16]);
        bb.putLong(uuid.getMostSignificantBits());
        bb.putLong(uuid.getLeastSignificantBits());
        return bb.array();
    }

    public static void main(String[] args) {
//        System.out.println(UUID.randomUUID());
//        5cdd3c61-9b89-435e-a902-e97857dc113e
    UUID sample2 = UUID.randomUUID();
    byte[] sample = asBytes(sample2);
    UUID sample1 = asUuid(sample);
        System.out.println(sample1);
        System.out.println(sample.toString());
        System.out.println(sample2);
    }

}
