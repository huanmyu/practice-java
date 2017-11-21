package com.huanyu.serviceprovider;

import org.junit.Test;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class CharCodecTests {

    @Test
    public void getEncoderTest() {
        String encoderName = "I want encoder";
        String encoderResult = null;

        try {
            Iterator<CharCodec> ps = ServiceLoader.load(CharCodec.class).iterator();
            while (encoderResult == null && ps.hasNext()) {
                CharCodec d = ps.next();
                encoderResult = d.getEncoder(encoderName);
            }
        } catch (ServiceConfigurationError serviceError) {
            encoderResult = null;
        }
        assertThat(encoderResult, containsString(encoderName));
    }
}
