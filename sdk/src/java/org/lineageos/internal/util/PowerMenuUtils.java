/*
 * SPDX-FileCopyrightText: The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.lineageos.internal.util;

import android.content.Context;

import lineageos.providers.LineageSettings;

public final class PowerMenuUtils {
    public static boolean isAdvancedRestartPossible(final Context context) {
        return LineageSettings.Secure.getInt(context.getContentResolver(),
                LineageSettings.Secure.ADVANCED_REBOOT, 0) == 1;
    }
}
