# Android文字轮播控件
[![Apache 2.0 License](https://img.shields.io/badge/license-Apache%202.0-blue.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0.html)


现在的绝大数APP特别是类似淘宝京东等这些大型APP都有文字轮播界面，实现循环轮播多个广告词等功能；这种控件俗称“跑马灯”，而TextBannerView已经实现了可垂直跑、可水平跑的跑马灯了。


## 效果图
![](./someImg/textbanner.gif)

[Download Apk](https://github.com/zsml2016/TextBannerView/releases/download/1.0.2/demo-1.0.2.apk)


## <a name="1"></a>Attributes属性（TextBannerView布局文件中调用）
|Attributes|format|describe
|---|---|---|
|mvInterval| integer |动画间隔时间
|mvAnimDuration| integer |动画持续时间
|mvTextSize| dimension |设置文字尺寸
|mvTextColor| color |设置文字颜色
|mvSingleLine| boolean|是否为显示单行
|mvFont| |字体
|mvDirection| |文字轮播方向，默认水平从右到左轮播：right_to_left；还可以设置left_to_right（从左到右轮播）、bottom_to_top（从底部到顶部轮播）、top_to_bottom（从顶部到底部轮播）
|mvGravity| |文字对齐方式

## <a name="2"></a>方法
|方法名|描述|版本限制
|---|---|---|
|startWithList(List<T> messages)| 设置数据， |无
|startWithText(String message)| 设置开始文字切换（默认自动）|无

## 使用步骤

#### Step 1.依赖TextBannerView
Gradle 
```groovy
dependencies{
    compile 'com.superluo:textbannerview:1.0.5'  //最新版本
}
```


#### Step 2.在布局文件中添加TextBannerView，可以设置自定义属性

```xml
<com.gw.marqueview.MarqueeView
        android:id="@+id/marqueeView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="@color/colorAccent"
        android:layout_centerVertical="true"
        android:paddingLeft="20dp"
        android:paddingRight="20dp"
        android:layout_marginLeft="8dp"  />
```
* <a href="#1">点击可参考更多自定义属性</a>



#### Step 3.在Activity或者Fragment中配置TextBannerView 


```java
//初始化TextBannerView
TextBannerView tvBanner = (TextBannerView) findViewById(R.id.tv_banner);

//设置数据
mStringList = new ArrayList<>();
mStringList.add("主播公告111");
mStringList.add("主播公告222");

marqueeView.startWithList(mStringList);


Drawable drawable = getResources().getDrawable(R.mipmap.ic_launcher);
/**这里可以设置带图标的数据（1.0.2新方法），比setDatas方法多了带图标参数；
第一个参数：数据 。
第二参数：drawable. 
第三参数:drawable尺寸。
第四参数:图标位置仅支持Gravity.LEFT、Gravity.TOP、Gravity.RIGHT、Gravity.BOTTOM
*/
mTvBanner.setDatasWithDrawableIcon(mList,drawable,18, Gravity.LEFT);
        

//点击事件
        marqueeView.setOnItemClickListener(new MarqueeView.OnItemClickListener() {
            @Override
            public void onItemClick(int position, Object data) {
                Toast.makeText(MarqueeViewTestActivity.this, data.toString(), Toast.LENGTH_SHORT).show();
            }
        });

```








