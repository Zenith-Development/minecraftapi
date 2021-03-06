/*
 * MIT License
 *
 * Copyright (c) 2018 Stamina Development
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

package pw.stamina.minecraftapi.client

import pw.stamina.minecraftapi.MinecraftApi
import pw.stamina.minecraftapi.entity.living.ClientPlayer
import pw.stamina.minecraftapi.render.FontRenderer
import pw.stamina.minecraftapi.render.RenderManager
import pw.stamina.minecraftapi.world.World

interface Minecraft {

    val player: ClientPlayer

    val world: World

    val playerController: PlayerController

    val fontRenderer: FontRenderer

    val renderManager: RenderManager

    val scaledResolution: ScaledResolution

    val displayWidth: Int

    val displayHeight: Int

    var rightClickDelay: Int

    // TODO: Add ChatComponent based alternative when that API has been implemented
    fun printChatMessage(message: String)

    companion object {

        val minecraft: Minecraft
            get() = MinecraftApi.getAdapter().minecraft
    }
}
