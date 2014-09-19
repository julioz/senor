package br.com.mobicare.mvp.test;

import org.mockito.MockitoAnnotations;

import android.test.InstrumentationTestCase;

public class PresenterTest extends InstrumentationTestCase {

    public void setUp() {
	System.setProperty("dexmaker.dexcache", getInstrumentation().getTargetContext().getCacheDir().getPath());
	MockitoAnnotations.initMocks(this);
    }
}