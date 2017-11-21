package com.huanyu.serviceprovider;
/*
 * 实践 https://docs.oracle.com/javase/1.5.0/docs/guide/jar/jar.html#Service%20Provider
 */
public abstract class CharCodec {
    public abstract String getEncoder(String encodingName);
    public abstract String getDecoder(String encodingName);
}
