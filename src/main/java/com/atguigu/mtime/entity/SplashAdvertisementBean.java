package com.atguigu.mtime.entity;

import java.util.List;

/**
 * Created by Administrator on 2016/4/8.
 */
public class SplashAdvertisementBean {

    /**
     * success : true
     * count : 8
     * advList : [{"type":"100","typeName":"开启页广告","isHorizontalScreen":false,"startDate":1460073601,"endDate":1460159999,"url":"http://img31.mtime.cn/mg/2016/04/07/150238.33518570.jpg","image":"","tag":"伦敦陷落","isOpenH5":false},{"type":"100","typeName":"开启页广告","isHorizontalScreen":false,"startDate":1461196801,"endDate":1461283199,"url":"http://img31.mtime.cn/mg/2016/04/07/121854.64974467.jpg","image":"","tag":"猎神","isOpenH5":false},{"type":"100","typeName":"开启页广告","isHorizontalScreen":false,"startDate":1461283201,"endDate":1461369599,"url":"http://img31.mtime.cn/mg/2016/04/07/121954.94333162.jpg","image":"","tag":"猎神","isOpenH5":false},{"type":"100","typeName":"开启页广告","isHorizontalScreen":false,"startDate":1461369601,"endDate":1461455999,"url":"http://img31.mtime.cn/mg/2016/04/07/122005.12276019.jpg","image":"","tag":"猎神","isOpenH5":false},{"type":"201","typeName":"即将上映banner","isHorizontalScreen":false,"startDate":1451606401,"endDate":1478044799,"url":"http://static1.mtime.cn/feature/mobile/item/2016/banner/0331/p7602102.html","image":"","tag":"中行10","isOpenH5":false},{"type":"301","typeName":"影院频道列表banner","isHorizontalScreen":false,"startDate":1451606401,"endDate":1482278399,"url":"http://static1.mtime.cn/feature/mobile/item/2016/banner/0331/p7601752.html","image":"","tag":"中行10","isOpenH5":false},{"type":"605","typeName":"新闻列表第3条下banner","isHorizontalScreen":false,"startDate":1456790401,"endDate":1479686399,"url":"http://static1.mtime.cn/feature/mobile/item/2016/banner/0331/p7602101.html","image":"","tag":"银联优惠购票活动","isOpenH5":false},{"type":"606","typeName":"具体文字新闻页底部banner","isHorizontalScreen":false,"startDate":1451606401,"endDate":1480636799,"url":"http://static1.mtime.cn/feature/mobile/item/2016/banner/0331/p7602101.html","image":"","tag":"银联","isOpenH5":false}]
     */

    private boolean success;
    private int count;
    /**
     * type : 100
     * typeName : 开启页广告
     * isHorizontalScreen : false
     * startDate : 1460073601
     * endDate : 1460159999
     * url : http://img31.mtime.cn/mg/2016/04/07/150238.33518570.jpg
     * image :
     * tag : 伦敦陷落
     * isOpenH5 : false
     */

    private List<AdvListBean> advList;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<AdvListBean> getAdvList() {
        return advList;
    }

    public void setAdvList(List<AdvListBean> advList) {
        this.advList = advList;
    }

    public static class AdvListBean {
        private String type;
        private String typeName;
        private boolean isHorizontalScreen;
        private int startDate;
        private int endDate;
        private String url;
        private String image;
        private String tag;
        private boolean isOpenH5;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getTypeName() {
            return typeName;
        }

        public void setTypeName(String typeName) {
            this.typeName = typeName;
        }

        public boolean isIsHorizontalScreen() {
            return isHorizontalScreen;
        }

        public void setIsHorizontalScreen(boolean isHorizontalScreen) {
            this.isHorizontalScreen = isHorizontalScreen;
        }

        public int getStartDate() {
            return startDate;
        }

        public void setStartDate(int startDate) {
            this.startDate = startDate;
        }

        public int getEndDate() {
            return endDate;
        }

        public void setEndDate(int endDate) {
            this.endDate = endDate;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public boolean isIsOpenH5() {
            return isOpenH5;
        }

        public void setIsOpenH5(boolean isOpenH5) {
            this.isOpenH5 = isOpenH5;
        }
    }
}
