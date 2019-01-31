/*
 * Copyright (c) 2019 bartimaeusnek
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.github.bartimaeusnek.bartworks.common.loaders;

import com.github.bartimaeusnek.bartworks.API.BioVatLogicAdder;
import cpw.mods.fml.common.Loader;

/**
 * Autogenerated run file, script Created on Wed Jan  2 19:11:07 2019 by boubou_19 and bartimaeusnek
 * Executed on 2019-01-03 02:08:43
 * modified by bartimaeusnek to only add blocks that mods are loaded
 */
public class GTNHBlocks implements Runnable {

    @Override
    public void run() {
        BioVatLogicAdder.BioVatGlass.addCustomGlass("minecraft", "glass", 0, 3);
        BioVatLogicAdder.BioVatGlass.addCustomGlass("IC2", "blockAlloyGlass", 0, 4);

        if (Loader.isModLoaded("BloodArsenal"))
            BioVatLogicAdder.BioVatGlass.addCustomGlass("BloodArsenal", "blood_stained_glass", 0, 3);
        if (Loader.isModLoaded("Botany"))
            BioVatLogicAdder.BioVatGlass.addCustomGlass("Botany", "stained", 0, 3);
        if (Loader.isModLoaded("EnderIO"))
            for (int i = 0; i <= 5; ++i)
                BioVatLogicAdder.BioVatGlass.addCustomGlass("EnderIO", "blockFusedQuartz", i, 3);

        if (Loader.isModLoaded("ExtraUtilities")) {
            BioVatLogicAdder.BioVatGlass.addCustomGlass("ExtraUtilities", "decorativeBlock1", 9, 3);
            for (int i = 0; i <= 11; ++i)
                BioVatLogicAdder.BioVatGlass.addCustomGlass("ExtraUtilities", "decorativeBlock2", i, 3);
            for (int i = 0; i <= 5; ++i)
                BioVatLogicAdder.BioVatGlass.addCustomGlass("ExtraUtilities", "etherealglass", i, 3);
        }
        if (Loader.isModLoaded("GalaxySpace"))
            BioVatLogicAdder.BioVatGlass.addCustomGlass("GalaxySpace", "futureglass", 0, 3);
        if (Loader.isModLoaded("HardcoreEnderExpension"))
            BioVatLogicAdder.BioVatGlass.addCustomGlass("HardcoreEnderExpension", "laboratory_glass", 0, 3);

        if (Loader.isModLoaded("Natura"))
            for (int i = 0; i <= 1; ++i)
                BioVatLogicAdder.BioVatGlass.addCustomGlass("Natura", "NetherGlass", i, 3);

        if (Loader.isModLoaded("RandomThings"))
            BioVatLogicAdder.BioVatGlass.addCustomGlass("RandomThings", "spectreGlass", 0, 3);
        if (Loader.isModLoaded("TConstruct"))
            BioVatLogicAdder.BioVatGlass.addCustomGlass("TConstruct", "GlassBlock", 0, 3);
        if (Loader.isModLoaded("tectech"))
            BioVatLogicAdder.BioVatGlass.addCustomGlass("tectech", "tile.quantumGlass", 0, 8);

        if (Loader.isModLoaded("chisel"))
            BioVatLogicAdder.BioVatGlass.addCustomGlass("chisel", "glass2", 0, 3);

        for (int i = 0; i <= 15; ++i) {
            BioVatLogicAdder.BioVatGlass.addCustomGlass("minecraft", "stained_glass", i, 3);
            if (Loader.isModLoaded("GalaxySpace"))
                BioVatLogicAdder.BioVatGlass.addCustomGlass("GalaxySpace", "futureglasses", i, 3);
            if (Loader.isModLoaded("Railcraft"))
                BioVatLogicAdder.BioVatGlass.addCustomGlass("Railcraft", "glass", i, 3);
            if (Loader.isModLoaded("TConstruct"))
                BioVatLogicAdder.BioVatGlass.addCustomGlass("TConstruct", "GlassBlock.StainedClear", i, 3);
            if (Loader.isModLoaded("Ztones"))
                BioVatLogicAdder.BioVatGlass.addCustomGlass("Ztones", "tile.glaxx", i, 3);
            if (Loader.isModLoaded("chisel")) {
                BioVatLogicAdder.BioVatGlass.addCustomGlass("chisel", "glass", i, 3);
                BioVatLogicAdder.BioVatGlass.addCustomGlass("chisel", "stained_glass_white", i, 3);
                BioVatLogicAdder.BioVatGlass.addCustomGlass("chisel", "stained_glass_yellow", i, 3);
                BioVatLogicAdder.BioVatGlass.addCustomGlass("chisel", "stained_glass_lightgray", i, 3);
                BioVatLogicAdder.BioVatGlass.addCustomGlass("chisel", "stained_glass_brown", i, 3);
                BioVatLogicAdder.BioVatGlass.addCustomGlass("chisel", "stained_glass_forestry", i, 3);
            }
            if (Loader.isModLoaded("witchery"))
                BioVatLogicAdder.BioVatGlass.addCustomGlass("witchery", "shadedglass", i, 3);
        }
    }
}