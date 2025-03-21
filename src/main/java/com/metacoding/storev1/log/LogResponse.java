package com.metacoding.storev1.log;

import lombok.Data;

// DTO : Data Transfer Object -> 화면에 필요한 데이터만 있는 오브젝트
// 즉, 비밀번호 등과 같이 보여주고싶지 않은 데이터는 걸러주는 역할을 하는 것
public class LogResponse {
    
    @Data // getter, setter
    public static class ListPage {
        private int id;
        private String name;
        private int qty;
        private int total_price;
        private String buyer;

        @Override
        public String toString() {
            return "ListPage [id=" + id + ", name=" + name + ", qty=" + qty + ", total_price=" + total_price + ", buyer=" + buyer + "]";
        }
        
        public ListPage(int id, String name, int qty, int total_price, String buyer) {
            this.id = id;
            this.name = name;
            this.qty = qty;
            this.total_price = total_price;
            this.buyer = buyer;
        }
    }


}
