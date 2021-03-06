package com.microsoft.graph.core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.logging.Logger;

import com.microsoft.graph.authentication.IAuthenticationProvider;
import com.microsoft.graph.authentication.MockAuthenticationProvider;
import com.microsoft.graph.logger.DefaultLogger;
import com.microsoft.graph.logger.ILogger;

/**
 * Test cases for {@see DefaultClientConfig}
 */
public class DefaultClientConfigTests {

	private IClientConfig mClientConfig;
    private IAuthenticationProvider mAuthenticationProvider;
	
	@Before
	public void setUp() throws Exception {
		mAuthenticationProvider = new MockAuthenticationProvider();
        mClientConfig = DefaultClientConfig.createWithAuthenticationProvider(mAuthenticationProvider);
	}

	@Test
	public void testDefaultClientConfig() {
        assertNotNull(mAuthenticationProvider);
        assertNotNull(mClientConfig);
        assertNotNull(mClientConfig.getLogger());
        assertNotNull(mClientConfig.getExecutors());
        assertNotNull(mClientConfig.getSerializer());
        assertNotNull(mClientConfig.getHttpProvider());
        assertNotNull(mClientConfig.getAuthenticationProvider());
        assertEquals(mAuthenticationProvider, mClientConfig.getAuthenticationProvider());
    }
	
    @Test
    public void testOverrideLoggerShouldNotThrow() {
        final ILogger logger = new DefaultLogger();
        DefaultClientConfig config = new DefaultClientConfig() {

            @Override
            public ILogger getLogger() {
                return logger;
            }

        };
        config.getExecutors();
        config.getAuthenticationProvider();
        config.getHttpProvider();
        config.getSerializer();
        config.getLogger();
    }

}
