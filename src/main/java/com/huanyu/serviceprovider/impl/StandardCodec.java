package com.huanyu.serviceprovider.impl;

import com.huanyu.serviceprovider.CharCodec;

public class StandardCodec extends CharCodec{
    @Override
    public String getEncoder(String encodingName) {
        return "encoder ... " + encodingName;
    }

    @Override
    public String getDecoder(String encodingName) {
        return "decoder ..." + encodingName;
    }
}
