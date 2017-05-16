package yy.com.groupavatardemo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private GroupAvatarView groupAvatarView;
    private List<Bitmap> allBitmapList = new ArrayList<>();
    private List<Bitmap> avatarBitmapList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        allBitmapList.add(BitmapFactory.decodeResource(getResources(), R.mipmap.avatar0));
        allBitmapList.add(BitmapFactory.decodeResource(getResources(), R.mipmap.avatar1));
        allBitmapList.add(BitmapFactory.decodeResource(getResources(), R.mipmap.avatar2));
        allBitmapList.add(BitmapFactory.decodeResource(getResources(), R.mipmap.avatar3));
        allBitmapList.add(BitmapFactory.decodeResource(getResources(), R.mipmap.avatar4));
        allBitmapList.add(BitmapFactory.decodeResource(getResources(), R.mipmap.avatar5));
        allBitmapList.add(BitmapFactory.decodeResource(getResources(), R.mipmap.avatar6));
        allBitmapList.add(BitmapFactory.decodeResource(getResources(), R.mipmap.avatar7));
        allBitmapList.add(BitmapFactory.decodeResource(getResources(), R.mipmap.avatar8));

        groupAvatarView = (GroupAvatarView) findViewById(R.id.activity_main_groupAvatarView);
        groupAvatarView.setGap(Util.dp2px(this, 4));

        groupAvatarView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avatarBitmapList.add(allBitmapList.get(new Random().nextInt(allBitmapList.size())));
                if (avatarBitmapList.size() > groupAvatarView.getMaxLineNum() * groupAvatarView.getMaxLineNum()) {
                    avatarBitmapList.clear();
                }
                groupAvatarView.setBitmapList(avatarBitmapList);
            }
        });
        groupAvatarView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (groupAvatarView.getArrangeGravity() == Gravity.START) {
                    groupAvatarView.setArrangeGravity(Gravity.CENTER);
                } else {
                    groupAvatarView.setArrangeGravity(Gravity.START);
                }
                return true;
            }
        });
    }
}
