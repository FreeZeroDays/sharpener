// Burp Suite Sharpener
// Released as open source by MDSec - https://www.mdsec.co.uk
// Developed by Soroush Dalili (@irsdl)
// Project link: https://github.com/mdsecresearch/BurpSuiteSharpener
// Released under AGPL see LICENSE for more information

// Burp Suite Sharpener
// Released as open source by MDSec - https://www.mdsec.co.uk
// Developed by Soroush Dalili (@irsdl)
// Project link: https://github.com/mdsecresearch/BurpSuiteSharpener
// Released under AGPL see LICENSE for more information

package com.mdsec.burp.sharpener.uiSelf.contextMenu;

import com.mdsec.burp.sharpener.SharpenerSharedParameters;
import com.irsdl.objects.PreferenceObject;
import com.irsdl.objects.StandardSettings;

import java.util.Collection;

public class ContextMenuSettings extends StandardSettings {
    protected ContextMenuSettings(SharpenerSharedParameters sharedParameters) {
        super(sharedParameters);
    }

    @Override
    public void init() {

    }

    @Override
    public Collection<PreferenceObject> definePreferenceObjectCollection() {
        return null;
    }

    @Override
    public void loadSettings() {

    }

    @Override
    public void unloadSettings() {

    }

}
