<h1 align="center">ComposeViews</h1>

<p align="center">Jetpack(jb) Compose Views, in to Android,Web,Desktop,Ios...(kmp is supported)</p>

<p align="center">
<img src="https://img.shields.io/badge/license-Apache%202-blue.svg?maxAge=2592000">
<img src="https://jitpack.io/v/ltttttttttttt/ComposeViews.svg"/>
</p>

<div align="center">us English | <a href="https://github.com/ltttttttttttt/ComposeViews/blob/main/README_CN.md">cn 简体中文</a> | <a href="https://sakurajimamaii.github.io/ComposeViewsDocs/">detailed documentation</a></div>

## Views:

1. ComposePager
2. Banner
3. PagerIndicator
4. ImageBanner
5. RefreshLayout + PullToRefresh + VerticalRefreshableLayout
6. FlowLayout
7. ValueSelector + DateSelector
8. MenuFloatingActionButton
9. ChainScrollableComponent + ScrollableAppBar + SwipeToDismiss

<a href="https://github.com/ltttttttttttt/ComposeViews/blob/main/md_resource/compose_views_demo.apk">
View demo</a>

## Add to your project

Step 1.Root dir, build.gradle.kts add:

```kotlin
buildscript {
    repositories {
        maven("https://jitpack.io")//this
        ...
    }
}

allprojects {
    repositories {
        maven("https://jitpack.io")//this
        ...
    }
}
```

Step 2.Your app dir, build.gradle.kts add:

