/*
 * Copyright lt 2022
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lt.compose_views.scrollable_appbar

import androidx.compose.animation.core.Animatable
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

/**
 * creator: lt  2022/9/29  lt.dygzs@qq.com
 * effect : ChainScrollableComponent的状态
 * warning:
 */
class ChainScrollableComponentState internal constructor(
    val minPx: Int,
    val maxPx: Int,
    private val coroutineScope: CoroutineScope,
) {
    //滚动的位置的动画对象
    internal val scrollPosition = Animatable(maxPx.toFloat())

    /**
     * 获取滚动的位置的值
     */
    fun getScrollPositionValue(): Float = scrollPosition.value

    /**
     * 获取滚动的位置的百分比,0f-1f,min-max
     */
    fun getScrollPositionPercentage(): Float = TODO()

    /**
     * 修改滚动的位置
     */
    fun setScrollPosition(value: Float) {
        coroutineScope.launch {
            scrollPosition.snapTo(value)
        }
    }

    /**
     * 以动画形式修改滚动的位置
     */
    fun setScrollPositionWithAnimate(value: Float) {
        coroutineScope.launch {
            scrollPosition.animateTo(value)
        }
    }
}