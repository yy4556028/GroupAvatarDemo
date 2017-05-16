# GroupAvatarDemo
仿微信群组头像，并扩展，代码简单易懂

Gravity.Center 时为微信群组头像
groupAvatarView.setArrangeGravity(Gravity.CENTER);
![image](https://github.com/yy4556028/GroupAvatarDemo/blob/master/screenshots/Screenshot_20170516-230718.png)
![image](https://github.com/yy4556028/GroupAvatarDemo/blob/master/screenshots/Screenshot_20170516-230724.png)
![image](https://github.com/yy4556028/GroupAvatarDemo/blob/master/screenshots/Screenshot_20170516-230731.png)

Gravity.Start 时为仿桌面图标群组
groupAvatarView.setArrangeGravity(Gravity.START);
![image](https://github.com/yy4556028/GroupAvatarDemo/blob/master/screenshots/Screenshot_20170516-230741.png)
![image](https://github.com/yy4556028/GroupAvatarDemo/blob/master/screenshots/Screenshot_20170516-230748.png)

设置gap：
groupAvatarView.setGap(Util.dp2px(this, 4));

设置头像：
groupAvatarView.setBitmapList(avatarBitmapList);