version
= [![](https://jitpack.io/v/ltttttttttttt/ComposeViews.svg)](https://jitpack.io/#ltttttttttttt/ComposeViews)

```kotlin
dependencies {
    ...
    //common target
    implementation("com.github.ltttttttttttt.ComposeViews:core:$version")//this, such as 1.3.4
    //android target(If it is android project, just use this)
    implementation("com.github.ltttttttttttt.ComposeViews:maven_android:$version")//this, such as 1.3.4
    //desktop target
    implementation("com.github.ltttttttttttt.ComposeViews:maven_desktop:$version")//this, such as 1.3.4
}
```

## ComposePager

<div align=center><img src="md_resource/compose_pager.gif" width=25%></div>

```kotlin
/**
 * Equivalent to the ViewPager in android
 * @param pageCount Sum page count
 * @param modifier
 * @param composePagerState ComposePager's state
 * @param orientation Scroll orientation
 * @param userEnable Whether the user can scroll
 * @param pageCache The number of pagers cached on the left and right sides
 * @param scrollableInteractionSource Scroll state monitor
 * @param content Content of compose
 */
@Composable
fun ComposePager()
```

## Banner

```kotlin
/**
 * [ComposePager] that can auto scroll
 * @param pageCount Sum page count
 * @param modifier
 * @param bannerState Banner's state
 * @param orientation Scroll orientation
 * @param userEnable Whether the user can scroll
 * @param autoScroll Whether to scroll automatically
 * @param autoScrollTime Auto scroll interval
 * @param content Content of compose
 */
@Composable
fun Banner()
```

## PagerIndicator

<div align=center><img src="md_resource/image_banner.gif" width=50%></div>

<div align=center><img src="md_resource/text_pager_indicator.gif" width=50%></div>

```kotlin
/**
 * Indicator for pager
 * @param size Number of indicator
 * @param offsetPercentWithSelect The offset percentage of the selected indicator
 * @param selectIndex The index of selected indicator
 * @param indicatorItem The indicator
 * @param selectIndicatorItem The selected indicator
 * @param modifier
 * @param margin Spacing between indicators
 * @param orientation Orientation of indicators
 * @param userCanScroll Whether the user can scroll
 */
@Composable
fun PagerIndicator()

/**
 * Text indicator for pager
 * @param texts The text list
 * @param offsetPercentWithSelect The offset percentage of the selected indicator
 * @param selectIndex The index of selected indicator
 * @param fontSize Font size of the text indicator
 * @param selectFontSize Font size of the selected text indicator
 * @param textColor Font color of the text indicator
 * @param selectTextColor Font color of the selected text indicator
 * @param selectIndicatorColor Color of the indicator
 * @param onIndicatorClick Click event of the text indicator
 * @param modifier
 * @param margin Spacing between the text indicators
 * @param userCanScroll Whether the user can scroll
 */
@Composable
fun TextPagerIndicator()
```

## ImageBanner

```kotlin
/**
 * [Banner] showing images
 * @param imageSize Number of images
 * @param imageContent Content of the images
 * @param indicatorItem The indicator, if null, do not display indicator
 * @param selectIndicatorItem The indicator, if null, do not display indicator
 * @param modifier
 * @param bannerState Banner's state
 * @param orientation Orientation of indicators
 * @param autoScroll Whether to scroll automatically
 * @param autoScrollTime Auto scroll interval
 */
@Composable
fun ImageBanner()
```

## RefreshLayout

<div align=center><img src="md_resource/refresh_layout.gif" width=30%></div>

```kotlin
/**
 * The refreshed container can be dragged in any direction
 * @param refreshContent Refreshed content area
 * @param refreshLayoutState State of the [RefreshLayout]
 * @param modifier
 * @param refreshContentThreshold Refresh threshold for layout dragging
 * @param composePosition Set where the refreshed layout is located
 * @param contentIsMove Whether the content component moves with it on refresh
 * @param dragEfficiency The 'efficiency' of dragging
 * @param isSupportCanNotScrollCompose Whether to support non-scrollable components
 * @param userEnable Whether the user can drag
 * @param content Content of compose
 */
@Composable
fun RefreshLayout()

/**
 * Pull down to refresh
 * @param refreshLayoutState State of the [RefreshLayout]
 * @param modifier
 * @param refreshContent Refreshed content area
 * @param content Content of compose
 */
@Composable
fun PullToRefresh()

/**
 * Pull down and up refresh components
 * @param topRefreshLayoutState State of the top of the [RefreshLayout]
 * @param bottomRefreshLayoutState State of the bottom of the [RefreshLayout]
 * @param modifier
 * @param topRefreshContent Refreshed content area of top
 * @param bottomIsLoadFinish Bottom is it loaded
 * @param bottomRefreshContent Refreshed content area of bottom
 * @param content Content of compose
 */
@Composable
fun VerticalRefreshableLayout()
```

## FlowLayout

<div align=center><img src="md_resource/flow_layout.png" width=40%></div>

```kotlin
/**
 * Linear layout with word wrapping
 * @param modifier
 * @param orientation Direction of arrangement
 * @param horizontalAlignment Alignment of horizontal
 * @param verticalAlignment Alignment of vertical
 * @param horizontalMargin Margin of horizontal
 * @param verticalMargin Margin of vertical
 * @param maxLines How many lines can be placed
 * @param content Content of compose
 */
@Composable
fun FlowLayout()

/**
 * [FlowLayout] that can automatically determine the selected state
 */
@Composable
fun LabelsFlowLayout()
```

## ValueSelector and DateSelector

<div align=center><img src="md_resource/date_selector.gif" width=30%></div>

```kotlin
/**
 * Date Selector
 * @param state DateSelector's state
 * @param modifier 
 * @param isLoop Whether the value list is loop
 */
@Composable
fun DateSelector()

/**
 * Value selector
 */
@Composable
fun ValueSelector()
```

## MenuFloatingActionButton

<div align=center><img src="md_resource/fab.gif" width=20%></div>

```kotlin
/**
 * Floating action button
 * @param icon Menu icon
 * @param label Menu text
 * @param srcIconColor Icon color
 * @param labelTextColor Label text color
 * @param labelBackgroundColor Background color of label text
 * @param fabBackgroundColor Background color of floating action button
 */
@Composable
fun MenuFloatingActionButton()
```

## ChainScrollableComponent

<div align=center><img src="md_resource/scrollable_app_bar.gif" width=40%></div>

<div align=center><img src="md_resource/swipe_to_dismiss.gif" width=20%></div>

```kotlin
/**
 * Chain scrollable component
 * @param minScrollPosition Minimum scroll position
 * @param maxScrollPosition Maximum scroll position
 * @param chainContent Content of chain
 * @param modifier
 * @param onScrollStop Callback of scroll stop event
 * @param composePosition Set the position of the top bar layout
 * @param chainMode Chain mode
 * @param content Content of compose
 */
@Composable
fun ChainScrollableComponent()

/**
 * Scalable top navigation bar
 * @param title Title of top bar
 * @param background Background of top bar
 * @param modifier
 * @param onScrollStop Callback of scroll stop event
 * @param minScrollPosition Minimum scroll position
 * @param maxScrollPosition Maximum scroll position
 * @param navigationIcon Icon of top bar
 * @param composePosition Set the position of the top bar layout
 * @param chainMode Chain mode
 * @param content Content of compose
 */
@Composable
fun ScrollableAppBar()

/**
 * Swipe to delete controls
 * @param minScrollPosition Minimum scroll position
 * @param maxScrollPosition Maximum scroll position
 * @param backgroundContent Content of background
 * @param modifier
 * @param contentIsMove Does content follow
 * @param content Content of compose
 */
@Composable
fun SwipeToDismiss()
```

# More

<div align=center><img src="md_resource/star_bar.gif" width=20%></div>

<div align=center><img src="md_resource/text_field.png" width=30%></div>

```kotlin
/**
 * Button without click effect
 */
@Composable
fun ButtonWithNotRipple()

/**
 * Star bar
 */
@Composable
fun StarBar()

/**
 * Progress bar
 */
@Composable
fun BasicsProgressBar()

/**
 * More convenient and easy to use the [TextField]
 */
@Composable
fun GoodTextField()

/**
 * More convenient and easy to use the [TextField], for entering passwords
 * Api is almost the same as the [GoodTextField]
 */
@Composable
fun PasswordTextField()
```

## proguard-rules

```
-keepclassmembers class androidx.compose.ui.graphics.AndroidImageBitmap_androidKt{
public *** asImageBitmap(...);
}
-keepclassmembers class androidx.compose.ui.platform.AndroidCompositionLocals_androidKt{
public *** getLocalContext(...);
}
-keepclassmembers class androidx.compose.foundation.OverscrollConfigurationKt{
public *** getLocalOverscrollConfiguration(...);
}
```

And drawable name:

```
compose_views_refresh_layout_loading
compose_views_refresh_layout_arrow
compose_views_password_show
compose_views_password_hide
star_bar_star_select
star_bar_star
```

<h6>Finally, thank <a href="https://www.jetbrains.com/?from=ltviews" target="_blank">JetBrains</a>
for its support to this project<h6>
