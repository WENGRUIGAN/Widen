package com.wrg.widen.Model;

import java.util.List;

/**
 * Created by 翁 on 2017/9/8.
 */

public class ClassifyDetailEntity {


    /**
     * categoryInfo : {"dataType":"CategoryInfo","id":2,"name":"创意","description":"技术与审美结合，探索视觉的无限可能","headerImage":"http://img.kaiyanapp.com/78452493130483ad6416c191b6be4cb6.png","actionUrl":"eyepetizer://category/2/?title=%E5%88%9B%E6%84%8F","follow":{"itemType":"category","itemId":2,"followed":false}}
     * tabInfo : {"tabList":[{"id":0,"name":"首页","apiUrl":"http://baobab.kaiyanapp.com/api/v4/categories/detail/index?id=2"},{"id":1,"name":"全部","apiUrl":"http://baobab.kaiyanapp.com/api/v4/categories/videoList?id=2"},{"id":2,"name":"作者","apiUrl":"http://baobab.kaiyanapp.com/api/v4/categories/detail/pgcs?id=2"},{"id":3,"name":"专辑","apiUrl":"http://baobab.kaiyanapp.com/api/v4/categories/detail/playlist?id=2"}],"defaultIdx":0}
     */

    private CategoryInfoBean categoryInfo;
    private TabInfoBean tabInfo;

    public CategoryInfoBean getCategoryInfo() {
        return categoryInfo;
    }

    public void setCategoryInfo(CategoryInfoBean categoryInfo) {
        this.categoryInfo = categoryInfo;
    }

    public TabInfoBean getTabInfo() {
        return tabInfo;
    }

    public void setTabInfo(TabInfoBean tabInfo) {
        this.tabInfo = tabInfo;
    }

    public static class CategoryInfoBean {
        /**
         * dataType : CategoryInfo
         * id : 2
         * name : 创意
         * description : 技术与审美结合，探索视觉的无限可能
         * headerImage : http://img.kaiyanapp.com/78452493130483ad6416c191b6be4cb6.png
         * actionUrl : eyepetizer://category/2/?title=%E5%88%9B%E6%84%8F
         * follow : {"itemType":"category","itemId":2,"followed":false}
         */

        private String dataType;
        private int id;
        private String name;
        private String description;
        private String headerImage;
        private String actionUrl;
        private FollowBean follow;

        public String getDataType() {
            return dataType;
        }

        public void setDataType(String dataType) {
            this.dataType = dataType;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getHeaderImage() {
            return headerImage;
        }

        public void setHeaderImage(String headerImage) {
            this.headerImage = headerImage;
        }

        public String getActionUrl() {
            return actionUrl;
        }

        public void setActionUrl(String actionUrl) {
            this.actionUrl = actionUrl;
        }

        public FollowBean getFollow() {
            return follow;
        }

        public void setFollow(FollowBean follow) {
            this.follow = follow;
        }

        public static class FollowBean {
            /**
             * itemType : category
             * itemId : 2
             * followed : false
             */

            private String itemType;
            private int itemId;
            private boolean followed;

            public String getItemType() {
                return itemType;
            }

            public void setItemType(String itemType) {
                this.itemType = itemType;
            }

            public int getItemId() {
                return itemId;
            }

            public void setItemId(int itemId) {
                this.itemId = itemId;
            }

            public boolean isFollowed() {
                return followed;
            }

            public void setFollowed(boolean followed) {
                this.followed = followed;
            }
        }
    }

    public static class TabInfoBean {
        /**
         * tabList : [{"id":0,"name":"首页","apiUrl":"http://baobab.kaiyanapp.com/api/v4/categories/detail/index?id=2"},{"id":1,"name":"全部","apiUrl":"http://baobab.kaiyanapp.com/api/v4/categories/videoList?id=2"},{"id":2,"name":"作者","apiUrl":"http://baobab.kaiyanapp.com/api/v4/categories/detail/pgcs?id=2"},{"id":3,"name":"专辑","apiUrl":"http://baobab.kaiyanapp.com/api/v4/categories/detail/playlist?id=2"}]
         * defaultIdx : 0
         */

        private int defaultIdx;
        private List<TabListBean> tabList;

        public int getDefaultIdx() {
            return defaultIdx;
        }

        public void setDefaultIdx(int defaultIdx) {
            this.defaultIdx = defaultIdx;
        }

        public List<TabListBean> getTabList() {
            return tabList;
        }

        public void setTabList(List<TabListBean> tabList) {
            this.tabList = tabList;
        }

        public static class TabListBean {
            /**
             * id : 0
             * name : 首页
             * apiUrl : http://baobab.kaiyanapp.com/api/v4/categories/detail/index?id=2
             */

            private int id;
            private String name;
            private String apiUrl;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getApiUrl() {
                return apiUrl;
            }

            public void setApiUrl(String apiUrl) {
                this.apiUrl = apiUrl;
            }
        }
    }
}
