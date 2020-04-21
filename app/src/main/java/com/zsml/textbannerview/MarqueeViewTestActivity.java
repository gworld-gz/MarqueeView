package com.zsml.textbannerview;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.widget.Toast;

import com.gw.marqueview.IMarqueeItem;
import com.gw.marqueview.MarqueeView;

import java.util.ArrayList;
import java.util.List;

public class MarqueeViewTestActivity extends Activity {
    private List<String> mStringList;
    private List<CustomModel> mCustomList;
    MarqueeView marqueeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initData();

    }


    private void initView() {
        setContentView(R.layout.fragment_tab);
        marqueeView = findViewById(R.id.marqueeView);

    }

    /**
     * <declare-styleable name="MarqueeViewStyle">
     *         <!--        动画间隔时间-->
     *         <attr name="mvInterval" format="integer|reference"/>
     *         <!--        动画持续时间-->
     *         <attr name="mvAnimDuration" format="integer|reference"/>
     *         <attr name="mvTextSize" format="dimension|reference"/>
     *         <attr name="mvTextColor" format="color|reference"/>
     *         <!--        是否单行显示-->
     *         <attr name="mvSingleLine" format="boolean"/>
     *         <!--        字体-->
     *         <attr name="mvFont" format="reference"/>
     *         <!--        文本对齐方式-->
     *         <attr name="mvGravity">
     *             <enum name="left" value="0"/>
     *             <enum name="center" value="1"/>
     *             <enum name="right" value="2"/>
     *         </attr>
     *         <!--        滚动方向设置-->
     *         <attr name="mvDirection">
     *             <!--        底部->顶部 滚动-->
     *             <enum name="bottom_to_top" value="0"/>
     *             <!--        顶部->底部 滚动-->
     *             <enum name="top_to_bottom" value="1"/>
     *             <!--        右->左 滚动-->
     *             <enum name="right_to_left" value="2"/>
     *             <!--        左->右 滚动-->
     *             <enum name="left_to_right" value="3"/>
     *         </attr>
     *     </declare-styleable>
     */
    private void initData() {

        //------自定义的消息列表------
        mCustomList = new ArrayList<CustomModel>();
        //CustomModel 需要实现IMarqueeItem接口
        mCustomList.add(new CustomModel());
//        marqueeView.startWithList(mCustomList);





        mStringList = new ArrayList<>();

        mStringList.add("主播公告111");
        mStringList.add("主播公告222");
//        mStringList.add("主播公告333");
//        mStringList.add("主播公告3223");
//        mStringList.add("aaaa主播公告3223");

        //设置字体
//        marqueeView.setTypeface(ResourcesCompat.getFont(this,R.font.huawenxinwei));
        // 文字列表滚动
        marqueeView.startWithList(mStringList);
//        marqueeView.startWithList(mStringList);
        // 文字列表滚动,带自定义动画
//        marqueeView.startWithList(mStringList,,R.anim.anim_top_in, R.anim.anim_bottom_out);


        //单条信息滚动
//        marqueeView.startWithText("单条公告", R.anim.anim_top_in, R.anim.anim_bottom_out);

        //点击事件
        marqueeView.setOnItemClickListener(new MarqueeView.OnItemClickListener() {
            @Override
            public void onItemClick(int position, Object data) {
                Toast.makeText(MarqueeViewTestActivity.this, data.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    private static class CustomModel implements IMarqueeItem {
        private String message;
        private int messageId;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getMessageId() {
            return messageId;
        }

        public void setMessageId(int messageId) {
            this.messageId = messageId;
        }

        @Override
        public String marqueeMessage() {
            return message;
        }
    }

}
