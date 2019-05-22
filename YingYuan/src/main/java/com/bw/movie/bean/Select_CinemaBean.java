package com.bw.movie.bean;

import java.util.List;

/**
 * @Auther: 白俊岭
 * @Date: 2019/5/13 17:25:03
 * @Description:
 */
public class Select_CinemaBean {
    /**
     * result : [{"address":"朝阳区湖景东路11号新奥购物中心B1(东A口)","commentTotal":166,"distance":0,"followCinema":2,"id":5,"logo":"http://172.17.8.100/images/movie/logo/CGVxx.jpg","name":"CGV星星影城"},{"address":"朝阳区建国路93号万达广场三层","commentTotal":290,"distance":0,"followCinema":2,"id":6,"logo":"http://172.17.8.100/images/movie/logo/wd.jpg","name":"北京CBD万达广场店"},{"address":"北京市朝阳区建国门外大街1号国贸商城区域三地下一层3B120","commentTotal":1,"distance":0,"followCinema":2,"id":7,"logo":"http://172.17.8.100/images/movie/logo/blg.jpg","name":"北京百丽宫影城"},{"address":"北京市朝阳区三丰北里2号楼悠唐广场B1层","commentTotal":0,"distance":0,"followCinema":2,"id":8,"logo":"http://172.17.8.100/images/movie/logo/bn.jpg","name":"北京博纳影城朝阳门旗舰店"},{"address":"北京市崇文区崇文门外大街18号国瑞城首层、地下二层","commentTotal":0,"distance":0,"followCinema":2,"id":9,"logo":"http://172.17.8.100/images/movie/logo/blh.jpg","name":"北京百老汇影城国瑞购物中心店"}]
     * message : 查询成功
     * status : 0000
     */

    private String message;
    private String status;
    private List<ResultBean> result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * address : 朝阳区湖景东路11号新奥购物中心B1(东A口)
         * commentTotal : 166
         * distance : 0
         * followCinema : 2
         * id : 5
         * logo : http://172.17.8.100/images/movie/logo/CGVxx.jpg
         * name : CGV星星影城
         */

        private String address;
        private String commentTotal;
        private int distance;
        private int followCinema;
        private int id;
        private String logo;
        private String name;

        @Override
        public String toString() {
            return "ResultBean{" +
                    "address='" + address + '\'' +
                    ", commentTotal='" + commentTotal + '\'' +
                    ", distance=" + distance +
                    ", followCinema=" + followCinema +
                    ", id=" + id +
                    ", logo='" + logo + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCommentTotal() {
            return commentTotal;
        }

        public void setCommentTotal(String commentTotal) {
            this.commentTotal = commentTotal;
        }

        public int getDistance() {
            return distance;
        }

        public void setDistance(int distance) {
            this.distance = distance;
        }

        public int getFollowCinema() {
            return followCinema;
        }

        public void setFollowCinema(int followCinema) {
            this.followCinema = followCinema;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}