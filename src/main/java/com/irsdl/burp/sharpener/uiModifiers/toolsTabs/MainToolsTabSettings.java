// Burp Suite Sharpener
// Released as open source by MDSec - https://www.mdsec.co.uk
// Developed by Soroush Dalili (@irsdl)
// Project link: https://github.com/mdsecresearch/BurpSuiteSharpener
// Released under AGPL see LICENSE for more information

package com.irsdl.burp.sharpener.uiModifiers.toolsTabs;

import com.coreyd97.BurpExtenderUtilities.Preferences;
import com.irsdl.burp.generic.BurpUITools;
import com.irsdl.burp.sharpener.SharpenerSharedParameters;
import com.irsdl.burp.sharpener.objects.PreferenceObject;
import com.irsdl.burp.sharpener.objects.StandardSettings;

import java.util.ArrayList;
import java.util.Collection;

public class MainToolsTabSettings extends StandardSettings {
    public MainToolsTabSettings(SharpenerSharedParameters sharedParameters) {
        super(sharedParameters);
        sharedParameters.printDebugMessage("ToolsTabSettings");
    }

    @Override
    public void init() {

    }

    @Override
    public Collection<PreferenceObject> definePreferenceObjectCollection() {
        Collection<PreferenceObject> preferenceObjectCollection = new ArrayList<>();

        for (BurpUITools.MainTabs tool : BurpUITools.MainTabs.values()) {
            PreferenceObject preferenceObject_isUnique_Tab = new PreferenceObject("isUnique_" + tool, Boolean.TYPE, false, Preferences.Visibility.GLOBAL);
            preferenceObjectCollection.add(preferenceObject_isUnique_Tab);
        }

        PreferenceObject preferenceObject_isToolTabPaneScrollable = new PreferenceObject("isToolTabPaneScrollable", Boolean.TYPE, false, Preferences.Visibility.GLOBAL);
        preferenceObjectCollection.add(preferenceObject_isToolTabPaneScrollable);

        PreferenceObject preferenceObject_ToolsThemeName = new PreferenceObject("ToolsThemeName", String.class, "hacker", Preferences.Visibility.GLOBAL);
        preferenceObjectCollection.add(preferenceObject_ToolsThemeName);

        PreferenceObject preferenceObject_ToolsIconSize = new PreferenceObject("ToolsIconSize", String.class, "10", Preferences.Visibility.GLOBAL);
        preferenceObjectCollection.add(preferenceObject_ToolsIconSize);

        PreferenceObject preferenceObject_ToolsThemeCustomPath = new PreferenceObject("ToolsThemeCustomPath", String.class, "", Preferences.Visibility.GLOBAL);
        preferenceObjectCollection.add(preferenceObject_ToolsThemeCustomPath);


        return preferenceObjectCollection;
    }

    @Override
    public synchronized void loadSettings() {
        sharedParameters.printDebugMessage("loadSettings");
        MainToolsTabStyleHandler.resetToolTabStylesFromSettings(sharedParameters);
    }
}
